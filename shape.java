package d1;

class shapes {
	int length=5,breadth=10;
	int area;
	public void getArea() {
		System.out.println(area);
	}
}
class rectangle extends shapes{
	public void getArea() {
	area=length*breadth;
	System.out.println(area);
	}
}
public class shape {
	public static void main(String[] args) {
		rectangle s1 = new rectangle();
		s1.getArea();
	}
}

