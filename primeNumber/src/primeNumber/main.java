package primeNumber;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.print("welcome to prime number test. Enter your number: ");
		number = scan.nextInt();
		boolean isPrime = true;
	
		if (number==1) {
			System.out.println(number +" is not prime");
			return;
		}
		
		if (number<1) {
			System.out.println(number + " is invalid");
			return;
		}	
		for ( int i=2; i<number; i++) {
			
			if(number%i == 0) {
				System.out.println();
				isPrime=false;
			}
		}
	
		if (isPrime) {
			System.out.println(number + " is a prime number");
		}
		else 
		{
			System.out.println(number + " is not a prime number");
		}		
	}
}
