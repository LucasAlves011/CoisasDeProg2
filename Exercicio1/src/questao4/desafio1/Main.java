package questao4.desafio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	DateUtils sinalizador = new DateUtils();
	
	int dia[] = new int[2];
	int mes[] = new int[2];
	int ano[] = new int[2];
	LocalDate data[] = new LocalDate[2];
	
	
	for(int l=0;l<=2;l++) {
	
		for(int i=0;i<=1;i++) {
			System.out.printf("Digite a "+ (i+1) + "º data: dia/mês/ano\n");
				dia[i]=ler.nextInt();
				mes[i]=ler.nextInt();
				ano[i]=ler.nextInt();
	
				data[i] = LocalDate.of(ano[i], mes[i], dia[i]);
	
			}
	
			System.out.println("Dias uteis :"+sinalizador.diasUteis(data[0], data[1]));;
	
	
		}
	}
	

}
