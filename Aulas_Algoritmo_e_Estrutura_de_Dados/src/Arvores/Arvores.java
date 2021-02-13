package Arvores;

public class Arvores {

	public static void main(String[] args) {
		
		double[] temperatura = new double[365];
		
		for (int i = 0; i < temperatura.length; i++) {
			int rnd = (int) (1 + Math.random() *45);
			temperatura[i] = rnd;
			
		}
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("A temperatura média verificada no dia " + (i+1) + " foi: " + temperatura[i]);
			
		}
		
		System.out.println("Quantidades de dias avliados: " + temperatura.length);
	}

}
