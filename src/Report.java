
public class Report {
	
	private Roster studentList;
	private Subject[] classList = new Subject[5];
	
	public Report(Roster r, Subject[] c) {
		this.studentList = r;
		this.classList = c;
	}
	
	public void RunReport() {
		for (int i = 0; i < studentList.RosterLength(); i++) {
			for (Subject subject : classList) {
				
			}
		}
	}

}
