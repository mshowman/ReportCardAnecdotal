/*
 * RCA_main class
 * 
 * runs MainView application
 * 
 */
public class RCA_main {

	private static MainView mv;
	
	public static void main(String[] args) {
		Roster roster = new Roster();
		
		char[] grades = {'M','M','M','M','M'};
		
		for (int i = 0; i < 11; i++) {
			roster.addStudent(new Student("Matt", "Showman", 'M', grades, 32));
			roster.addStudent(new Student("Nate", "Lewis", 'M', grades, 32));
		}
		
		mv = new MainView(roster);
	}
}
