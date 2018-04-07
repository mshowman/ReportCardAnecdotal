/*
 * Report class
 * 
 * Takes a Roster and an array of Subject objects
 * Loops through Roster
 * Writes Anecdotal for each student in Roster to output file
 * 
 */

public class Report {
	
	// declaration of variables
	private Roster studentList;
	private Subject[] classList = new Subject[5];
	
	// constructor with Roster and Subject array passed
	public Report(Roster r, Subject[] c) {
		this.studentList = r;
		this.classList = c;
	}
	
	// loops through roster, writes anecdotal for each subject to output file
	public void RunReport() {
		for (int i = 0; i < studentList.rosterLength(); i++) {
			for (Subject subject : classList) {
				
			}
		}
	}

}
