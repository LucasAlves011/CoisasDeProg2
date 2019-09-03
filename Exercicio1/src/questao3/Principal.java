package questao3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		LocalDate data ;
		LocalDate hoje = LocalDate.now();
		Period tempo;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
	
		int dia,ano,mes;
		
		System.out.println("\t\tDigite sua data de nascimento: \nDigite um dia");
		dia = ler.nextInt();
		System.out.println("Digite um mês");
		mes = ler.nextInt();
		System.out.println("Digite um ano");
		ano = ler.nextInt();
		
		data = LocalDate.of(ano, mes, dia);
		
		tempo = Period.between(data, hoje);
		System.out.println(tempo);
		
		System.out.println("Dia do seu primeiro aniversário: "+data.plusYears(1).getDayOfWeek());
		
		//Se eu somasse 17 anos ao objeto data  daria errado , ja que 
		//o objeto do tipo LocalDate é imutavel.Isso significa que ,
		//usar o metodo de somar um ano ao objeto , não altera o valor
		//do mesmo , mas sim retorna uma referencia a outro objeto com a data modificada,
		//Em outras palavras a variável data não muda de valor .
		System.out.println("Seu aniversário de 18 anos foi em :" +data.plusYears(18).getDayOfWeek());
		

	}

}
