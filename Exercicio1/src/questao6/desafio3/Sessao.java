package questao6.desafio3;

public class Sessao {
	
	
	private String nomeFilme;
	private int numeroSala;
	private int hora;
	
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
		
		this.setNumeroSala(sala);		
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
}
