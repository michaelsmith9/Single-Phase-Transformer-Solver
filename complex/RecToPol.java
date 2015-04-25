package complex;

import java.lang.Math;

/**
 * A class for converting complex rectangular to polar
 * 
 * @version 0.1
 * @author Michael Smith
 */
public class RecToPol {
	// class variable real part
	private double x;

	// class variable imaginary part
	private double y;

	/**
	 * Constructor for RecToPol class
	 * 
	 * @param x
	 *            : real part
	 * @param y
	 *            : imaginary part
	 */
	public RecToPol(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Method for returning magnitude
	 * 
	 * @return magnitude (double)
	 */
	public double magnitude() {
		double MAG = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		return MAG;
	}

	/**
	 * Method for returning angle (radians)
	 * 
	 * @return angle in radians (double)
	 */
	public double angleRad() {
		double tanIn = y / x;
		double angle = Math.atan(tanIn);
		return angle;
	}

	/**
	 * Method returns angle in degrees
	 * 
	 * @return angle in degrees (double)
	 */
	public double angleDeg() {
		double rad = angleRad();
		return rad * 180.0 / Math.PI;
	}
}
