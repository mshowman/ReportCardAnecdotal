import java.util.Vector;

public class Roster {
	
	private Vector<Student> studentList = new Vector<Student>();
	
	public Roster(Student[] list) {
		for (Student s : list) {
			this.studentList.add(s);
		}
	}
	
	public void AddStudent(Student s) {
		this.studentList.addElement(s);
	}
	
	public void RemoveStudent(Student s) {
		this.studentList.remove(s);
	}
	
	public int RosterLength() {
		return studentList.size();
	}

}
