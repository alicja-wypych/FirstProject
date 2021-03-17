package pl.javaskills.creditapp.core;

public class Person {

	
	// want to have always those three fields filled.
	// having fields as final- they must be initialized in constructor.
	
	private final String  name;
	private final String lastName ; 
	private final String mothersMaidenName;  
	

	public Person(String name, String lastName, String mothersMaidenName){
		
		this.name=name;
		this.lastName=lastName;
		this.mothersMaidenName=mothersMaidenName;
		
	}
	
	public String getName() { return this.name; }
	public String getLastName() { return this.lastName;}	
	
	
	
	
	
}