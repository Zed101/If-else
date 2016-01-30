package vjezbe.ifelsa;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check if it's prime number");
		int input = scan.nextInt();

		if (input == 2 || input == 3 || input == 5) {
			System.out.println("Prime number");
		} else if (input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 9 == 0) {
			System.out.println("Not prime number");
		} else {
			System.out.println(" Prime number");
		}
		scan.close();
	}

}
