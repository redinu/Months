import java.util.Scanner;

public class NameOfMonths {
	
	static int noOfDays = 30;
	
	public static void main(String[] args){
		
		System.out.print("Please enter the no of Days");
		Scanner scn = new Scanner(System.in);
		noOfDays = scn.nextInt();
		printMonths();
	}
	
	public static void printMonths(){
		
		if (noOfDays == 30 || noOfDays == 31 || noOfDays == 28){
			
			switch (noOfDays){
		
				case 30 : System.out.print("April  June  September  November");
							break;
				case 31 : System.out.print("January  March  May  July  August  October  December");
							break; 
				case 28: System.out.print("February");
		         			break;
			}
		
	
		} else {
			System.out.println("There is no month with only " + noOfDays + " days");
		}
	}
}