package complex;

public class DivPhasors {
	private double r1;
	private double r2;
	private double theta1;
	private double theta2;
		
	public DivPhasors(double r1, double theta1, double r2, double theta2) {
		this.r1=r1;
		this.r2=r2;
		this.theta1=theta1;
		this.theta2=theta2;
	}
		
	public double resMag() {
		return this.r1/this.r2;
	}
		
	public double resAng() {
		return this.theta1 - this.theta2;
	}
}
