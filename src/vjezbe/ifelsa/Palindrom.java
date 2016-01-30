package vjezbe.ifelsa;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number");
		String inputNumber = scan.nextLine();
		String palindomNumber = "";
		int length = inputNumber.length();
	
		do{
		
		palindomNumber += inputNumber.charAt(length -1);
		length--;
			System.out.println("palindrom " + palindomNumber );
		}while(length != 0);
	
		if (inputNumber.equals(palindomNumber)){
			System.out.println("palindrom");
		}else{
			System.out.println("is not palindrom");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
