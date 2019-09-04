package questao5desafio2;

import java.time.LocalDate;
import java.util.Scanner;

import questao4.desafio1.DateUtils;

public class Mainn {	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			
		int[] dia = new int[2];
		int[] mes = new int[2];
		int[] ano = new int[2];
		LocalDate k[] = new LocalDate[2];
		Periodo pe[] = new Periodo[2];
		DateUtils sinalizador = new DateUtils();
		
		for(int x=0;x<2;x++) {		
			for(int i=0;i<2;i++) {
				System.out.printf("Digite a data de inicio do periodo. \nDia mes ano:");

				dia[i]=ler.nextInt();
				mes[i]=ler.nextInt();
				ano[i]=ler.nextInt();
				
				k[i] = LocalDate.of(ano[i], mes[i], dia[i]);
			}
			pe[x] = new Periodo(k[0],k[1]);					
		}
		
		System.out.println(sinalizador.checarPeriodo(pe[0], pe[1]));
		

	}
	
}
