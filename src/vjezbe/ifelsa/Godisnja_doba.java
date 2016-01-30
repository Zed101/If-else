package vjezbe.ifelsa;

import java.util.Scanner;

public class Godisnja_doba {
	/*
	 * Godišnja doba Program koji, za dati mjesec, odredi, tj. ispiše na ekran,
	 * koje je godišnje doba. Ukoliko neki mjesec ima više godišnje doba uzeti
	 * ono koje ima više dana u tom mjesecu. Uraditi preko if i preko switch
	 * komandi.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter ordinal month number");
		int m = scan.nextInt();
		
	switch (m){
	case 12:
	case 1:
	case 2:
	System.out.println("Winter");
	break;
	
	case 9:
	case 10:
	case 11:
		System.out.println("Autumn");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("Summer");
	case 3:
	case 4:
	case 5:
		System.out.println("Spring");
	default:
		System.out.println("Error");
	}
	scan.close();

	}
	}
