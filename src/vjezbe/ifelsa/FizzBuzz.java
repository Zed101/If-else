package vjezbe.ifelsa;

public class FizzBuzz {

	/*
	 * Ako je broj djeljiv sa 3 ispisati Fizz, ako je djeljiv za 5 ispisati
	 * Buzz, ako je djeljiv sa 3 i sa 5 ispisati FizzBuzz
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			System.out.println(fizzBuzz(i));
		}
	}

	private static String fizzBuzz(int n) {
		if(n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz";
		} else if (n % 3 == 0) {
			return "Fizz";
		} else if (n % 5 == 0) {
			return "Buzz";
		}
		return "";
	}

}
