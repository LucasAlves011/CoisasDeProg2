package questao4.desafio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import questao5desafio2.Periodo;

public class DateUtils {

	public int diasUteis(LocalDate DataMenor , LocalDate b) {

		if(DataMenor.compareTo(b) < 0 ) {

			if(DataMenor == null || b == null) {
				return 0;
			}

			int retorno=0;

			for(int i=0;i<=DataMenor.until(b,ChronoUnit.DAYS);i++) {

				if(DataMenor.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY ||
						DataMenor.plusDays(i).getDayOfWeek() == DayOfWeek.SUNDAY)	{
				}
				else
					retorno++;
			}
			return Math.abs(retorno);
		}
		else if(DataMenor.compareTo(b) >0) {
			
			if(DataMenor == null || b == null) {
				return 0;
			}

			int retorno=0;

			for(int i=0;i<=b.until(DataMenor,ChronoUnit.DAYS);i++) {

				if(b.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY ||
						b.plusDays(i).getDayOfWeek() == DayOfWeek.MONDAY)	{
				}
				else
					retorno++;
			}
			return Math.abs(retorno);

		}
		else
			return 0;
	}
	
	public boolean checarPeriodo(Periodo x , Periodo y) {
		
		long po = x.getDataInicio().compareTo(y.getDataInicio());
		
		if(po == 0){
			return true;
		}		
		else if(po < 0) {
			int aux = (int) x.getDataInicio().until(x.getDataFinal(), ChronoUnit.DAYS);
			for(int i=0;i<aux;i++) {
				if(x.getDataInicio().plusDays(i).equals(y.getDataInicio())) {
					return true;
				}
			}
		}		
		else if(po > 0) {
			int aux = (int) y.getDataInicio().until(x.getDataInicio(), ChronoUnit.DAYS);
			for(int i=0;i<aux;i++){
				if(y.getDataInicio().plusDays(i).equals(x.getDataInicio())) {
					return true;
				}
			}
		}
		 
			return false;
		
	}
	
}


