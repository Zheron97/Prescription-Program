// Zach Heronimus, zheronimus97@gmail.com

public class SortedList {
	private Link first;
	int size = 0;

	public SortedList() {
		first = null;
	}

	public void insertFirst(Customer customer) {
		size++;
		Link newLink = new Link(customer);
		if (first == null) {
			first = newLink;
		} else if (customer.getLastName().compareTo(first.customer.getLastName()) < 0) {
			newLink.next = first;
			first = newLink;
		} else {
			Link temp;
			Link prev;
			temp = first.next;
			prev = first;
			while (prev.next != null && customer.getLastName().compareTo(prev.next.customer.getLastName()) > 0) {
				prev = temp;
				temp = temp.next;
			}
			newLink.next = temp;
			prev.next = newLink;
		}
	}

	public int getSize() {
		return size;
	}

	public Customer getData(int index) {
		Link newLink = first;
		int count = 0;

		while (newLink != null) {
			if (count == index) {
				return newLink.customer;
			}
			count++;
			newLink = newLink.next;
		}

		return null;
	}

	public void displayList() {
		Link currentLink = first;
		while (currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
			System.out.println("");
		}
	}
}
