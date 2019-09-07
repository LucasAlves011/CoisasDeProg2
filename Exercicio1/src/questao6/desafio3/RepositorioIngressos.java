package questao6.desafio3;

import java.awt.List;
import java.util.ArrayList;

public class RepositorioIngressos {

	private ArrayList<Ingresso> array;
	
	public RepositorioIngressos() {
		this.array = new ArrayList<Ingresso>();
	}
	
	public void add(Ingresso x) {
		array.add(x);	
	}
	public ArrayList retornar() {
		return array;
	}
	
	public ArrayList ret(String nome) {
		
		ArrayList<Ingresso> retorno = new ArrayList<Ingresso>();				
		
		for (Ingresso x:array) {
			if(x.getSessao().getNomeFilme().equals(nome)) {
				retorno.add(x);
			}
		}
		return retorno;
	}
	
}
