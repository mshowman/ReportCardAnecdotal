import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RosterView {

	// declares components
	private Container c;
	private Roster r;

	private JPanel rosterPanel;
	private JComboBox<String> rosterCombo;
	private AddEditStudentListener objAddEditListner;

	private JPanel formPanel;

	private JPanel namePanel;
	private JLabel firstNameLabel;
	private JTextField firstNameField;
	private JLabel lastNameLabel;
	private JTextField lastNameField;

	private JPanel basicInfoPanel;
	private JLabel genderLabel;
	private ButtonGroup genderButtons;
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;

	private JPanel generalPanel;
	private JLabel generalLabel;
	private ButtonGroup generalButtons;
	private JRadioButton genPRadio;
	private JRadioButton genMRadio;
	private JRadioButton genERadio;

	private JPanel mathPanel;
	private JLabel mathLabel;
	private ButtonGroup mathButtons;
	private JRadioButton mathPRadio;
	private JRadioButton mathMRadio;
	private JRadioButton mathERadio;

	private JPanel elaPanel;
	private JLabel elaLabel;
	private ButtonGroup elaButtons;
	private JRadioButton elaPRadio;
	private JRadioButton elaMRadio;
	private JRadioButton elaERadio;

	private JPanel sciencePanel;
	private JLabel scienceLabel;
	private ButtonGroup scienceButtons;
	private JRadioButton sciencePRadio;
	private JRadioButton scienceMRadio;
	private JRadioButton scienceERadio;

	private JPanel ssPanel;
	private JLabel ssLabel;
	private ButtonGroup ssButtons;
	private JRadioButton ssPRadio;
	private JRadioButton ssMRadio;
	private JRadioButton ssERadio;

	private JPanel buttonPanel;
	private JButton saveButton;
	private JButton cancelButton;
	private CancelListener objCancelListener;
	private JButton deleteButton;
	private RemoveListener objRemoveListener;

	// constructor takes Container and sets it to Roster View
	public RosterView(Container c, Roster r) {
		// sets object's container to container that was passed
		this.c = c;
		this.c.removeAll();

		// sets object's roster to roster that was passed
		this.r = r;

		// creates panel to hold roster list
		rosterPanel = new JPanel(new BorderLayout());
		rosterPanel.setBorder(new EmptyBorder(10, 10, 0, 0));

		// creates dropdown for roster list
		rosterCombo = new JComboBox<String>(r.nameList());
		objAddEditListner = new AddEditStudentListener();
		rosterCombo.addActionListener(objAddEditListner);

		// add combobox to panel
		rosterPanel.add(rosterCombo);

		// creates panel to hold form fields
		formPanel = new JPanel(new GridLayout(9, 2));

		// creates panel to hold label and textfield for name
		GridLayout layout = new GridLayout(2, 2);
		layout.setVgap(10);

		namePanel = new JPanel(layout);
		namePanel.setBorder(new EmptyBorder(0, 20, 0, 20));

		// creates label and textfield for name
		firstNameLabel = new JLabel("Student's First Name:");
		firstNameField = new JTextField();

		lastNameLabel = new JLabel("Student's Last Name:");
		lastNameField = new JTextField();

		// add items to panel
		namePanel.add(firstNameLabel);
		namePanel.add(firstNameField);
		namePanel.add(lastNameLabel);
		namePanel.add(lastNameField);

		// add panel to formPanel
		formPanel.add(namePanel);

		// creates panel to hold gender
		basicInfoPanel = new JPanel(new GridLayout(1, 3));
		basicInfoPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates gender label and radio buttons
		genderLabel = new JLabel("Gender:");
		genderButtons = new ButtonGroup();
		maleRadio = new JRadioButton("Male");
		femaleRadio = new JRadioButton("Female");

		// add radiobuttons to buttongroup
		genderButtons.add(maleRadio);
		genderButtons.add(femaleRadio);

		// add gender to panel
		basicInfoPanel.add(genderLabel);
		basicInfoPanel.add(maleRadio);
		basicInfoPanel.add(femaleRadio);

		// add basicinfopanel to panel
		formPanel.add(basicInfoPanel);

		// creates panel to hold label and radio buttons for general grade
		generalPanel = new JPanel(new GridLayout(1, 4));
		generalPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates label and radio buttons
		generalLabel = new JLabel("General Grade:");
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
		mathPanel = new JPanel(new GridLayout(1, 4));
		mathPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates label and radio buttons
		mathLabel = new JLabel("Math Grade:");
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
		elaPanel = new JPanel(new GridLayout(1, 4));
		elaPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates label and radio buttons
		elaLabel = new JLabel("ELA Grade:");
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
		sciencePanel = new JPanel(new GridLayout(1, 4));
		sciencePanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates label and radio buttons
		scienceLabel = new JLabel("Science Grade:");
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
		ssPanel = new JPanel(new GridLayout(1, 4));
		ssPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates label and radio buttons
		ssLabel = new JLabel("Social Studies Grade:");
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
		buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(10, 20, 20, 10));

		// creates buttons for save, cancel, and delete
		// sets Action Listener for buttons
		saveButton = new JButton("Save Student");

		cancelButton = new JButton("Cancel");
		objCancelListener = new CancelListener();
		cancelButton.addActionListener(objCancelListener);

		deleteButton = new JButton("Remove Student");
		objRemoveListener = new RemoveListener();
		deleteButton.addActionListener(objRemoveListener);

		// add buttons to panel
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);
		buttonPanel.add(deleteButton);

		// hide delete button
		deleteButton.setVisible(false);

		// disable formPanel
		toggleFormEnabled(false);

		// add rosterPanel and formPanel to layout panel
		this.c.add(rosterPanel, BorderLayout.PAGE_START);
		this.c.add(formPanel, BorderLayout.CENTER);
		this.c.add(buttonPanel, BorderLayout.PAGE_END);

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

		// set defaults for buttons
		genMRadio.setSelected(true);
		mathMRadio.setSelected(true);
		elaMRadio.setSelected(true);
		scienceMRadio.setSelected(true);
		ssMRadio.setSelected(true);

		rosterCombo.setEnabled(!enabled);

		firstNameField.setEnabled(enabled);
		lastNameField.setEnabled(enabled);

		maleRadio.setEnabled(enabled);
		femaleRadio.setEnabled(enabled);

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
			firstNameField.requestFocusInWindow();

	}

	// clears the form fields and rosterlist's selection
	public void clearComponents() {
		firstNameField.setText("");
		lastNameField.setText("");
		genderButtons.clearSelection();
		generalButtons.clearSelection();
		mathButtons.clearSelection();
		elaButtons.clearSelection();
		scienceButtons.clearSelection();
		ssButtons.clearSelection();
		rosterCombo.setSelectedIndex(0);
		saveButton.setText("Save Student");
		deleteButton.setVisible(false);
	}

	public void setComponents(Student s) {
		firstNameField.setText(s.getFirstName());
		lastNameField.setText(s.getLastName());

		switch (s.getGender()) {
		case 'M':
			maleRadio.setSelected(true);
			break;

		default:
			femaleRadio.setSelected(true);
			break;
		}

		char[] grades = s.getGrades();

		switch (grades[0]) {
		case 'P':
			genPRadio.setSelected(true);
			break;

		case 'M':
			genMRadio.setSelected(true);
			break;

		default:
			genERadio.setSelected(true);
			break;
		}

		switch (grades[1]) {
		case 'P':
			mathPRadio.setSelected(true);
			break;

		case 'M':
			mathMRadio.setSelected(true);
			break;

		default:
			mathERadio.setSelected(true);
			break;
		}

		switch (grades[2]) {
		case 'P':
			elaPRadio.setSelected(true);
			break;

		case 'M':
			elaMRadio.setSelected(true);
			break;

		default:
			elaERadio.setSelected(true);
			break;
		}

		switch (grades[3]) {
		case 'P':
			sciencePRadio.setSelected(true);
			break;

		case 'M':
			scienceMRadio.setSelected(true);
			break;

		default:
			scienceERadio.setSelected(true);
			break;
		}

		switch (grades[4]) {
		case 'P':
			ssPRadio.setSelected(true);
			break;

		case 'M':
			ssMRadio.setSelected(true);
			break;

		default:
			ssERadio.setSelected(true);
			break;
		}

		saveButton.setText("Update Student");
		deleteButton.setVisible(true);

	}

	// calls toggleFormEnabled, passing true to enable form fields
	private class AddEditStudentListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			toggleFormEnabled(true);

			if (rosterCombo.getSelectedIndex() != 0) {
				setComponents(r.getStudent(rosterCombo.getSelectedIndex()));
			}
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

	// removes student if yes is chosen
	private class RemoveListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			int dialogButton = JOptionPane.YES_NO_OPTION;

			int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure that you want to remove this student?",
					"Removing Student", dialogButton);

			if (dialogResult == 0) {
				
				System.out.println(r.getStudent(rosterCombo.getSelectedIndex()).getFullName());

				r.removeStudent(r.getStudent(rosterCombo.getSelectedIndex()));

				rosterCombo.removeAllItems();

				String[] names = r.nameList();

				for (String string : names) {
					rosterCombo.addItem(string);
				}

				clearComponents();
				toggleFormEnabled(false);
			}
		}
	}
}
