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

		char[] grades = { 'M', 'P', 'M', 'E', 'M' };

		roster.addStudent(new Student("Matt", "Showman", 'M', grades));

		mv = new MainView(roster);
	}
}
