import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {
	// declare variables
	private Container c;
	private JMenuBar navBar;
	private JMenuItem rosterMenu;
	private RosterMenuListener objRosterMenuListener;
	private JMenuItem subjectMenu;
	private RosterMenuListener objSubjectMenuListener;
	private JMenuItem reportMenu;
	private RosterMenuListener objReportMenuListener;
	private RosterView rv;

	// default constructor
	// sets up frame and container
	// default view is RosterView
	public MainView() {

		// sets container to contentpane
		c = getContentPane();

		// menubar
		navBar = new JMenuBar();

		// roster menu item
		rosterMenu = new JMenuItem("Roster");
		objRosterMenuListener = new RosterMenuListener();
		rosterMenu.addActionListener(objRosterMenuListener);
		navBar.add(rosterMenu);

		// subject menu item
		subjectMenu = new JMenuItem("Edit Anecdotal for Subject");
		navBar.add(subjectMenu);

		// report menu item
		reportMenu = new JMenuItem("Run Report");
		navBar.add(reportMenu);

		// sets menubar of frame to navbar
		setJMenuBar(navBar);
		
		// sets container to roster view by default
		rv = new RosterView(c);
		c = rv.getRosterContainer();

		// set attributes of frame
		setTitle("Report Card Anecdotals");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// show frame
		setVisible(true);
	}

	// listens for Roster menuitem to be clicked
	private class RosterMenuListener implements ActionListener {

		// switches container contents to Roster View
		public void actionPerformed(ActionEvent arg0) {
			rv = new RosterView(c);
			c = rv.getRosterContainer();
			
			c.validate();
			c.repaint();
		}
	}

	// listens for Edit Subject Anecdotal menuitem to be clicked
	private class SubjectMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This should show the Subject View.");
		}
	}

	// listens for Run Report menuitem to be clicked
	private class ReportMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This should show the Report View.");

		}
	}
}
