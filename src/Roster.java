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

	// constructor if array of student objects is passed, adds each element to
	// ArrayList
	public Roster(Roster list) {
		studentList = new ArrayList<Student>();

		for (int i = 0; i < list.rosterLength(); i++) {
			studentList.add(list.getStudent(i));
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
	public void removeStudent(int index) {
		studentList.remove(studentList.get(index));
	}

	// returns length of ArrayList
	public int rosterLength() {
		return studentList.size();
	}

	// return Student at given index
	public Student getStudent(int index) {
		return studentList.get(index);
	}

	// returns String array of student names
	public String[] nameList() {
		String[] names = new String[rosterLength()];

		for (int i = 0; i < rosterLength(); i++) {
			names[i] = studentList.get(i).getFullName();
		}

		return names;
	}

}
