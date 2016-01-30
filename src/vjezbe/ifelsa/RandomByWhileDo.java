package vjezbe.ifelsa;

import java.util.Scanner;

public class RandomByWhileDo {
	/*
	 * 2. Odrediti nasumicni broj izmedju 1 i 100 koji korisnik pogada. Korisnik
	 * ima 6 puta pravo pogadjati, reci mu da li je broj tacan, da li je veci
	 * ili manji od unesenog.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gnumber = 0;
		int cnumber = 2;
		int counter = 0;
		System.out.println(cnumber);
		while (counter < 6) {
			System.out.println("Pick any number beetwen 1 & 100");
			counter++;
			gnumber = scan.nextInt();
			if (gnumber > 100 || gnumber < 1) {
				System.out.println("Error number");
			} else {

				if (gnumber == cnumber) {
					System.out.println("Congratulation you hit right number" + " you used " +  counter + " guesses");
					System.out.println("Do you want play again? If it's yes press 1");
					int again = scan.nextInt();
					if (again == 1){
						counter = 0;
					}
						else{
						System.out.println("I hope u enjoyed");
						break;
					}
					
					}

				if (gnumber > cnumber) {
					System.out.println("Your number is greater then requested number");
				}
				if (gnumber < cnumber) {
					System.out.println("Your number is smaller then requested number");
				}
			}

		}

		System.out.println("Game over");

		scan.close();
	}

}
