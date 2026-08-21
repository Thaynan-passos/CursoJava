package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo07 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2026-08-21");
		LocalDateTime d05 = LocalDateTime.parse("2026-08-21T10:30:00");
		Instant d06 = Instant.parse("2026-08-21T10:30:00Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Past week LocalDate: " + pastWeekLocalDate);
		System.out.println("Next week LocalDate: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("Past week LocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("Next week LocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past week Instant: " + pastWeekLocalInstant);
		System.out.println("Next week Instant: " + nextWeekLocalInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("Duration between past week Instant and d05: " + t1.toDays() + " days");
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0 ,0), d04.atTime(0 , 0));
		System.out.println("Duration between past week LocalDate and d04: " + t2.toDays() + " days");
		
		Duration t3 = Duration.between(pastWeekLocalInstant, d06);
		System.out.println("Duration between past week Instant and d06: " + t3.toDays() + " days");
		

	}
}
