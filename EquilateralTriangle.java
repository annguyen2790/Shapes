
public class EquilateralTriangle extends Triangle{
	private double side;
	
	public EquilateralTriangle(String name) {
		super(name);
	}
	
	public void setDimensions(double side) {
		this.side = side;
	}
	@Override
	public void printDimensions() {
		System.out.println("Side 1 : " + this.side + " Side 2:" + this.side + " Side 3: " + this.side);
	}
	
	@Override
	public double getArea() {
		double s = 0.5 * (side * 3);
		return Math.pow(s * (s - this.side) *(s - this.side) * (s - this.side), 0.5);
	}
}
