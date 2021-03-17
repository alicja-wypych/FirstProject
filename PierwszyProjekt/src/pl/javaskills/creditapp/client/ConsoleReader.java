package pl.javaskills.creditapp.client;
import java.util.Scanner;

import  pl.javaskills.creditapp.core.Person;

public class ConsoleReader {

	
	public Person readInputParameters() {
		
		String pName;
		String pLastName;
		String pMothersMaidenName;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide name: ");
		pName= in.next();
		System.out.println("Please provide last name: ");
		pLastName= in.next();
		System.out.println("Please provide mothers maiden name: ");
		pMothersMaidenName= in.next();
		
	
		return new Person(pName,pLastName,pMothersMaidenName);
		
	}
}
