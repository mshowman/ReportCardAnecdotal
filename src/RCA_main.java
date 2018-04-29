import java.io.*;
import java.util.Scanner;
/*
 * RCA_main class
 * 
 * runs MainView application
 * 
 */
public class RCA_main {

	private static MainView mv;
	public static Roster roster;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		roster = new Roster();
		
		//Declare Variables
		Scanner s = new Scanner(new FileReader("Roster.txt"));
		String n;

		//Checks for the next line in the Roster file and adds that student.
		//Format of the file is "First Last,Gender,General,Math,ELA,Science,SS"
		while( s.hasNextLine()) {
			n = s.nextLine();
			String[] something = n.split(",");
			char gender=n.toCharArray()[n.length()-11];
			char[] grade = {n.toCharArray()[n.length()-9]
					,n.toCharArray()[n.length()-7],n.toCharArray()[n.length()-5]
					,n.toCharArray()[n.length()-3],n.toCharArray()[n.length()-1]};
			
			//Create the student fromt the line information
			Student student = new Student(something[0],something[1],gender,grade);
			
			//add the student to the roster		
			roster.addStudent(student);
			} 
		
		//create the main view and add the roster.
		mv = new MainView(roster);
	}
}
