package complex.test;

import complex.*;

public class MultDivTest {

	public static void main(String[] args) {
		MultPhasors test = new MultPhasors(5, 30, 6, 50);
		System.out.println("Mult:");
		System.out.println(test.resAng());
		System.out.println(test.resMag());
		
		DivPhasors test2 = new DivPhasors(5, 30, 6, 50);
		System.out.println("Div:");
		System.out.println(test2.resAng());
		System.out.println(test2.resMag());

	}

}
