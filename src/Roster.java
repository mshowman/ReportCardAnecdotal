import java.util.Vector;

/*
 * Roster Class
 * 
 * Stores the list of Student objects in a vector
 * Allows for adding/editing/deleting of students
 * 
 */

public class Roster {
	
	// declaration of variables
	private Vector<Student> studentList;
	
	// constructor if no params given, do nothing
	public Roster() {
		studentList = new Vector<Student>();
	}
	
	// constructor if array of student objects is passed, adds each element to vector
	public Roster(Student[] list) {
		studentList = new Vector<Student>();
		
		for (Student s : list) {
			studentList.add(s);
		}
	}

	// adds passed Student object to vector
	public void AddStudent(Student s) {
		studentList.addElement(s);
	}
	
	// removes old Student from vector, adds new Student to vector
	public void EditStudent(Student oldInfo, Student newInfo) {
		studentList.remove(oldInfo);
		studentList.add(newInfo);
	}
	
	// removes Student from vector
	public void RemoveStudent(Student s) {
		studentList.remove(s);
	}
	
	// returns length of vector
	public int RosterLength() {
		return studentList.size();
	}

}
