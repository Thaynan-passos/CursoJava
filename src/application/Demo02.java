package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo02 {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-08-28");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-28T15:30:00");
		Instant d06 = Instant.parse("2024-08-28T15:30:00Z");
		Instant d07 = Instant.parse("2024-08-28T15:30:00-03:00");
		
		LocalDate d08 = LocalDate.parse("28/08/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("28/08/2024 15:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 8, 28);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 28, 15, 30);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		
	}

}
