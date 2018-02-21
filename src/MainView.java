import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame {
	// declare variables
	Container c;

	public MainView() {

		// sets container to contentpane
		c = getContentPane();

		// sets 6 rows, 1 column layout
		c.setLayout(new GridLayout(7, 1));

		// menubar
		JMenuBar navBar = new JMenuBar();

		// roster menu
		JMenu rosterMenu = new JMenu("Roster");

		// add a student option of roster menu
		JMenuItem addRoster = new JMenuItem("Add a student");
		rosterMenu.add(addRoster);

		// action listener for add a student option
		AddStudentListener objAddListener = new AddStudentListener();
		addRoster.addActionListener(objAddListener);

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

	// sets view to add student form
	public void addStudentView() {
		// clear container
		c.removeAll();

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
		c.add(namePanel);

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
		c.add(generalPanel);

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
		c.add(mathPanel);

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
		c.add(elaPanel);

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
		c.add(sciencePanel);

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
		c.add(ssPanel);
		
		// creates panel for buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(20,20,20,20));
		
		// creates buttons for save and cancel
		JButton saveButton = new JButton("Save Student");
		JButton cancelButton = new JButton("Cancel");
		
		// add buttons to panel
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);
		
		// add panel to container
		c.add(buttonPanel);

		// activates name textfield
		nameField.grabFocus();

		// redraws container contents
		c.validate();
		c.repaint();
	}

	public void showSubjectView() {

	}

	private class AddStudentListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			System.out.println("This should show the Roster View.");

			c.removeAll();
			addStudentView();
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
}
