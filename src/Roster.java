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

	// constructor if roster is passed, adds each element to
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

	// return index of student given a full name
	public int getIndexOfStudent(String name) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getFullName().equals(name)) {
				return i;
			}
		}

		return -1;

	}

	// returns String array of student names for combobox list
	// pulls full name for each student
	public String[] nameList() {
		String[] names = new String[rosterLength()];

		for (int i = 0; i < rosterLength(); i++) {
			names[i] = studentList.get(i).getFullName();
		}

		return names;
	}

}