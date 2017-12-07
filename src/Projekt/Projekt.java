package Projekt;

import java.util.Scanner;

public class Projekt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indtast venligst din alder - så svarer jeg om du er myndig endnu");
		
		int alder = scan.nextInt();
			
		if (alder<18) {
			System.out.println("Du er ikke myndig");
		}
		if (alder>=18) {
			System.out.println("Du er myndig");
		}
		
		System.out.println("Indtast nu dit fornavn, så fortæller jeg længden af det.");
		
		
		String navn = scan.next();
		
		int længde = navn.length();
		System.out.println("Dit fornavn er "+længde+" bogstaver langt.");
		
}
}
