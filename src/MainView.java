import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MainView extends JFrame {
	// declare variables
	public Roster r;
	private Container c;
	private JMenuBar navBar;
	private JMenuItem rosterMenu;
	private RosterMenuListener objRosterMenuListener;
	private JMenuItem reportMenu;
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

		// create reportview object
		reportView = new ReportView(c, r);

		// sets container to roster view by default
		rosterView = new RosterView(c, r);

		// set attributes of frame
		setTitle("Report Card Anecdotals");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// show frame
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void setContainer(Container c) {
		this.c = c;

		c.validate();
		c.repaint();
	}

	public Roster getRoster() {
		return r;
	}

	// listens for Roster menuitem to be clicked
	private class RosterMenuListener implements ActionListener {

		// switches container contents to Roster View
		public void actionPerformed(ActionEvent arg0) {
			setContainer(rosterView.createRosterView(r));
		}
	}

	// listens for Run Report menuitem to be clicked
	private class ReportMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (r.rosterLength() > 0) {
				setContainer(reportView.createReportView(r));
			} else {
				JOptionPane.showMessageDialog(null, "Cannot run a report without students in the roster.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
