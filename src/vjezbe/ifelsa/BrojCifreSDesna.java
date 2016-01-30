package vjezbe.ifelsa;

public class BrojCifreSDesna {

	public static void main(String[] args) {

		int number = 978746429;
		int length = String.valueOf(number).length();
		int save = 0;
		int redni = 7;
		String num = "";

		for (int i = 0; i < length; i++) {
			save = number % 10;
			number = number /10;
			num = save + num;
			System.out.println(num + "broj naopako");
			if(redni == i+1){
				System.out.println("Number " + save + " is on " + redni + " digit");
			}
		}
	
		

		// int num = 12345;
		// int length = String.valueOf(num).length();
		//
		// for(int i = length -1; i >= 0; i--){
		// System.out.println(i);
		// }
	}

}
