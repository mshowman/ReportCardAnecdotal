import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ReportView {

	// declares components
	private Container c;
	private Roster r;

	private JScrollPane checkboxScroller;
	private JPanel studentPanel;

	private JPanel checkboxPanel;
	private JPanel subjectPanel;

	private JCheckBox allSubject;
	private JCheckBox generalSubject;
	private JCheckBox mathSubject;
	private JCheckBox elaSubject;
	private JCheckBox scienceSubject;
	private JCheckBox ssSubject;

	private JPanel buttonPanel;
	private JButton runReportButton;
	private JButton cancelButton;

	private CancelListener objCancelListener;
	private RunReportListener objRRListener;
	private AllSubjectsListener objASListener;

	// constructor takes Container and sets it to Roster View

	public ReportView(Container c, Roster r) {
		// sets object's container to container that was passed
		this.c = c;
		this.c = createReportView(r);
	}

	// returns container with populated with items
	public Container createReportView(Roster r) {

		this.c.removeAll();
		this.r = r;

		// creates panel to hold unpicked and picked student lists
		studentPanel = new JPanel(new GridLayout(r.rosterLength(), 1));
		studentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		String[] names = r.nameList();

		for (String string : names) {
			studentPanel.add(new JCheckBox(string));
		}

		// creates scrollbar for jlist object
		checkboxScroller = new JScrollPane(studentPanel);
		checkboxScroller.setPreferredSize(new Dimension(200, 300));
		checkboxScroller.setAlignmentX(JScrollPane.RIGHT_ALIGNMENT);
		checkboxScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		checkboxScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		checkboxScroller.getVerticalScrollBar().setUnitIncrement(10);

		// adds checkboxes
		allSubject = new JCheckBox("All Subjects");
		allSubject.setActionCommand("All");

		objASListener = new AllSubjectsListener();
		allSubject.addActionListener(objASListener);

		generalSubject = new JCheckBox("General");
		generalSubject.setActionCommand("General");

		mathSubject = new JCheckBox("Math");
		mathSubject.setActionCommand("Math");

		elaSubject = new JCheckBox("ELA");
		elaSubject.setActionCommand("ELA");

		scienceSubject = new JCheckBox("Science");
		scienceSubject.setActionCommand("Science");

		ssSubject = new JCheckBox("Social Studies");
		ssSubject.setActionCommand("Social Studies");

		// create panel and add checkboxes to it
		subjectPanel = new JPanel(new BorderLayout());

		checkboxPanel = new JPanel(new GridLayout(6, 1));
		checkboxPanel.add(allSubject);
		checkboxPanel.add(generalSubject);
		checkboxPanel.add(mathSubject);
		checkboxPanel.add(elaSubject);
		checkboxPanel.add(scienceSubject);
		checkboxPanel.add(ssSubject);

		subjectPanel.add(checkboxPanel, BorderLayout.CENTER);

		// creates panel for buttons
		buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates buttons for save and cancel
		// sets Action Listener for buttons
		runReportButton = new JButton("Run Report");
		objRRListener = new RunReportListener();
		runReportButton.addActionListener(objRRListener);

		cancelButton = new JButton("Cancel");
		objCancelListener = new CancelListener();
		cancelButton.addActionListener(objCancelListener);

		// add buttons to panel
		buttonPanel.add(runReportButton);
		buttonPanel.add(cancelButton);

		// add panel to subjectPanel
		subjectPanel.add(buttonPanel, BorderLayout.PAGE_END);

		// add rosterPanel and formPanel to layout panel
		this.c.add(checkboxScroller, BorderLayout.CENTER);
		this.c.add(subjectPanel, BorderLayout.LINE_END);

		return this.c;
	}

	// deselects all checkboxes
	public void clearComponents() {

		// clears the student checkboxes
		studentPanel.removeAll();

		String[] names = r.nameList();

		for (String string : names) {
			studentPanel.add(new JCheckBox(string));
		}

		// deselects all checkboxes
		allSubject.setSelected(false);
		generalSubject.setSelected(false);
		mathSubject.setSelected(false);
		elaSubject.setSelected(false);
		scienceSubject.setSelected(false);
		ssSubject.setSelected(false);

		// makes sure all checkboxes are enabled
		generalSubject.setEnabled(true);
		mathSubject.setEnabled(true);
		elaSubject.setEnabled(true);
		scienceSubject.setEnabled(true);
		ssSubject.setEnabled(true);

		// repaint
		c.validate();
		c.repaint();

	}

	// calls clearComponents
	private class CancelListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			clearComponents();
		}
	}

	private class RunReportListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// temp variables
			Roster tempRoster = new Roster();
			String chosen = "";
			Component[] components = studentPanel.getComponents();

			// loop through the Student checkboxes
			// if selected, add to temporary roster
			for (Component component : components) {
				JCheckBox cb = (JCheckBox) component;

				if (cb.isSelected()) {
					tempRoster.addStudent(r.getStudent(r.getIndexOfStudent(cb.getText())));
				}
			}

			// if all subjects selected, pass all subjects to report
			// else, go subject by subject to check for selection
			if (allSubject.isSelected()) {
				chosen = generalSubject.getText() + ";" + mathSubject.getText() + ";" + elaSubject.getText() + ";"
						+ scienceSubject.getText() + ";" + ssSubject.getText() + ";";
			} else {
				if (generalSubject.isSelected()) {
					chosen += generalSubject.getText() + ";";
				}

				if (mathSubject.isSelected()) {
					chosen += mathSubject.getText() + ";";
				}

				if (elaSubject.isSelected()) {
					chosen += elaSubject.getText() + ";";
				}

				if (scienceSubject.isSelected()) {
					chosen += scienceSubject.getText() + ";";
				}

				if (ssSubject.isSelected()) {
					chosen += ssSubject.getText() + ";";
				}
			}

			// makes sure students and subjects are selected
			// no -> show error msg
			// yes -> run report
			if (chosen.equals("") || tempRoster.rosterLength() == 0) {
				JOptionPane.showMessageDialog(null, "Cannot run a report without students and/or subjects selected.",
						"Error", JOptionPane.ERROR_MESSAGE);
			} else {
				Report rep = new Report(tempRoster);
				rep.runReport(chosen.split(";"));

				clearComponents();
			}
		}
	}

	// toggles subject selections
	private class AllSubjectsListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			boolean enabled = allSubject.isSelected();

			generalSubject.setSelected(enabled);
			mathSubject.setSelected(enabled);
			elaSubject.setSelected(enabled);
			scienceSubject.setSelected(enabled);
			ssSubject.setSelected(enabled);

			generalSubject.setEnabled(!enabled);
			mathSubject.setEnabled(!enabled);
			elaSubject.setEnabled(!enabled);
			scienceSubject.setEnabled(!enabled);
			ssSubject.setEnabled(!enabled);

			c.repaint();
		}

	}
}
