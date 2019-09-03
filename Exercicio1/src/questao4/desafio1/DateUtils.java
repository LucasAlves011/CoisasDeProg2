package questao4.desafio1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateUtils {

	public int diasUteis(LocalDate DataMenor , LocalDate b) {

		if(DataMenor.compareTo(b) < 0 ) {

			if(DataMenor == null || b == null) {
				return 0;
			}

			int retorno=0;

			for(int i=0;i<=DataMenor.until(b,ChronoUnit.DAYS);i++) {

				if(DataMenor.plusDays(i).getDayOfWeek() == DayOfWeek.SATURDAY ||
						DataMenor.plusDays(i).getDayOfWeek() == DayOfWeek.MONDAY)	{
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
}


