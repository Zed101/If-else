package vjezbe.ifelsa;

import java.util.Scanner;

public class Rodjendani {
	/*
	 * Program koji sadrži datum jednog rođendana (dan, mjesec, godina).
	 * Ispisati sve rođendane koje je ta osoba imala do danas.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter date of your birthday DD/MM/YYYY");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		int counter = 0;

		while (year != 2015) {
			year++;
			counter++;
			System.out.println(counter + "." + " birthay" + " was on" + "  " + day + ". " + month + ". " + year + ".");
		}
		System.out.println();
		System.out.println("Count of your birthdays is " + counter);

		scan.close();
	}

}
