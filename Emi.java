package julyassignment;



import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Emi {
	public static void main (String Args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter date in this format yyyy-mm-dd");
		String stringDate = scanner.nextLine();
		System.out.println("enter no. of months to be added");
		long months = scanner.nextLong();
		System.out.println(months+" " +"months before 2014-04-28 will be "+displayDate(stringDate, months));
		scanner.close();
	}
	
public static LocalDate displayDate(String stringDate,long months){
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date = LocalDate.parse(stringDate, formatter);
	
	date = date.minusMonths(months);
	
	return date;
}
}
