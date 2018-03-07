import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ReportView {

	// declares components
	private Container c;
	
	private DefaultListModel<String> notPicked;
	private JList<String> notPickedList;
	private JScrollPane notPickedScroller;
	
	private DefaultListModel<String> isPicked;
	private JList<String> isPickedList;
	private JScrollPane isPickedScroller;
	
	private JPanel studentPanel;
	
	private JButton addStudent;
	private AddListener objAddListner;
	
	private JButton removeStudent;
	private RemoveListener objRemoveListner;
	
	private JPanel studentButtons;
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
	public ReportView(Container c) {
		// sets object's container to container that was passed
		this.c = c;

		// creates jlist object to show unpicked students
		notPicked = new DefaultListModel<String>();

		// adds dummy items to list for display testing
		for (int i = 0; i < 11; i++) {
			notPicked.addElement("Matt Showman");
			notPicked.addElement("Nate Lewis");
		}

		// creates jlist to store unpicked student list
		notPickedList = new JList<String>(notPicked);
		notPickedList.setLayoutOrientation(JList.VERTICAL);

		// creates scrollbar for jlist object
		notPickedScroller = new JScrollPane(notPickedList);
		notPickedScroller.setPreferredSize(new Dimension(200, 400));
		notPickedScroller.setAlignmentX(JScrollPane.RIGHT_ALIGNMENT);
		notPickedScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		notPickedScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		notPickedScroller.getVerticalScrollBar().setUnitIncrement(10);
		
		// creates jlist object to show picked students
		isPicked = new DefaultListModel<String>();

		// creates jlist to store picked student list
		// limits selection to one student at a time
		isPickedList = new JList<String>(isPicked);
		isPickedList.setLayoutOrientation(JList.VERTICAL);

		// creates scrollbar for jlist object
		isPickedScroller = new JScrollPane(notPickedList);
		isPickedScroller.setPreferredSize(new Dimension(200, 400));
		isPickedScroller.setAlignmentX(JScrollPane.RIGHT_ALIGNMENT);
		isPickedScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		isPickedScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		isPickedScroller.getVerticalScrollBar().setUnitIncrement(10);		

		// creates panel to hold unpicked and picked student lists
		studentPanel = new JPanel(new BorderLayout());
		studentPanel.setBorder(new EmptyBorder(10, 10, 0, 0));

		// creates add and delete buttons
		// sets Action Listeners for buttons
		addStudent = new JButton("-->");
		objAddListner = new AddListener();
		addStudent.addActionListener(objAddListner);

		removeStudent = new JButton("<--");
		objRemoveListner = new RemoveListener();
		removeStudent.addActionListener(objRemoveListner);

		// creates panel to hold add and remove buttons
		studentButtons = new JPanel();
		studentButtons.add(addStudent);
		studentButtons.add(removeStudent);

		// adds buttons, scrollbar (and attached jlist) to panel
		studentPanel.add(notPickedScroller, BorderLayout.PAGE_START);
		studentPanel.add(studentButtons, BorderLayout.CENTER);
		studentPanel.add(isPickedScroller, BorderLayout.PAGE_END);

		// adds checkboxes
		allSubject = new JCheckBox("All Subjects");
		generalSubject = new JCheckBox("General");
		mathSubject = new JCheckBox("Math");
		elaSubject = new JCheckBox("ELA");
		scienceSubject = new JCheckBox("Science");
		ssSubject = new JCheckBox("Social Studies");
		
		//create panel and add checkboxes to it
		subjectPanel = new JPanel(new BorderLayout());
		
		checkboxPanel = new JPanel();
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

		// add panel to formPanel
		subjectPanel.add(buttonPanel, BorderLayout.PAGE_END);

		// add rosterPanel and formPanel to layout panel
		this.c.add(studentPanel, BorderLayout.LINE_START);
		this.c.add(subjectPanel, BorderLayout.CENTER);

		// redraws screen
		this.c.validate();
		this.c.repaint();
	}

	// returns the container of this object
	public Container getReportContainer() {
		return this.c;
	}

//	// enables or disables form fields
//	public void toggleFormEnabled(boolean enabled) {
//
//		nameField.setEnabled(enabled);
//
//		genPRadio.setEnabled(enabled);
//		genMRadio.setEnabled(enabled);
//		genERadio.setEnabled(enabled);
//		mathPRadio.setEnabled(enabled);
//		mathMRadio.setEnabled(enabled);
//		mathERadio.setEnabled(enabled);
//		elaPRadio.setEnabled(enabled);
//		elaMRadio.setEnabled(enabled);
//		elaERadio.setEnabled(enabled);
//		sciencePRadio.setEnabled(enabled);
//		scienceMRadio.setEnabled(enabled);
//		scienceERadio.setEnabled(enabled);
//		ssPRadio.setEnabled(enabled);
//		ssMRadio.setEnabled(enabled);
//		ssERadio.setEnabled(enabled);
//
//		saveButton.setEnabled(enabled);
//		cancelButton.setEnabled(enabled);
//
//		if (enabled == true)
//			nameField.requestFocusInWindow();
//
//		rosterList.setEnabled(!enabled);
//		addStudent.setEnabled(!enabled);
//	}
//
//	// clears the form fields and rosterlist's selection
//	public void clearComponents() {
//		nameField.setText("");
//		generalButtons.clearSelection();
//		mathButtons.clearSelection();
//		elaButtons.clearSelection();
//		scienceButtons.clearSelection();
//		ssButtons.clearSelection();
//		rosterList.clearSelection();
//	}

	// calls toggleFormEnabled, passing true to enable form fields
	private class AddListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			//toggleFormEnabled(true);
		}

	}

	private class RemoveListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			//toggleFormEnabled(true);
		}

	}
	
	// calls clearComponents and toggleFormEnabled, passing false to disable form
	// fields
	private class CancelListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			//clearComponents();
			//toggleFormEnabled(false);

		}
	}
}
