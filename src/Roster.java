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
	private Vector<Student> studentList = new Vector<Student>();
	
	// constructor if no params given, do nothing
	public Roster() {
	}
	
	// constructor if array of student objects is passed, adds each element to vector
	public Roster(Student[] list) {
		for (Student s : list) {
			this.studentList.add(s);
		}
	}

	// adds passed Student object to vector
	public void AddStudent(Student s) {
		this.studentList.addElement(s);
	}
	
	// removes old Student from vector, adds new Student to vector
	public void EditStudent(Student oldInfo, Student newInfo) {
		this.studentList.remove(oldInfo);
		this.studentList.add(newInfo);
	}
	
	// removes Student from vector
	public void RemoveStudent(Student s) {
		this.studentList.remove(s);
	}
	
	// returns length of vector
	public int RosterLength() {
		return studentList.size();
	}

}
