package complex.test;

import complex.PolToRec;
import complex.RecToPol;

public class PolToRecTest {

	public static void main(String[] args) {
		PolToRec d = new PolToRec(6.0, 60, 1);
		
		PolToRec e = new PolToRec(8.0, 20, 1);
		
		double f = d.xComponent() + e.xComponent();
		
		double g = d.yComponent() + e.yComponent();
		
		RecToPol h = new RecToPol(f, g);
		
		System.out.println("magnitude: "+h.magnitude());
		System.out.println("angle: "+h.angleDeg());
		
		}

}
