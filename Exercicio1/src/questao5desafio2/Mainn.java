package questao5desafio2;

import java.time.LocalDate;

public class Mainn {

	public static void main(String[] args) {
		
		LocalDate menor = LocalDate.now();
		LocalDate maior = LocalDate.of(2019, 10, 10);
		
		System.out.println(menor.compareTo(maior));// A < B
		System.out.println(maior.compareTo(menor));// A > B
				
		
		
		
		
	}
	
}
