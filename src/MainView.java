import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame{
	
	public MainView() {
		Container c = getContentPane();
		
		JMenuBar navBar = new JMenuBar();
		JMenuItem rosterItem = new JMenuItem("Roster");
		JMenuItem subjectItem = new JMenuItem("Edit Anecdotal");
		JMenuItem reportItem = new JMenuItem("Run Report");
		
		navBar.add(rosterItem);
		navBar.add(subjectItem);
		navBar.add(reportItem);
		
		c.add(navBar);
		
		setTitle("Report Card Anecdotals");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
