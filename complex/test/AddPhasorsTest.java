package complex.test;

import complex.*;

public class AddPhasorsTest {

	public static void main(String[] args) {
		
		AddPhasors test = new AddPhasors(6, 30, 7, 60);
		
		System.out.printf("%3.3f\n", test.resAng());
		System.out.printf("%3.3f", test.resMag());

	}

}
