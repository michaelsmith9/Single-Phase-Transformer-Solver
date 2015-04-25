package complex;

import java.lang.Math;

/**
 * Class for converting polar to rectangular coordinates polar form
 * r*e^*(jtheta) where j is complex
 * 
 * @author Michael Smith
 * @version 0.1
 */
public class PolToRec {

	// class variable for magnitude
	private double r;
	// class variable for angle
	private double theta;
	// class variable selects whether input angle is degrees or radians
	private int sel;

	/**
	 * Constructor taks maginutde, angle and sel to tell if angle is in deg or
	 * rad. If sel == 0, then rad, if sel == 1 then deg.
	 * 
	 * @param r
	 * @param theta
	 * @param angSel
	 */
	public PolToRec(double r, double theta, int sel) {
		this.r = r;
		this.theta = theta;
		this.sel = sel;
	}

	/**
	 * Returns x component of rectangular form of phasor
	 * 
	 * @return x component as double
	 */
	public double xComponent() {
		if (sel == 0) {
			return r * Math.cos(theta);
		} else {
			return r * Math.cos(degToRad(theta));
		}
	}

	/**
	 * Returns y component of rectangular form of phasor
	 * 
	 * @return y component as double
	 */
	public double yComponent() {
		if (sel == 0) {
			return r * Math.sin(theta);
		} else {
			return r * Math.sin(degToRad(theta));
		}
	}

	/**
	 * Converts degrees to radians for calculations
	 * 
	 * @param angle
	 *            in degrees
	 * @return angle in radians as double
	 */
	public double degToRad(double angle) {
		return angle * Math.PI / 180;
	}

}
