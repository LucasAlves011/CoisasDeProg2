package questao6.desafio3;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Pessoa(String name,LocalDate dataNascimento,String cpf) {
		
		if(this.checar(name) == false) {
			this.setNome("default");			
		}
		this.setNome(name);
		this.idade = Period.between(dataNascimento, LocalDate.now()).getYears();	
		
		if(this.checarCpf(cpf)) {
			this.setCpf(cpf);
		}
		else 
			this.setCpf("00000000000");
	}
	
	
	public boolean checar(String str) {		
		
		if (str.length() == 0 ) {
			return false;
		}		
		for(int i=0;i<str.length();i++) {
			if(str.codePointAt(i) != ' ' ) {
				return true;
			}
		}
		return false;
	}	
	
	public boolean checarCpf(String cpf) {

		if(cpf.length() < 11 || cpf.length() >11) {
			return false;
		}
		for (int i = 0; i < 11; i++) {
			if(cpf.codePointAt(i)< 30 || cpf.codePointAt(i) > 39) {
				return false;
			}
		}
		return true;		
	}
	
}