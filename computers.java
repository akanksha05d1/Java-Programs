package d1;

public class computers {
	String brand="Lenovo";
	int speed=12000;
	class processor{
		public void displayDetails() {
		System.out.println(brand);
		System.out.println(speed);
		}
	}
	public static void main(String[] args) {
		computers myObj1 = new computers();
		processor myObj=myObj1.new processor();
		myObj.displayDetails();
	}
}

