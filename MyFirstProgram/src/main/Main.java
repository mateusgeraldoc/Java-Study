package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//scanner
		Scanner scanner = new Scanner(System.in);
		
		//print and variables
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What your favorite color?");
		String color = scanner.nextLine();
		
		//console:
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Favorite Color: "+color);
	}
}
