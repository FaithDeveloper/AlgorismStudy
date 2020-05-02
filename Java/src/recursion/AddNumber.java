package recursion;

public class AddNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(position);
		System.out.print("SUM = "+sum);
	}
	
	public static int sum = 0;
	public static int position = 1;
	public static int lastPosition = 3;
	public static void add(int i) {
		sum += i; 
		if(position < lastPosition) {
			++position;
			add(position);
		}
	}
}
