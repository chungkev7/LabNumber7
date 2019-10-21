/*
 * @ author: Kevin Chung
 */

package co.grandcircus;

import java.util.Scanner;

public class LabNumber7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a valid name: ");
		boolean correctInput = isValid(scan.nextLine(), "[A-Z][a-z]{1,29}");
		if (correctInput) {
			System.out.println("Name is valid!");
		} else {
			System.out.println("Sorry, name is not valid!");
		}
		
		System.out.println("Please enter a valid email: ");
		correctInput = isValid(scan.nextLine(), "([A-Za-z\\d]{5,30}[@][A-Za-z\\d]{5,10}[.][A-Za-z\\d]{2,3})");
		if (correctInput) {
			System.out.println("Email is valid!");
		} else {
			System.out.println("Sorry, email is not valid!");
		}
		
		System.out.println("Please enter a valid phone number (###-###-####): ");
		correctInput = isValid(scan.nextLine(), "([\\d]{3}[-][\\d]{3}[-][\\d]{4})");
		if (correctInput) {
			System.out.println("Phone number is valid!");
		} else {
			System.out.println("Sorry, phone number is not valid!");
		}
		
		System.out.println("Please enter a valid date (##/##/####): ");
		correctInput = isValid(scan.nextLine(), "([\\d]{2}[/][\\d]{2}[/][\\d]{4})");
		if (correctInput) {
			System.out.println("Date is valid!");
		} else {
			System.out.println("Sorry, date is not valid!");
		}
		
		scan.close();
	}
	
	public static boolean isValid(String name, String regex) {
		return name.matches(regex);
	}
}
