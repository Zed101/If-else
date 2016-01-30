package vjezbe.ifelsa;

import java.util.Scanner;

public class RAndomDooo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gnumber = 0;
		int cnumber = (int)(Math.random() * 100) +1;
		int counter = 6;
		do {
			counter--;
			System.out.println("Pick any number beetwen 1 & 100");
			System.out.println("You have " + counter + " more guesses");
			gnumber = scan.nextInt();
			if (gnumber > 100 || gnumber < 1) {
				System.out.println("Error number");
			} else {
				if (gnumber == cnumber) {
					System.out.println("Congratulations you hit right number");
					System.out.println("Do you want play again? Press 1 if u want!");
					int again = scan.nextInt();
					if (again == 1) {
						counter = 6;
					}
					else{
						System.out.println("Thank u for your time");
						break;
					}
					
				}

				if (gnumber > cnumber) {
					System.out.println("Your number is greater than requested number");
				}
				if (gnumber < cnumber) {
					System.out.println("Your number is greater than requested number");
				}
			}
		}

		while (counter > 0);
		System.out.println("Game over");
		scan.close();
	}

}
