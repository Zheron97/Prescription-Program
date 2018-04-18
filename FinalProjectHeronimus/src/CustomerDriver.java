import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//Zach Heronimus, zheronimus97@gmail.com

public class CustomerDriver {

	// Created customer object with no parameters.
	static Customer customer = new Customer();

	// Variable to keep track of the current index.
	static int currentIndex = 0;

	public static void main(String[] args) {

		// Created GUI.
		GUI customerGUI = new GUI();

		// Created linked list.
		SortedList customerList = new SortedList();

		// Coded button that adds customers into the linked list.
		customerGUI.addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * Created a try-catch for a potential number format exception.
				 * If the user entered an alphabetic character into the quantity
				 * or dosage fields an exception is thrown.
				 **/
				try {
					// Set the fields of the customer object to be equal to the
					// data entered into the textboxes.
					customer.setFirstName(customerGUI.firstNameText.getText());
					customer.setLastName(customerGUI.lastNameText.getText());
					customer.setAddress(customerGUI.addressText.getText());
					customer.setPrescription(customerGUI.prescriptionText.getText());
					customer.setDeaNumber(customerGUI.deaNumberText.getText());
					customer.setDosage(Double.parseDouble(customerGUI.dosageText.getText()));
					customer.setQuantity(Integer.parseInt(customerGUI.quantityText.getText()));
					customer.setUnitOfMeasurement(customerGUI.measurementSelect.getSelectedItem().toString());

					/**
					 * If statement that checks to see if the DEA number is
					 * equal to 9 characters and the first and last name fields
					 * do not include numeric characters.
					 **/
					if (customer.getDeaNumber().length() != 9 || customer.getFirstName().matches("[-+]?\\d*\\.?\\d+")
							|| customer.getLastName().matches("[-+]?\\d*\\.?\\d+")) {

						/**
						 * Throws a specific error message if the DEA number is
						 * less than or greater than the nine characters.
						 **/
						if (customer.getDeaNumber().length() != 9) {
							JOptionPane.showMessageDialog(null,
									"Customer not added.\n" + "DEA number length must be equal to nine characters.",
									"An Error Occurred", 0);
						}

						/**
						 * Throws a specific error message if the first or last
						 * name fields contain numeric characters.
						 **/
						if (customer.getFirstName().matches("-?\\d+(\\.\\d+)?")
								|| customer.getLastName().matches("-?\\d+(\\.\\d+)?")) {
							JOptionPane.showMessageDialog(null,
									"Customer not added.\n"
											+ "First & last name fields must be an alphabetic character.",
									"An Error Occurred", 0);
						}

						/**
						 * If validation is passed the customer gets entered
						 * into the linked list.
						 **/
					} else {
						customerList.insertFirst(new Customer(customer.getFirstName(), customer.getLastName(),
								customer.getAddress(), customer.getPrescription(), customer.getDeaNumber(),
								customer.getUnitOfMeasurement(), customer.getDosage(), customer.getQuantity()));

						// Clears text boxes after the customer is entered.
						customerGUI.firstNameText.setText("");
						customerGUI.lastNameText.setText("");
						customerGUI.addressText.setText("");
						customerGUI.prescriptionText.setText("");
						customerGUI.deaNumberText.setText("");
						customerGUI.dosageText.setText("");
						customerGUI.quantityText.setText("");
						customerGUI.measurementSelect.setSelectedIndex(0);

						/**
						 * The current index increases so that the data entered
						 * for the next customer is not in the same index.
						 **/
						currentIndex++;
					}

					/**
					 * Throws error message if the quantity or dosage fields
					 * contain alphabetic characters.
					 **/
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Customer not added.\n" + "Quantity & Dosage must be number values.");
				}
			}
		});

		/**
		 * Coded submit button that takes the user to window that displays the
		 * customer information entered.
		 **/
		customerGUI.submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				/**
				 * Try-catch that checks to see if the data entered by the user
				 * is not null. If the user did not enter in any data then the
				 * program terminates.
				 **/
				try {
					// Disposes of the first window.
					customerGUI.frame.dispose();

					// Brings the second window into view.
					customerGUI.frameTwo.setVisible(true);

					/**
					 * Current index is set to zero so that the first customer
					 * in the linked list is displayed.
					 **/
					currentIndex = 0;

					/**
					 * Sets the initial data in the labels that display the
					 * customer information entered.
					 **/
					setLabelThree(customerGUI, customerList);

					/**
					 * Throws an error message that tells the user that no valid
					 * data was entered.
					 **/
				} catch (NullPointerException ex) {
					customerGUI.frameTwo.dispose();
					JOptionPane.showMessageDialog(null, "No valid customer data entered.\n" + "Program terminated.",
							"An Error Occurred", 0);
				}
			}
		});

		/**
		 * Coded button that clears the information that is currently entered
		 * into the text boxes and combo box.
		 **/
		customerGUI.clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				customerGUI.firstNameText.setText("");
				customerGUI.lastNameText.setText("");
				customerGUI.addressText.setText("");
				customerGUI.prescriptionText.setText("");
				customerGUI.deaNumberText.setText("");
				customerGUI.dosageText.setText("");
				customerGUI.quantityText.setText("");
				customerGUI.measurementSelect.setSelectedIndex(0);
			}
		});

		/**
		 * Coded button that gets the customer information at the previous
		 * index. Loops to the ending link if the current link is the first
		 * link.
		 **/
		customerGUI.previousButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentIndex == 0) {
					currentIndex = customerList.getSize() - 1;
					customer = customerList.getData(currentIndex);
					setLabelThree(customerGUI, customerList);
				} else {
					currentIndex -= 1;
					customer = customerList.getData(currentIndex);
					setLabelThree(customerGUI, customerList);
				}
			}
		});

		/**
		 * Coded button that gets the customer information at the next index.
		 * Loops around if the linked list is at its final link.
		 **/
		customerGUI.nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentIndex >= customerList.getSize() - 1) {
					currentIndex = 0;
					customer = customerList.getData(currentIndex);
					setLabelThree(customerGUI, customerList);
				} else {
					currentIndex += 1;
					customer = customerList.getData(currentIndex);
					setLabelThree(customerGUI, customerList);
				}
			}
		});
	}

	// Method that sets the labels to equal the data at the current index.
	public static void setLabelThree(GUI customerGUI, SortedList customerList) {
		customerGUI.fNValueLabel.setText(" " + customerList.getData(currentIndex).getFirstName());
		customerGUI.lNValueLabel.setText(" " + customerList.getData(currentIndex).getLastName());
		customerGUI.addressValueLabel.setText(" " + customerList.getData(currentIndex).getAddress());
		customerGUI.prescValueLabel.setText(" " + customerList.getData(currentIndex).getPrescription());
		customerGUI.deaNumValueLabel.setText(" " + customerList.getData(currentIndex).getDeaNumber());
		customerGUI.dosageValueLabel.setText(" " + Double.toString(customerList.getData(currentIndex).getDosage()) + " "
				+ customerList.getData(currentIndex).getUnitOfMeasurement());
		customerGUI.quantValueLabel
				.setText(" " + Integer.toString(customerList.getData(currentIndex).getQuantity()) + " ea");
	}
}
