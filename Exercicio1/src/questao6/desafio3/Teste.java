package questao6.desafio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Sessao desativada = new Sessao("Inválido",1,0);
				
		LocalDate datap2 = LocalDate.of(2010, 5, 23);
		LocalDate datap3 = LocalDate.of(1988, 2, 26);
		LocalDate datap4 = LocalDate.of(1973, 1, 9);
		LocalDate datap5 = LocalDate.of(1994, 11, 16);
		
		RepositorioIngressos sinal = new RepositorioIngressos();
		
		Pessoa p1 = new Pessoa("Lucas", 11, 11, 1998,"70167533287");
		Pessoa p2 = new Pessoa("Matheus", datap2, "28709840060");
		Pessoa p3 = new Pessoa("Luis", datap3, "69658389066");
		Pessoa p4 = new Pessoa("Otávio", datap4, "82703752091");
		Pessoa p5 = new Pessoa("Larrisa", datap5, "11085505090");
		
		Sessao s1 = new Sessao("Meninas Malvadas", 12, 1);
		Sessao s2 = new Sessao("Django Livre", 15, 2);
		Sessao s3 = new Sessao("Harry Potter", 14, 3);
		
		Ingresso i1 = new Ingresso(p1, s1,32);
		Ingresso i2 = new Ingresso(p2,s1,30);
		Ingresso i3 = new Ingresso(p3,s3,10);
		Ingresso i4 = new Ingresso(p4,s1,87);
		Ingresso i5 = new Ingresso(p5,s2,40);		
		
		sinal.add(i1);
		sinal.add(i2);
		sinal.add(i3);
		sinal.add(i4);
		sinal.add(i5);
		
		System.out.println("Todos os ingressos vendidos: \n\n"+sinal.retornar());
		
		System.out.println("\n\n----------------------------------------------------------------");
		System.out.println("Ingressos vendidos para o filme Meninas Malvadas:\n\n"+sinal.ret("Meninas Malvadas"));
		System.out.println("\n\n----------------------------------------------------------------");
		System.out.println("Ingressos vendidos para o filme Django Livre:\n\n"+sinal.ret("Django Livre"));
		System.out.println("\n\n----------------------------------------------------------------");
		System.out.println("Ingressos vendidos para o filme Harry Potter:\n\n" + sinal.ret("Harry Potter"));
		
		
		
	}
}
