package vjezbe.ifelsa;

public class TrocifreniProsti {

	public static void main(String[] args) {

		boolean p = true;

		for (int i = 100; i < 1000; i++) {
			p = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					p = false;
				}

			}
			if (p) {
				System.out.println(i);
			}

		}

	}

}
