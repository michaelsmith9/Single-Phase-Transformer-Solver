package complex.test;

import complex.*;

public class SubPhasorsTest {

	public static void main(String[] args) {
		SubPhasors test = new SubPhasors(6, 30, 7, 60);
		
		System.out.println(test.resAng());
		System.out.println(test.resMag());
	}

}
