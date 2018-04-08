import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {
	// declare variables
	private Roster r;
	private Container c;
	private JMenuBar navBar;
	private JMenuItem rosterMenu;
	private RosterMenuListener objRosterMenuListener;
	private JMenuItem reportMenu;
	private RosterMenuListener objRMenuListener;
	private ReportMenuListener objReportMenuListener;
	private RosterView rosterView;
	private ReportView reportView;

	// default constructor
	// sets up frame and container
	// default view is RosterView
	public MainView(Roster r) {

		// sets roster to created roster
		this.r = r;

		// sets container to contentpane
		c = getContentPane();

		// menubar
		navBar = new JMenuBar();

		// roster menu item
		rosterMenu = new JMenuItem("Roster");
		objRosterMenuListener = new RosterMenuListener();
		rosterMenu.addActionListener(objRosterMenuListener);
		navBar.add(rosterMenu);

		// report menu item
		reportMenu = new JMenuItem("Run Report");
		objReportMenuListener = new ReportMenuListener();
		reportMenu.addActionListener(objReportMenuListener);
		navBar.add(reportMenu);

		// sets menubar of frame to navbar
		setJMenuBar(navBar);

		// sets container to roster view by default
		rosterView = new RosterView(c, r);
		c = rosterView.getRosterContainer();

		// set attributes of frame
		setTitle("Report Card Anecdotals");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// show frame
		setVisible(true);
		setLocationRelativeTo(null);
	}

	// listens for Roster menuitem to be clicked
	private class RosterMenuListener implements ActionListener {

		// switches container contents to Roster View
		public void actionPerformed(ActionEvent arg0) {
			rosterView = new RosterView(c, r);
			c = rosterView.getRosterContainer();

			c.validate();
			c.repaint();
		}
	}

	// listens for Run Report menuitem to be clicked
	private class ReportMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			reportView = new ReportView(c);
			c = reportView.getReportContainer();

			c.validate();
			c.repaint();
		}
	}
}
