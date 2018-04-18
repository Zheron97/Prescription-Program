import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.BorderFactory;

// Zach Heronimus, zheronimus97@gmail.com

public class GUI {

	/**
	 * Units of measurement for medication. mcg = microgram, mg = milligram, g =
	 * gram, kg = kilogram, mL = milliliter, L = liter, ea = each.
	 **/
	String[] unitsOfMeasurement = { "mcg", "mg", "g", "kg", "mL", "L", "count" };

	/**
	 * Created a frame and a panel that holds the GUI components used to enter
	 * in the customer information.
	 **/
	private JPanel panel = new JPanel();
	JFrame frame = new JFrame("Customer Prescription Program");

	/**
	 * Created a frame and a panel that holds the GUI components to display the
	 * information entered in by the user.
	 **/
	private JPanel panelTwo = new JPanel();
	JFrame frameTwo = new JFrame("Customer Information");

	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox measurementSelect = new JComboBox(unitsOfMeasurement);

	// Created text fields that are used to enter in customer information.
	JTextField firstNameText = new JTextField();
	JTextField lastNameText = new JTextField();
	JTextField addressText = new JTextField();
	JTextField prescriptionText = new JTextField();
	JTextField deaNumberText = new JTextField();
	JTextField dosageText = new JTextField();
	JTextField quantityText = new JTextField();

	/**
	 * Created labels for the first frame that are used to instruct the user
	 * about what information should be entered in which text box.
	 **/
	JLabel firstNameLabel = new JLabel("First Name:");
	JLabel lastNameLabel = new JLabel("Last Name:");
	JLabel addressLabel = new JLabel("Address:");
	JLabel prescriptionLabel = new JLabel("Prescription:");
	JLabel deaNumberLabel = new JLabel("DEA Number:");
	JLabel dosageLabel = new JLabel("Dosage:");
	JLabel quantityLabel = new JLabel("Quantity:");

	/**
	 * Created labels for the second frame that are used to instruct the user
	 * about what information should be entered in which text box.
	 **/
	JLabel firstNameLabelTwo = new JLabel("First Name:");
	JLabel lastNameLabelTwo = new JLabel("Last Name:");
	JLabel addressLabelTwo = new JLabel("Address:");
	JLabel prescriptionLabelTwo = new JLabel("Prescription:");
	JLabel deaNumberLabelTwo = new JLabel("DEA Number:");
	JLabel dosageLabelTwo = new JLabel("Dosage:");
	JLabel quantityLabelTwo = new JLabel("Quantity:");

	/**
	 * Created labels for the second frame that display the values that the user
	 * entered in on the first frame.
	 **/
	JLabel fNValueLabel = new JLabel();
	JLabel lNValueLabel = new JLabel();
	JLabel addressValueLabel = new JLabel();
	JLabel prescValueLabel = new JLabel();
	JLabel deaNumValueLabel = new JLabel();
	JLabel dosageValueLabel = new JLabel();
	JLabel quantValueLabel = new JLabel();

	// Creates a border to be used around labels on the second panel.
	Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	// Created buttons that perform events when clicked.
	JButton addButton = new JButton("Add");
	JButton submitButton = new JButton("Submit");
	JButton clearButton = new JButton("Clear");
	JButton previousButton = new JButton("Previous");
	JButton nextButton = new JButton("Next");

	/**
	 * Constructor that holds the components of the GUI class. Used to
	 * create/edit the GUI in the driver class.
	 **/
	public GUI() {

		// Set properties for the first frame and panel.
		frame.setSize(400, 400);
		// First frame is initially set as visible.
		frame.setVisible(true);
		// Frame cannot be resized for design purposes.
		frame.setResizable(false);
		// Exits the program when the frame is closed.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setSize(350, 350);
		panel.setLayout(null);
		frame.add(panel);
		// Centers the frame in relation to the resolution of the user's
		// monitor.
		frame.setLocationRelativeTo(null);

		/**
		 * Set properties for the second frame and panel. The properties are the
		 * same as the first panel.
		 **/
		frameTwo.setSize(400, 400);
		frameTwo.setResizable(false);
		frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelTwo.setSize(350, 350);
		panelTwo.setLayout(null);
		frameTwo.add(panelTwo);
		frameTwo.setLocationRelativeTo(null);

		// Sets location and sizes labels on the first panel.
		firstNameLabel.setBounds(30, 45, 150, 20);
		lastNameLabel.setBounds(30, 75, 150, 20);
		addressLabel.setBounds(30, 105, 150, 20);
		prescriptionLabel.setBounds(30, 135, 150, 20);
		deaNumberLabel.setBounds(30, 165, 150, 20);
		dosageLabel.setBounds(30, 195, 150, 20);
		quantityLabel.setBounds(30, 225, 150, 20);

		// Sets the location and sizes the labels on the second panel.
		firstNameLabelTwo.setBounds(70, 45, 150, 20);
		lastNameLabelTwo.setBounds(70, 75, 150, 20);
		addressLabelTwo.setBounds(70, 105, 150, 20);
		prescriptionLabelTwo.setBounds(70, 135, 150, 20);
		deaNumberLabelTwo.setBounds(70, 165, 150, 20);
		dosageLabelTwo.setBounds(70, 195, 150, 20);
		quantityLabelTwo.setBounds(70, 225, 150, 20);

		// Sets the location and sizes the value labels on the second panel.
		fNValueLabel.setBounds(170, 45, 150, 20);
		lNValueLabel.setBounds(170, 75, 150, 20);
		addressValueLabel.setBounds(170, 105, 150, 20);
		prescValueLabel.setBounds(170, 135, 150, 20);
		deaNumValueLabel.setBounds(170, 165, 150, 20);
		dosageValueLabel.setBounds(170, 195, 150, 20);
		quantValueLabel.setBounds(170, 225, 150, 20);

		// Sets the location and sizes the text boxes on the first panel.
		firstNameText.setBounds(115, 45, 150, 20);
		lastNameText.setBounds(115, 75, 150, 20);
		addressText.setBounds(115, 105, 150, 20);
		prescriptionText.setBounds(115, 135, 150, 20);
		deaNumberText.setBounds(115, 165, 150, 20);
		dosageText.setBounds(115, 195, 150, 20);
		quantityText.setBounds(115, 225, 150, 20);

		// Sets the location and sizes the combo box on the first panel.
		measurementSelect.setBounds(275, 195, 75, 20);

		// Sets the location and sizes the buttons on the first panel.
		addButton.setBounds(20, 285, 100, 30);
		submitButton.setBounds(147, 285, 100, 30);
		clearButton.setBounds(275, 285, 100, 30);

		// Sets the location and sizes the buttons on the second panel.
		previousButton.setBounds(70, 285, 100, 30);
		nextButton.setBounds(220, 285, 100, 30);

		// Code below adds components to the panels.
		panel.add(firstNameLabel);
		panel.add(lastNameLabel);
		panel.add(addressLabel);
		panel.add(prescriptionLabel);
		panel.add(deaNumberLabel);
		panel.add(dosageLabel);
		panel.add(quantityLabel);

		panel.add(firstNameText);
		panel.add(lastNameText);
		panel.add(addressText);
		panel.add(prescriptionText);
		panel.add(deaNumberText);
		panel.add(dosageText);
		panel.add(quantityText);

		panel.add(measurementSelect);

		panel.add(addButton);
		panel.add(submitButton);
		panel.add(clearButton);

		panelTwo.add(firstNameLabelTwo);
		panelTwo.add(lastNameLabelTwo);
		panelTwo.add(addressLabelTwo);
		panelTwo.add(prescriptionLabelTwo);
		panelTwo.add(deaNumberLabelTwo);
		panelTwo.add(dosageLabelTwo);
		panelTwo.add(quantityLabelTwo);

		panelTwo.add(fNValueLabel);
		panelTwo.add(lNValueLabel);
		panelTwo.add(addressValueLabel);
		panelTwo.add(prescValueLabel);
		panelTwo.add(deaNumValueLabel);
		panelTwo.add(dosageValueLabel);
		panelTwo.add(quantValueLabel);

		fNValueLabel.setBorder(border);
		lNValueLabel.setBorder(border);
		addressValueLabel.setBorder(border);
		prescValueLabel.setBorder(border);
		deaNumValueLabel.setBorder(border);
		dosageValueLabel.setBorder(border);
		quantValueLabel.setBorder(border);

		panelTwo.add(previousButton);
		panelTwo.add(nextButton);
	}
}