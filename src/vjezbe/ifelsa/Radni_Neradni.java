package vjezbe.ifelsa;

import java.util.Scanner;

public class Radni_Neradni {
	/*
	 * Napisati program koji koristi switch komandu i radi sljedeće: Preko
	 * Scanner-a unijeti jedan cijeli broj koji označava dan (1 – Ponedjeljak, 2
	 * – Utorak, ..., 7 – Nedjelja). Na ekran ispisati da li je taj uneseni dan
	 * radni dan ili je vikend dan. Primjer 1: Ulaz je 4. Na konzoli se pojavi
	 * “Work day”. Primjer 2: Ulaz je 6. Na konzoli se pojavi “Weekend”.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter ordinal day number of week");
		int d = scan.nextInt();
	
		switch(d){
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("Work day");	
		break;
	
	}
		
			switch(d){
			
			case 6:
			case 7:
			System.out.println("Weekend day");	
			break;
		
		}
			scan.close();
	}

}
