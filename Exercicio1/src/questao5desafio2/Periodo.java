package questao5desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Periodo {

	DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yy");
	
	private LocalDate dataInicio;
	private LocalDate dataFinal;
		
	public LocalDate getDataInicio() {
		return dataInicio;
	}	
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}	

	public Periodo(LocalDate dataInicio, LocalDate dataFinal) {
		if(dataInicio.equals(null)) {
			System.out.println("Objeto nulo, tente outros valores");
		}		
		else if(dataFinal.equals(null)) {
			this.dataInicio = dataInicio;
			this.dataFinal = null;

		}	
		else if(dataInicio.compareTo(dataFinal) <= 0) {
			this.dataInicio = dataInicio;
			this.dataFinal = dataFinal ;		
		}
		else {
			System.out.println("Datas inválidas, como medida de segurança "
					+ "seu periodo foi alterado para HOJE (" + LocalDate.now()+")");
			this.dataFinal=LocalDate.now();
			this.dataInicio= LocalDate.now();
		}
	}

	@Override
	public String toString() {
		return "Periodo: "+ dataInicio.format(forma) + " --> " + dataFinal.format(forma) ;
	}
	
}
