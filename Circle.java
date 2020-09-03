
public class Circle extends Shape {
	private double radius;
	
	public Circle(String name) {
		super(name);
	}
	
	public void setDimensions(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Circle Radius: " + this.radius);
	}
	
	@Override
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}
