package questao6.desafio3;

import java.util.Scanner;

public class Sessao {
	Scanner ler = new Scanner(System.in);
	
		
	private String nomeFilme;
	private int numeroSala;
	private int hora;
	private boolean poltronas[] = new boolean[100];
	
	public Sessao() {
		
	}
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public Sessao(String nFilme,int hora ,int sala) {
		if(this.checarFilme(nFilme)) {
			this.setNomeFilme(nFilme);
		}
		else
			this.setNomeFilme("default");
		
		this.setNumeroSala(Math.abs(sala));		
		if(hora >=0 && hora<24) {
			this.setHora(hora);
		}
		else
			this.setHora(12);
	}	

	public boolean checarFilme(String str) {		

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
	
	public int checarPoltrona(int escolha) {
		int y=0;
		if(escolha >= 0 && escolha < 99){		
			if(poltronas[escolha] == false) {				
				poltronas[escolha] = true;
				return escolha;
			}
			else				
				for (int i = escolha; i < poltronas.length ; i++) {
					if(poltronas[i]== false) {
						poltronas[i]=true;
						return i;
					}
					else
						y++;
					if(poltronas[i-y]==false) {
						poltronas[i-y]=true;
						return (i-y);
					}
				}
		}
		else
			for (int i = 0; i < poltronas.length; i++) {
				if(poltronas[i]==false) {
					poltronas[i]=true;
					return i;
				}
			}
		return -1;
	}
	
	
	
	public boolean equals(Sessao x) {
		if(this.getNomeFilme().equals(x.getNomeFilme()) && 
				this.getNumeroSala() == x.getNumeroSala() &&
				this.getHora() == x.getHora()) {
				return true;
			}		
		else
			return false;
	}
}
