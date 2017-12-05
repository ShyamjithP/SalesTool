package ca.demo.salestool;

public class mainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salesData data=new salesData();
		displayGreeting();
		data.display();
	}

	private static void displayGreeting() {
		System.out.println("Hello happy sales people");
		System.out.println("this app shows sales data");
		System.out.println("hai this is a new line");
	}
}
