
public class Triangle extends Shape{
	private double side;
	private double side1;
	private double side2;
	
	public Triangle(String name) {
		super(name);
	}
	
	public void setDimensions(double side, double side1, double side2) {
		this.side = side;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Side 1 : " + side + " Side 2:" + side1 + " Side 3: " + side2);
	}
	
	@Override
	public double getArea() {
		double s = 0.5 * (side + side1 + side2);
		return Math.pow(s * (s - side) *(s - side1) * (s - side2), 0.5);
	}


	
	
}
