package transformer;

public class TransformerTest {

	public static void main(String[] args) {
		Transformer test = new Transformer(2000, 8000/240, 15, 120, 200000, 120000,
				0.02, 0.15, 0.8, 240);
		
		System.out.printf("Efficiency: %3.3f\n", test.efficiency());
		System.out.printf("Regulation: %3.3f\n", test.regulation());
		System.out.printf("pLoad: %3.3f\n", test.pLoad());
	}

}
