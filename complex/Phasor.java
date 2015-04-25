package complex;

public class Phasor {
	
	private double r;
	private double angle;
	
	public Phasor(double r, double angle) {
		this.r = r;
		this.angle = angle;
	}
	
	public double angle() {
		return this.angle;
	}
	
	public double r() {
		return this.r;
	}

}
