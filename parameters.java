package practice_problems;

public class parameters {
	int x;
	public parameters(int y) {
		x=y;
	}
	public static void main(String[] args) {
		parameters myObj = new parameters(10);
		System.out.println(myObj.x);
	}
	

}
