import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Square s1 = new Square("Square");
		s1.setDimensions(0, 0);
		
		Circle c1 = new Circle("Circle");
		c1.setDimensions(0);
		
		Triangle t1 = new Triangle("Triangle");
		t1.setDimensions(0, 0, 0);
		
		EquilateralTriangle t2 = new EquilateralTriangle("Triangle 2");
		t2.setDimensions(0);
		
		System.out.println("Select to set the dimension for shapes:");
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while(choice != 5) {
			System.out.println("1. Set Circle Dimension");
			System.out.println("2. Set Square Dimension");
			System.out.println("3. Set Triangle Dimension");
			System.out.println("4. Set Equililateral Triangle Dimension");
			System.out.println("5. Exit and Display Dimensions");

			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				Scanner console = new Scanner(System.in);
				System.out.println("What is the radius?");
				double radius = console.nextDouble();
				c1.setDimensions(radius);
				break;
			case 2:
				Scanner console2 = new Scanner(System.in);
				System.out.println("What is the length?");
				double length = console2.nextDouble();
				System.out.println("What is the width?");
				double height = console2.nextDouble();
				s1.setDimensions(length, height);
				break;
			case 3:
				Scanner console3 = new Scanner(System.in);
				System.out.println("What is side 1?");
				double side1 = console3.nextDouble();
				System.out.println("What is the side2?");
				double side2 = console3.nextDouble();
				System.out.println("What is the side3?");
				double side3 = console3.nextDouble();
				t1.setDimensions(side1, side2, side3);
				break;
			case 4:
				Scanner console4 = new Scanner(System.in);
				System.out.println("What is the side?");
				double side = console4.nextDouble();
				t2.setDimensions(side);
				break;
				
			case 5:
				break;
			}
			
		}
		s1.printDimensions();
		System.out.println("Square Area: " + s1.getArea());
		
		c1.printDimensions();
		System.out.println("Circle Area: " + c1.getArea());

		t1.printDimensions();
		System.out.println("Triangle Area: " + t1.getArea());
		
		t2.printDimensions();
		System.out.println("EquilateralTriangle Area: " + t2.getArea());

		
	}

}
