package pl.javaskills.creditapp;
import  pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.Person;

public class Main {

	public static void main(String[] args) {
		
		ConsoleReader cr =new ConsoleReader();
		Person p;
		p=cr.readInputParameters();
		System.out.println("provided data: ");
		System.out.println("name: " + p.getName());
		System.out.println("last name: " +p.getLastName());

	}
	
}
