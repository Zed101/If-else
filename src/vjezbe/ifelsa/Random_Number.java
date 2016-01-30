package vjezbe.ifelsa;

import java.util.Scanner;

public class Random_Number {
/*
 * 2. Odrediti nasumicni broj izmedju 1 i 100 koji korisnik pogada. 
 *    Korisnik ima 6 puta pravo pogadjati,
 *    reci mu da li je broj tacan, da li je veci ili manji od unesenog.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] repeat = new int [6];
		
		
		
		
		
		for (int i = 0; i < repeat.length; i++){
			System.out.println("Pick any number between 1 and 100");
			int gnumber = scan.nextInt();
			if(gnumber < 1 || gnumber > 100){
				System.out.println("Invalid number");
				break;
			}
			int number = (int)(Math.random() * 100) + 1;
			
			
			
			 if( number == gnumber){
			System.out.println("Congratulations you hit right number");
		}
			 if( number > gnumber){
			System.out.println("Incorrect! Your number is smaller than required number");
		}
			 if ( number < gnumber){
			System.out.println("Incorrect! Your number is greater than required number");
		}
			
			
		
		
		}
		scan.close();
	}
	 
}
