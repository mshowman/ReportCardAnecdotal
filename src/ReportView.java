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

	// constructor takes Container and sets it to Roster View
	public ReportView(Container c, Roster r) {
		// sets object's container to container that was passed
		this.c = c;
		this.c.removeAll();

//		this.r = r;

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
		generalSubject = new JCheckBox("General");
		mathSubject = new JCheckBox("Math");
		elaSubject = new JCheckBox("ELA");
		scienceSubject = new JCheckBox("Science");
		ssSubject = new JCheckBox("Social Studies");

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

		// redraws screen
		this.c.validate();
		this.c.repaint();
	}

	// returns the container of this object
	public Container getReportContainer() {
		return this.c;
	}

	// // enables or disables form fields
	// public void toggleFormEnabled(boolean enabled) {
	//
	// nameField.setEnabled(enabled);
	//
	// genPRadio.setEnabled(enabled);
	// genMRadio.setEnabled(enabled);
	// genERadio.setEnabled(enabled);
	// mathPRadio.setEnabled(enabled);
	// mathMRadio.setEnabled(enabled);
	// mathERadio.setEnabled(enabled);
	// elaPRadio.setEnabled(enabled);
	// elaMRadio.setEnabled(enabled);
	// elaERadio.setEnabled(enabled);
	// sciencePRadio.setEnabled(enabled);
	// scienceMRadio.setEnabled(enabled);
	// scienceERadio.setEnabled(enabled);
	// ssPRadio.setEnabled(enabled);
	// ssMRadio.setEnabled(enabled);
	// ssERadio.setEnabled(enabled);
	//
	// saveButton.setEnabled(enabled);
	// cancelButton.setEnabled(enabled);
	//
	// if (enabled == true)
	// nameField.requestFocusInWindow();
	//
	// rosterList.setEnabled(!enabled);
	// addStudent.setEnabled(!enabled);
	// }
	//
	// // clears the form fields and rosterlist's selection
	// public void clearComponents() {
	// nameField.setText("");
	// generalButtons.clearSelection();
	// mathButtons.clearSelection();
	// elaButtons.clearSelection();
	// scienceButtons.clearSelection();
	// ssButtons.clearSelection();
	// rosterList.clearSelection();
	// }

	// calls toggleFormEnabled, passing true to enable form fields
	private class AddListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// toggleFormEnabled(true);
		}

	}

	// calls clearComponents and toggleFormEnabled, passing false to disable form
	// fields
	private class CancelListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// clearComponents();
			// toggleFormEnabled(false);

		}
	}
}
