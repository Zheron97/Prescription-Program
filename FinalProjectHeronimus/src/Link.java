// Zach Heronimus, zheronimus97@gmail.com

public class Link {
	// Created customer object as the data for the Link.
	public Customer customer;
	// Created a Link to get the next Link.
	public Link next;

	// Link constructor that has a customer object as a parameter.
	public Link(Customer c) {
		customer = c;
	}

	// Displays a link for testing purposes.
	public void displayLink() {
		System.out.print("{" + customer + "}");
	}
}
