package vjezbe.ifelsa;

import java.util.Scanner;

public class Vjezba1 {
/*
 * BMI KALKULATOR
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your weight");
		double kg = scan.nextDouble();
		System.out.println("Enter your height");
		double m =  scan.nextDouble();
 
		double m2 = m * m;
		double bmi = kg/ m2;
		
		if(bmi <= 18){
			System.out.println(" Your BMI is" + bmi + " " +"LOW");
		}	
			else if(bmi  > 18 && bmi <= 25){
			System.out.println("BMI is" + bmi + " " + "NORMAL");
			}
			else if(bmi > 25  && bmi <= 30){
				System.out.println("BMI  is" + bmi + " " +"HIGHER");
			}	
			else if(bmi > 30  && bmi <= 40){
			System.out.println("Your BMI is" + bmi + " " + "Fat");
		}	
			else if(bmi > 40){
			System.out.println("Your BMI id" + bmi + " " + "Obese");
		} 
	
		scan.close();
	}
	}
    
