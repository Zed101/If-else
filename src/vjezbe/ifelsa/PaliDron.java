package vjezbe.ifelsa;

import java.util.Scanner;

public class PaliDron {
	/*
	 * Program koji ispisuje na ekran da li je dati pozitivni cijeli broj n
	 * palindrom.Palindrom je broj koji ima istu vrijednost gledajući ga sa
	 * desne i sa lijeve strane, npr. 1221, 959, 111 i 10501.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		String number = scan.nextLine();
		System.out.println(number.length());
		int n = Integer.parseInt(number);
		System.out.println(number + "uneseni broj");
		int length = number.length();
		int save = 0;
		String palindom = "";

		while (length != 0) {
			length--;
			save = n % 10;
			n = n / 10;

			palindom += save;
			System.out.println(palindom);

		}
		
		if (palindom.equals(number)) {
			System.out.println("Nuber is palindrom");
		} else {
			System.out.println("Number is not palindom number");
		}

		scan.close();
	}
}
