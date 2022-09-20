/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author David Rodriguez (fep251)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

public class Astronaut {
	private String name;
	private String position;
	
	public Astronaut(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return position + " : " + name;
	}
}