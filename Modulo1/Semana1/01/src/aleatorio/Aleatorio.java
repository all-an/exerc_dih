package aleatorio;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		Random r = new Random();
		
		double min = 0, max = 1;
		
		double aleatorio = min + (max - min) * r.nextDouble();
		
		System.out.println(aleatorio);
	}
}
