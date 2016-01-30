package vjezbe.ifelsa;

public class CetverocifreniPalindrom {

	public static void main(String[] args) {

		int temp = 0;
		String palindrom = "";
		for (int i = 1001; i < 10000; i++) {
			temp = i;

			System.out.println(temp + " ovo je temp");
			for (int j = 0; j < 4; j++) {
				palindrom += temp % 10;
				temp = temp / 10;
				System.out.println(temp + "skracen");
				System.out.println(palindrom + " palindrom\n");
			}
			if (i == Integer.parseInt(palindrom)) {
				System.out.println("palizeljks" + i);
			}

		}

	}

}
