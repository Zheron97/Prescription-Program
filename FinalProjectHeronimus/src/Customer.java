// Zach Heronimus, zheronimus97@gmail.com

public class Customer {

	// Created fields to be used with the customer object.
	private String firstName;
	private String lastName;
	private String address;
	private String prescription;
	private String deaNumber;
	private String unitOfMeasurement;
	private double dosage;
	private int quantity;

	// Customer constructor with no parameters.
	public Customer() {

	}

	// Constructor with parameters.
	public Customer(String fN, String lN, String address, String presc, String dea, String unitOfM, double dosage,
			int quant) {
		this.firstName = fN;
		this.lastName = lN;
		this.address = address;
		this.prescription = presc;
		this.deaNumber = dea;
		this.dosage = dosage;
		this.quantity = quant;
		this.unitOfMeasurement = unitOfM;
	}

	// Getters and setters below.
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getDeaNumber() {
		return deaNumber;
	}

	public void setDeaNumber(String deaNumber) {
		this.deaNumber = deaNumber;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public double getDosage() {
		return dosage;
	}

	public void setDosage(double dosage) {
		this.dosage = dosage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Displays the linked list for testing purposes.
	@Override
	public String toString() {
		return "Customer Information | Name: " + lastName + ", " + firstName + " | Address: " + address
				+ " | Prescription: " + prescription + " | DEA Number: " + deaNumber + " | Dosage: " + dosage + " mg"
				+ " | Quantity: " + quantity + "\n";
	}
}
