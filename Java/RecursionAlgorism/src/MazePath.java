public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMazePath(0, 0);
		printMazePath();
	}
	
	/**
	* 미로 보여주기
	**/
	public static void printMazePath(){
	    System.out.println("##############");
	    for(int[] data : maze){
	        System.out.printf("## ");
	        for(int item : data){
	            System.out.printf(String.format("%d", item));
	        }
	        System.out.println(" ##");
	    }
	    System.out.println("##############\n");
	}
	
	static int N = 8;
	static int[][] maze = new int[][] {
		{0, 0, 0, 0, 0, 0, 0, 1},
		{0, 1, 1, 0, 1, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 0, 0, 1, 1, 0, 0},
		{0, 1, 1, 1, 0, 0, 1, 1},
		{0, 1, 0, 0, 0, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 1, 1, 0, 1, 0, 0}
	};
	static int PATHWAY_COLOUR = 0;
	static int BLOCKED_COLOUR = 1;
	static int PATH_COLOUR = 2;
	
	/**
	 * 미로찾기  
	 * */
	 public static boolean findMazePath(int x,  int y) {
		 // 무한으로 가지 않기 위해 
		 if (x <0 || y < 0 || x >= N || y >= N) {
			 return false;
		 }else if (maze[x][y] != PATHWAY_COLOUR) {
			 return false;
		 }else if (x == N -1 && y == N - 1) {
			 maze[x][y] = PATH_COLOUR;
			 return true;
		 }else {
			 maze[x][y] = PATH_COLOUR;
			 if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y + 1)) {
				 return true;
			 }
			 maze[x][y] = BLOCKED_COLOUR;
			 return false;
		 }
	 }
	
	

}
