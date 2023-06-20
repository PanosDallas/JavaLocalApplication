import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static final DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static final DateTimeFormatter dtfrm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public static final LocalDate election =LocalDate.parse("21/05/2023",frm); 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Tha deixoume me merikes aples syanretiseis metatropi STring --> LocalDate & LocalDateTime
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Dose imerominia anaxorisis ");
			String dateS = sc.nextLine();
			System.out.print("Dose imerominia kai ORA rantevou ");
			String app = sc.nextLine();
			try {
			    LocalDate date = LocalDate.parse(dateS,frm);
			    LocalDateTime appoint = LocalDateTime.parse(app,dtfrm);
			System.out.println("H imerominia poy pliktrologises = "+date);
			System.out.println("H imerominia poy pliktrologises = "+date.format(frm));
			System.out.println("H imerominia poy pliktrologises = "+appoint);
			System.out.println("H mera tou mina tha einai  = "+date.getDayOfMonth());
			System.out.println("H mera tou xronou tha einai  = "+date.getDayOfYear());
			System.out.println("H mera tis evdomadas tha einai  = "+date.getDayOfWeek());
			System.out.println("Apo tis ekloges kai "+(date.isBefore(election) ? "PRIN":"META"));
			}
			catch(DateTimeParseException e) {
				System.out.println("Mh apodekti morfi imerominias -oras");
			}
			
		}while(true);
	
	}

}

/*
Pattern				Example date string
yyyy-MM-dd			2019-03-29
dd-MMM-yyyy			29-Mar-2019
dd/MM/yyyy			29/03/2019
E, MMM dd yyyy		Fri, Mar 29 2019

*/