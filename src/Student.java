
/*
 * Student Class
 * 
 * Object that will contain all of the attributes of a student
 * Name, Gender, Grades
 * 
 */
public class Student {
	// Variables
	private String firstName, lastName, fullName;
	private char gender;
	private char[] grades = new char[5];

	public Student() {
		firstName = "";
		lastName = "";
		fullName = "";
		gender = 0;
	}

	public Student(String firstName, String lastName, char gender, char[] grades) {
		setinfo(firstName, lastName, gender);
		setGrades(grades);
	}

	// Get Methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public char getGender() {
		return gender;
	}

	public char[] getGrades() {
		return grades;
	}

	// Set Methods
	public void setinfo(String fName, String lName, char gender) {
		this.firstName = fName;
		this.lastName = lName;
		this.gender = gender;
		this.fullName = fName + " " + lName;
	}

	public void setGrades(char[] grades) {
		for (int i = 0; i < grades.length; i++) {
			this.grades[i] = grades[i];
		}
	}

	public String toString() {
		char[] grades = getGrades();
		
		return getFirstName() + ";" + getLastName() + ";" + getGender() + ";" + grades[0]
				+ ";" + grades[1] + ";" + grades[2] + ";" + grades[3] + ";" + grades[4];
	}

}
