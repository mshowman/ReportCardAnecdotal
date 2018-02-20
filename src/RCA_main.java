import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * RCA_main class
 * 
 * GUI for application
 * 
 * Code as of 2-20 is just me playing around with GUI, nothing planned to be kept just yet
 */
public class RCA_main {

	public static void main(String[] args) {
		
		// create frame and button
		JFrame mainFrame = new JFrame();
		JButton addStudent = new JButton();
		
		// add text to button
		// set where button is on frame
		addStudent.setText("Add a Student");
		addStudent.setBounds(290, 350, 100, 20);
		
		// add button to frome
		// set size of frame
		mainFrame.add(addStudent);
		mainFrame.setSize(400, 400);
		
		// show frame
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
	

}
