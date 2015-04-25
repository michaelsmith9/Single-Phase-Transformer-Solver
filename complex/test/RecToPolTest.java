package complex.test;

import complex.RecToPol;
import java.lang.Math;

public class RecToPolTest {

	public static void main(String[] args) {
		RecToPol d = new RecToPol(3, 4);
		
		System.out.println(d.magnitude());
		
		System.out.println(d.angleRad());
		System.out.println(d.angleDeg());
		
		RecToPol c = new RecToPol(4, 5);
		System.out.println(c.magnitude());
		
		System.out.printf("%3.3f\n", c.magnitude());
		
		System.out.println(Math.acos(0.95));
	}

}
