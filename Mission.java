/**
 * Lab1 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author David Rodriguez (fep251)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

//declarations
public class Mission {
	private String name;
	private String operator;
	private int year;
	private String type;
	private Spacecraft[] spacecrafts;
	private Astronaut[] crew;
	
	//
	public Mission(String name, String operator, int year, String type) {
		this.name = name;
		this.operator = operator;
		this.year = year;
		this.type = type;
		this.spacecrafts = new Spacecraft[2];
		this.crew = new Astronaut[3];
	}
	
	//methods
	public void addSpacecraft(Spacecraft spacecraft) {
		for(int i = 0; i < spacecrafts.length; i++) {
			if(spacecrafts[i] == null) {
				spacecrafts[i] = spacecraft;
				break;
			}
		}
	}
	
	//methods
	public void addCrewMember(Astronaut astronaut) {
		for(int i = 0; i < crew.length; i++) {
			if(crew[i] == null) {
				crew[i] = astronaut;
				break;
			}
		}
	}
	
	//setters/getters
	public String getName() {
		return name;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getType() {
		return type;
	}
	
	public Spacecraft[] getSpacecrafts() {
		return spacecrafts;
	}
	
	public Astronaut[] getCrew() {
		return crew;
	}
	
	//tostring
	public String toString() {
		String str = "";
		str += name + "(" + operator + ")\n";
		str += type + ", " + year + "\n";
		str += "Spacecrafts:\n";
		for(int i = 0; i < spacecrafts.length; i++) {
			str += spacecrafts[i].toString() + "\n";
		}
		str += "Crew:\n";
		for(int i = 0; i < crew.length; i++) {
			str += crew[i].toString() + "\n";
		}
		return str;
	}
}


















}
