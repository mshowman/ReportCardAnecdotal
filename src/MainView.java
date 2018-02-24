import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame {
	// declare variables
	Container c;

	public MainView() {

		// sets container to contentpane
		c = getContentPane();

		// menubar
		JMenuBar navBar = new JMenuBar();

		// roster menu
		JMenu rosterMenu = new JMenu("Roster");

		// add a student option of roster menu
		JMenuItem addRoster = new JMenuItem("Add a student");
		rosterMenu.add(addRoster);

		// edit a student option of roster menu
		JMenuItem editRoster = new JMenuItem("Edit a student");
		rosterMenu.add(editRoster);

		// remove a student option of roster menu
		JMenuItem removeRoster = new JMenuItem("Remove a student");
		rosterMenu.add(removeRoster);

		// action listener for add a student option
		AddStudentListener objAddListener = new AddStudentListener();
		addRoster.addActionListener(objAddListener);

		// action listener for edit a student option
		EditStudentListener objEditListener = new EditStudentListener();
		editRoster.addActionListener(objEditListener);

		// subject menu
		JMenu subjectMenu = new JMenu("Edit Anecdotal for Subject");

		// report menu
		JMenu reportMenu = new JMenu("Run Report");

		// add menus to menubar
		navBar.add(rosterMenu);
		navBar.add(subjectMenu);
		navBar.add(reportMenu);

		// sets menubar of frame to navbar
		setJMenuBar(navBar);

		// set attributes of frame
		setTitle("Report Card Anecdotals");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// show frame
		setVisible(true);
	}

	// sets view to default view
	public void defaultView() {
		c.removeAll();
		c.validate();
		c.repaint();
	}

	// sets view to add student form
	public void addStudentView() {
		// clear container
		c.removeAll();
		
		// creates panel to hold component panels
		JPanel viewPanel = new JPanel(new GridLayout(7, 2));
		viewPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates panel to hold label and textfield for name
		JPanel namePanel = new JPanel(new GridLayout(1, 2));
		namePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and textfield for name
		JLabel nameLabel = new JLabel("Student Name:");
		JTextField nameField = new JTextField();

		// add items to panel
		namePanel.add(nameLabel);
		namePanel.add(nameField);

		// add panel to container
		viewPanel.add(namePanel);

		// creates panel to hold label and radio buttons for general grade
		JPanel generalPanel = new JPanel(new GridLayout(1, 4));
		generalPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel generalLabel = new JLabel("General Grade:");
		JRadioButton genPRadio = new JRadioButton("P");
		JRadioButton genMRadio = new JRadioButton("M");
		JRadioButton genERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup generalButtons = new ButtonGroup();
		generalButtons.add(genPRadio);
		generalButtons.add(genMRadio);
		generalButtons.add(genERadio);

		// add items to panel
		generalPanel.add(generalLabel);
		generalPanel.add(genPRadio);
		generalPanel.add(genMRadio);
		generalPanel.add(genERadio);

		// add panel to container
		viewPanel.add(generalPanel);

		// creates panel to hold label and radio buttons for math grade
		JPanel mathPanel = new JPanel(new GridLayout(1, 4));
		mathPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel mathLabel = new JLabel("Math Grade:");
		JRadioButton mathPRadio = new JRadioButton("P");
		JRadioButton mathMRadio = new JRadioButton("M");
		JRadioButton mathERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup mathButtons = new ButtonGroup();
		mathButtons.add(mathPRadio);
		mathButtons.add(mathMRadio);
		mathButtons.add(mathERadio);

		// add items to panel
		mathPanel.add(mathLabel);
		mathPanel.add(mathPRadio);
		mathPanel.add(mathMRadio);
		mathPanel.add(mathERadio);

		// add panel to container
		viewPanel.add(mathPanel);

		// creates panel to hold label and radio buttons for ELA grade
		JPanel elaPanel = new JPanel(new GridLayout(1, 4));
		elaPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel elaLabel = new JLabel("ELA Grade:");
		JRadioButton elaPRadio = new JRadioButton("P");
		JRadioButton elaMRadio = new JRadioButton("M");
		JRadioButton elaERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup elaButtons = new ButtonGroup();
		elaButtons.add(elaPRadio);
		elaButtons.add(elaMRadio);
		elaButtons.add(elaERadio);

		// add items to panel
		elaPanel.add(elaLabel);
		elaPanel.add(elaPRadio);
		elaPanel.add(elaMRadio);
		elaPanel.add(elaERadio);

		// add panel to container
		viewPanel.add(elaPanel);

		// creates panel to hold label and radio buttons for science grade
		JPanel sciencePanel = new JPanel(new GridLayout(1, 4));
		sciencePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel scienceLabel = new JLabel("Science Grade:");
		JRadioButton sciencePRadio = new JRadioButton("P");
		JRadioButton scienceMRadio = new JRadioButton("M");
		JRadioButton scienceERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup scienceButtons = new ButtonGroup();
		scienceButtons.add(sciencePRadio);
		scienceButtons.add(scienceMRadio);
		scienceButtons.add(scienceERadio);

		// add items to panel
		sciencePanel.add(scienceLabel);
		sciencePanel.add(sciencePRadio);
		sciencePanel.add(scienceMRadio);
		sciencePanel.add(scienceERadio);

		// add panel to container
		viewPanel.add(sciencePanel);

		// creates panel to hold label and radio buttons for social studies grade
		JPanel ssPanel = new JPanel(new GridLayout(1, 4));
		ssPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel ssLabel = new JLabel("Social Studies Grade:");
		JRadioButton ssPRadio = new JRadioButton("P");
		JRadioButton ssMRadio = new JRadioButton("M");
		JRadioButton ssERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup ssButtons = new ButtonGroup();
		ssButtons.add(ssPRadio);
		ssButtons.add(ssMRadio);
		ssButtons.add(ssERadio);

		// add items to panel
		ssPanel.add(ssLabel);
		ssPanel.add(ssPRadio);
		ssPanel.add(ssMRadio);
		ssPanel.add(ssERadio);

		// add panel to container
		viewPanel.add(ssPanel);

		// creates panel for buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates buttons for save and cancel
		JButton saveButton = new JButton("Save Student");

		JButton cancelButton = new JButton("Cancel");
		CancelListener objCancelListener = new CancelListener();
		cancelButton.addActionListener(objCancelListener);

		// add buttons to panel
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);

		// add panel to container
		viewPanel.add(buttonPanel);
		
		// add view panel to container
		c.add(viewPanel);

		// activates name textfield
		nameField.grabFocus();

		// redraws container contents
		c.validate();
		c.repaint();
	}

	// sets view to edit student form
	public void editStudentView() {
		// clear container
		c.removeAll();

		// creates jlist object to show roster contents
		// adds dummy items to list for display testing
		DefaultListModel<String> studentList = new DefaultListModel();
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		studentList.addElement("Matt Showman");
		studentList.addElement("Nate Lewis");
		
		// creates jlist to store roster list
		// limits selection to one student at a time
		JList<String> rosterList = new JList<String>(studentList);
		rosterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		rosterList.setLayoutOrientation(JList.VERTICAL);
		
		// creates scrollbar for jlist object
		JScrollPane rosterScroller = new JScrollPane(rosterList);
		rosterScroller.setPreferredSize(new Dimension(10, 600));
		rosterScroller.setAlignmentX(RIGHT_ALIGNMENT);
		rosterScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		rosterScroller.getVerticalScrollBar().setUnitIncrement(10);
		
		// creates panel to hold roster list
		JPanel rosterPanel = new JPanel(new GridLayout(1, 1));
		rosterPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		rosterPanel.setPreferredSize(new Dimension(200, 600));

		// adds scrollbar (and attached jlist) to panel
		rosterPanel.add(rosterScroller);
		
		// creates panel to hold form fields
		JPanel formPanel = new JPanel(new GridLayout(7, 2));
		
		// creates panel to hold label and textfield for name
		JPanel namePanel = new JPanel(new GridLayout(1, 2));
		namePanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and textfield for name
		JLabel nameLabel = new JLabel("Student Name:");
		JTextField nameField = new JTextField();

		// add items to panel
		namePanel.add(nameLabel);
		namePanel.add(nameField);

		// add panel to formPanel
		formPanel.add(namePanel);

		// creates panel to hold label and radio buttons for general grade
		JPanel generalPanel = new JPanel(new GridLayout(1, 4));
		generalPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

		// creates label and radio buttons
		JLabel generalLabel = new JLabel("General Grade:");
		JRadioButton genPRadio = new JRadioButton("P");
		JRadioButton genMRadio = new JRadioButton("M");
		JRadioButton genERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup generalButtons = new ButtonGroup();
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
		JRadioButton mathPRadio = new JRadioButton("P");
		JRadioButton mathMRadio = new JRadioButton("M");
		JRadioButton mathERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup mathButtons = new ButtonGroup();
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
		JRadioButton elaPRadio = new JRadioButton("P");
		JRadioButton elaMRadio = new JRadioButton("M");
		JRadioButton elaERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup elaButtons = new ButtonGroup();
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
		JRadioButton sciencePRadio = new JRadioButton("P");
		JRadioButton scienceMRadio = new JRadioButton("M");
		JRadioButton scienceERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup scienceButtons = new ButtonGroup();
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
		JRadioButton ssPRadio = new JRadioButton("P");
		JRadioButton ssMRadio = new JRadioButton("M");
		JRadioButton ssERadio = new JRadioButton("E");

		// adds radio buttons to group to limit selection to one option
		ButtonGroup ssButtons = new ButtonGroup();
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
		buttonPanel.setBorder(new EmptyBorder(20,20,20,20));

		// creates buttons for save and cancel
		JButton saveButton = new JButton("Save Student");

		JButton cancelButton = new JButton("Cancel");
		CancelListener objCancelListener = new CancelListener();
		cancelButton.addActionListener(objCancelListener);

		// add buttons to panel
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);

		// add panel to formPanel
		formPanel.add(buttonPanel);

		// add rosterPanel and formPanel to layout panel
		c.add(rosterPanel, BorderLayout.LINE_START);
		c.add(formPanel, BorderLayout.CENTER);
		
		// redraws screen
		c.validate();
		c.repaint();
	}

	public void showSubjectView() {

	}

	private class AddStudentListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			addStudentView();
		}
	}

	private class EditStudentListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			editStudentView();
		}

	}

	private class SubjectMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This should show the Subject View.");
			showSubjectView();

		}
	}

	private class ReportMenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This should show the Report View.");

		}
	}

	private class CancelListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			defaultView();

		}
	}
}
