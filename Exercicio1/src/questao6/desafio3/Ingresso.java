package questao6.desafio3;

public class Ingresso {

	Sessao pad = new Sessao("default", 0, 0);
	
	private Pessoa cliente;
	private Sessao sessao;
	private int poltrona;	
	
	public Ingresso(Pessoa cliente, Sessao sessao, int poltrona) {
		if(cliente.getIdade() >= 16) {
		this.cliente = cliente;
		this.sessao = sessao;
		this.poltrona=sessao.checarPoltrona(poltrona);
		}	
		else {
			this.cliente=cliente;
			this.sessao=pad;
			this.poltrona=0;
		}
			
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Sessao getSessao() {
		return sessao;
	}
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	public int getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	@Override
	public String toString() {
		return "Ingresso: \n" + this.getCliente() + "\nFilme :"+
	sessao.getNomeFilme() + "\nSala: " + sessao.getNumeroSala() + "\n\n";
	}
		
}
