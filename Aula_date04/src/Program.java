import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");// so as datas
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //data, hora e segundos
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //data, hora e segundos e furo horario de londres
		
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		System.out.println("PastWeekLocalDate = " +  pastWeekLocalDate);
		System.out.println("NextWeekLocalDate = " +  nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("PastWeekLocalDateTime = " +  pastWeekLocalDateTime);
		System.out.println("NextWeekLocalDateTime = " +  nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " +  pastWeekInstant);
		System.out.println("nextWeekInstant = " +  nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T3 dias = " + t3.toDays());
		System.out.println("T4 dias = " + t4.toDays());
		
		
		
		
	}

}
