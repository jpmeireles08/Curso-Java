package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-01-01");
		LocalDateTime d05 = LocalDateTime.parse("2025-01-01T01:30:26");
		Instant d06 = Instant.parse("2025-01-01T01:30:26Z");
		Instant d07 = Instant.parse("2025-01-01T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("13/01/2025", fmt1);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println();
		System.out.println(d04.format(fmt2));
		System.out.println(fmt2.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));	
		
		System.out.println();
		System.out.println(d05.format(fmt2));
		System.out.println(d05.format(fmt3));
		
		System.out.println();
		System.out.println(fmt4.format(d06));
	}

}
