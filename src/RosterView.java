import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class RosterView {

	// declares components
	Container c;
	JList<String> rosterList;
	JScrollPane rosterScroller;
	JButton addStudent;
	JButton removeStudent;
	JTextField nameField;
	JRadioButton genPRadio;
	JRadioButton genMRadio;
	JRadioButton genERadio;
	JRadioButton mathPRadio;
	JRadioButton mathMRadio;
	JRadioButton mathERadio;
	JRadioButton elaPRadio;
	JRadioButton elaMRadio;
	JRadioButton elaERadio;
	JRadioButton sciencePRadio;
	JRadioButton scienceMRadio;
	JRadioButton scienceERadio;
	JRadioButton ssPRadio;
	JRadioButton ssMRadio;
	JRadioButton ssERadio;
	ButtonGroup generalButtons;
	ButtonGroup mathButtons;
	ButtonGroup elaButtons;
	ButtonGroup scienceButtons;
	ButtonGroup ssButtons;
	JButton saveButton;
	JButton cancelButton;

	// constructor takes Container and sets it to Roster View
	public RosterView(Container c) {
		// sets object's container to container that was passed
		this.c = c;

		// creates jlist object to show roster contents
		DefaultListModel<String> studentList = new DefaultListModel<String>();

		// adds dummy items to list for display testing
		for (int i = 0; i < 11; i++) {
			studentList.addElement("Matt Showman");
			studentList.addElement("Nate Lewis");
		}

		// creates jlist to store roster list
		// limits selection to one student at a time
		rosterList = new JList<String>(studentList);
		rosterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rosterList.setLayoutOrientation(JList.VERTICAL);

		// creates scrollbar for jlist object
		rosterScroller = new JScrollPane(rosterList);
		rosterScroller.setPreferredSize(new Dimension(200, 400));
		rosterScroller.setAlignmentX(JScrollPane.RIGHT_ALIGNMENT);
		rosterScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		rosterScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		rosterScroller.getVerticalScrollBar().setUnitIncrement(10);

		// creates panel to hold roster list
		JPanel rosterPanel = new JPanel(new BorderLayout());
		rosterPanel.setBorder(new EmptyBorder(10, 10, 0, 0));

		// creates add and delete buttons
		// sets Action Listeners for buttons
		addStudent = new JButton("+");
		AddListener objAddListner = new AddListener();
		addStudent.addActionListener(objAddListner);

		removeStudent = new JButton("-");
		removeStudent.setEnabled(false);

		// creates panel to hold add and remove buttons
		JPanel rosterButtons = new JPanel();
		rosterButtons.add(addStudent);
		rosterButtons.add(removeStudent);

		// adds buttons, scrollbar (and attached jlist) to panel
		rosterPanel.add(rosterScroller, BorderLayout.CENTER);
		rosterPanel.add(rosterButtons, BorderLayout.PAGE_END);

		// creates panel to hold form fields
		JPanel formPanel = new JPanel(new GridLayout(7, 2));

		// creates panel to hold label and textfield for name
		JPanel namePanel = new JPanel(new BorderLayout());
		namePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and textfield for name
		JLabel nameLabel = new JLabel("Student Name:");
		nameField = new JTextField();

		// add items to panel
		namePanel.add(nameLabel, BorderLayout.LINE_START);
		namePanel.add(nameField, BorderLayout.CENTER);

		// add panel to formPanel
		formPanel.add(namePanel);

		// creates panel to hold label and radio buttons for general grade
		JPanel generalPanel = new JPanel(new GridLayout(1, 4));
		generalPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel generalLabel = new JLabel("General Grade:");
		genPRadio = new JRadioButton("P");
		genMRadio = new JRadioButton("M");
		genERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		generalButtons = new ButtonGroup();
		generalButtons.add(genPRadio);
		generalButtons.add(genMRadio);
		generalButtons.add(genERadio);

		// add items to panel
		generalPanel.add(generalLabel);
		generalPanel.add(genPRadio);
		generalPanel.add(genMRadio);
		generalPanel.add(genERadio);

		// add panel to formPanel
		formPanel.add(generalPanel);

		// creates panel to hold label and radio buttons for math grade
		JPanel mathPanel = new JPanel(new GridLayout(1, 4));
		mathPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel mathLabel = new JLabel("Math Grade:");
		mathPRadio = new JRadioButton("P");
		mathMRadio = new JRadioButton("M");
		mathERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		mathButtons = new ButtonGroup();
		mathButtons.add(mathPRadio);
		mathButtons.add(mathMRadio);
		mathButtons.add(mathERadio);

		// add items to panel
		mathPanel.add(mathLabel);
		mathPanel.add(mathPRadio);
		mathPanel.add(mathMRadio);
		mathPanel.add(mathERadio);

		// add panel to formPanel
		formPanel.add(mathPanel);

		// creates panel to hold label and radio buttons for ELA grade
		JPanel elaPanel = new JPanel(new GridLayout(1, 4));
		elaPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel elaLabel = new JLabel("ELA Grade:");
		elaPRadio = new JRadioButton("P");
		elaMRadio = new JRadioButton("M");
		elaERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		elaButtons = new ButtonGroup();
		elaButtons.add(elaPRadio);
		elaButtons.add(elaMRadio);
		elaButtons.add(elaERadio);

		// add items to panel
		elaPanel.add(elaLabel);
		elaPanel.add(elaPRadio);
		elaPanel.add(elaMRadio);
		elaPanel.add(elaERadio);

		// add panel to formPanel
		formPanel.add(elaPanel);

		// creates panel to hold label and radio buttons for science grade
		JPanel sciencePanel = new JPanel(new GridLayout(1, 4));
		sciencePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel scienceLabel = new JLabel("Science Grade:");
		sciencePRadio = new JRadioButton("P");
		scienceMRadio = new JRadioButton("M");
		scienceERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		scienceButtons = new ButtonGroup();
		scienceButtons.add(sciencePRadio);
		scienceButtons.add(scienceMRadio);
		scienceButtons.add(scienceERadio);

		// add items to panel
		sciencePanel.add(scienceLabel);
		sciencePanel.add(sciencePRadio);
		sciencePanel.add(scienceMRadio);
		sciencePanel.add(scienceERadio);

		// add panel to formPanel
		formPanel.add(sciencePanel);

		// creates panel to hold label and radio buttons for social studies grade
		JPanel ssPanel = new JPanel(new GridLayout(1, 4));
		ssPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel ssLabel = new JLabel("Social Studies Grade:");
		ssPRadio = new JRadioButton("P");
		ssMRadio = new JRadioButton("M");
		ssERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ssButtons = new ButtonGroup();
		ssButtons.add(ssPRadio);
		ssButtons.add(ssMRadio);
		ssButtons.add(ssERadio);

		// add items to panel
		ssPanel.add(ssLabel);
		ssPanel.add(ssPRadio);
		ssPanel.add(ssMRadio);
		ssPanel.add(ssERadio);

		// add panel to formPanel
		formPanel.add(ssPanel);

		// creates panel for buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates buttons for save and cancel
		// sets Action Listener for buttons
		saveButton = new JButton("Save Student");

		cancelButton = new JButton("Cancel");
		CancelListener objCancelListener = new CancelListener();
		cancelButton.addActionListener(objCancelListener);

		// add buttons to panel
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);

		// add panel to formPanel
		formPanel.add(buttonPanel);

		// disable formPanel
		toggleFormEnabled(false);

		// add rosterPanel and formPanel to layout panel
		this.c.add(rosterPanel, BorderLayout.LINE_START);
		this.c.add(formPanel, BorderLayout.CENTER);

		// redraws screen
		this.c.validate();
		this.c.repaint();
	}

	// returns the container of this object
	public Container getRosterContainer() {
		return this.c;
	}

	// enables or disables form fields
	public void toggleFormEnabled(boolean enabled) {

		nameField.setEnabled(enabled);

		genPRadio.setEnabled(enabled);
		genMRadio.setEnabled(enabled);
		genERadio.setEnabled(enabled);
		mathPRadio.setEnabled(enabled);
		mathMRadio.setEnabled(enabled);
		mathERadio.setEnabled(enabled);
		elaPRadio.setEnabled(enabled);
		elaMRadio.setEnabled(enabled);
		elaERadio.setEnabled(enabled);
		sciencePRadio.setEnabled(enabled);
		scienceMRadio.setEnabled(enabled);
		scienceERadio.setEnabled(enabled);
		ssPRadio.setEnabled(enabled);
		ssMRadio.setEnabled(enabled);
		ssERadio.setEnabled(enabled);

		saveButton.setEnabled(enabled);
		cancelButton.setEnabled(enabled);

		if (enabled == true)
			nameField.requestFocusInWindow();

		rosterList.setEnabled(!enabled);
		addStudent.setEnabled(!enabled);
	}

	// clears the form fields and rosterlist's selection
	public void clearComponents() {
		nameField.setText("");
		generalButtons.clearSelection();
		mathButtons.clearSelection();
		elaButtons.clearSelection();
		scienceButtons.clearSelection();
		ssButtons.clearSelection();
		rosterList.clearSelection();
	}

	// calls toggleFormEnabled, passing true to enable form fields
	private class AddListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			toggleFormEnabled(true);
		}

	}

	// calls clearComponents and toggleFormEnabled, passing false to disable form
	// fields
	private class CancelListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			clearComponents();
			toggleFormEnabled(false);

		}
	}
}
