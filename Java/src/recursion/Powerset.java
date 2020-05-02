package recursion;

public class Powerset {
	static boolean[] hasThis;
	static char[] datas = new char[] {'a', 'b', 'c', 'd','e'};
	// 먹집합 알고리즘
	// 먹집합 알고리즘은 2^n을 값을 갖고있다. 
	// 자신을 포함하는 경우와 포함하지 않는 경우로 나눠진다.
	private static void checkUp(int position) {
		if (position == hasThis.length - 1) {
			System.out.print("{");
			int pos = 0;
			for (boolean hThis : hasThis) {
				if (hThis) {
					System.out.print(datas[pos]);
//					System.out.print(",");
				}
				pos++;
			}
			System.out.print("}");
			return;
		}
		
		hasThis[position] = true;
		checkUp(position + 1);
		
		hasThis[position] = false;
		checkUp(position + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasThis = new boolean[3];
		checkUp(0);
	}
	

}
