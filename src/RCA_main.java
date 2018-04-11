/*
 * RCA_main class
 * 
 * runs MainView application
 * 
 */
public class RCA_main {

	private static MainView mv;
	public static Roster roster;
	
	public static void main(String[] args) {
		roster = new Roster();

		mv = new MainView(roster);
	}
}
