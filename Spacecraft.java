/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author David Rodriguez (fep251)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

public class Spacecraft {
	private String name;
	private String type;
	private int number;
	
	public Spacecraft(String name, String type, int number) {
		this.name = name;
		this.type = type;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return type + "(" + number + "): " + name;
	}
}
