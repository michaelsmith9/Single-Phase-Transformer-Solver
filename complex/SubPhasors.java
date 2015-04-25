package complex;

public class SubPhasors {
	
	private double r1;
	private double r2;
	private double theta1;
	private double theta2;
	private RecToPol sum;
	
	public SubPhasors(double r1, double theta1, double r2, double theta2) {
		this.r1=r1;
		this.r2=r2;
		this.theta1=theta1;
		this.theta2=theta2;
		
		PolToRec num1 = new PolToRec(this.r1, this.theta1, 1);
		PolToRec num2 = new PolToRec(this.r2, this.theta2, 1);
		
		double xSum = num1.xComponent()-num2.xComponent();
		double ySum = num1.yComponent()-num2.yComponent();
		
		sum = new RecToPol(xSum, ySum);
	}
	
	public double resMag() {
		return sum.magnitude();
	}
	
	public double resAng() {
		return sum.angleDeg();
	}

}
