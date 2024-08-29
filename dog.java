package d1;

public class dog {
	String name;
	String colour;
	public dog (String n,String c) {
		name=n;
		colour=c;
	}
	public static void main(String[] args) {
		dog myObj = new dog("Husky","Brown");
		System.out.println(myObj.name);
		System.out.println(myObj.colour);
	}
	
}
