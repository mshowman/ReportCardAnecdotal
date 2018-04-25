import java.util.HashMap;

/*
 * Report class
 * 
 * Takes a Roster and an array of Subject objects
 * Loops through Roster
 * Writes Anecdotal for each student in Roster to output file
 * 
 */

public class Report extends Student {

	// declaration of variables
	private Roster studentList;
	private String[] subjects = new String[5];
	public String output;
	HashMap<String, Integer> subjectMap;
	// constructor with Roster and Subject array passed
	// (0, "General");
	// (1, "Math");
	// (2, "ELA");
	// (3, "Science");
	// (4, "Social Studies");

	public Report(Roster r) {
		this.studentList = r;
		subjectMap = new HashMap<>();
		subjectMap.put("General", 0);
		subjectMap.put("Math", 1);
		subjectMap.put("ELA", 2);
		subjectMap.put("Science", 3);
		subjectMap.put("Social Studies", 4);
		subjectMap.put("All", 5);

	}

	public void runReport(String[] whichSubject) {

		// loops through roster, writes anecdotal for each subject to output file
		for (int i = 0; i < studentList.rosterLength(); i++) {
			Student s = studentList.getStudent(i);
			// Get the subjects from the hashMap
			for (String sub : whichSubject) {
				int subhash = subjectMap.get(sub);
				output = Subject.getAnecdotal(s, subhash);

				// Test print of the report output
				System.out.println(output);
			}
		}
	}

}
