
public class Square extends Shape {
	private double length;
	private double height;
	
	public Square(String name) {
		super(name);
	}
	
	
	public void setDimensions(double length, double height) {
		this.length = length;
		this.height = height;
	}
	@Override
	public void printDimensions() {
		System.out.println("Square Dimension: " + "L: " + length + " x " + "H: " +height );
	}
	
	@Override
	public double getArea() {
		return length * height;
	}
	
}
