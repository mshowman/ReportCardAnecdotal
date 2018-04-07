import java.util.ArrayList;

/*
 * Roster Class
 * 
 * Stores the list of Student objects in a ArrayList
 * Allows for adding/editing/deleting of students
 * 
 */

public class Roster {
	
	// declaration of variables
	private ArrayList<Student> studentList;
	
	// constructor if no params given, do nothing
	public Roster() {
		studentList = new ArrayList<Student>();
	}
	
	// constructor if array of student objects is passed, adds each element to ArrayList
	public Roster(Student[] list) {
		studentList = new ArrayList<Student>();
		
		for (Student s : list) {
			studentList.add(s);
		}
	}

	// adds passed Student object to ArrayList
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	// removes old Student from ArrayList, adds new Student to ArrayList
	public void editStudent(Student oldInfo, Student newInfo) {
		studentList.set(studentList.indexOf(oldInfo), newInfo);
	}
	
	// removes Student from ArrayList
	public void removeStudent(Student s) {
		studentList.remove(s);
	}
	
	// returns length of ArrayList
	public int rosterLength() {
		return studentList.size();
	}
	
	// returns String array of student names
	public String[] nameList() {
		String[] names = new String[rosterLength()+1];
		
		names[0] = "Add New Student";
		
		for (int i = 1; i < rosterLength(); i++) {
			names[i] = studentList.get(i).getFullName();
		}
		
		return names;
	}

}
