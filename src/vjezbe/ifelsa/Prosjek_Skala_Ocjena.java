package vjezbe.ifelsa;

import java.util.Scanner;

public class Prosjek_Skala_Ocjena {
	/*
	 * 1. Traziti od korisnika da unese tri ocjene od 6 do 10,
	 *  izracunati prosjek i na osnovu prosjeka ispisati da li je ocjena A, B, C, D, E ili F.
	 *   Neku ljestvicu po procentima skontati.
	 */

	public static void main(String[] args) {
	 Scanner scan= new Scanner (System.in);
	 System.out.println( "Please enter mark I");
	 double mark1 = scan.nextDouble();
	 System.out.println( "Please enter mark II");
	 double mark2 = scan.nextDouble();
	 System.out.println( "Please enter mark III");
	 double mark3 = scan.nextDouble();
	 
	 double average = (mark1 + mark2 + mark3)/3;
	 
	 System.out.println("Your average mark is" + " " + average);
	 
	 if (average == 5) {
		 
		 System.out.println( "And your student category is (unsatisfactory) FX");
	 }
	 if( average > 5 && average <= 6 )	{
		 System.out.println( "And your student category is (satisfying) E");
	 }
	 if(average > 6 && average <= 7){
		 System.out.println( "And your student category is (satisfactory) D");
	 }
	 if (average > 7 && average <= 8){
		 System.out.println( "And your student category is (good) C");
	 }
	 if (average > 8 && average <= 9){
		 System.out.println( "And your student category is (very good) B");
	 }
	 if(average > 9 && average <= 10){
		 System.out.println( "And your student category is (excellent) A");
	 }
	 scan.close();

	}

}
