package phonebook;

public interface PhoneBookADT {

	void addContact(Contact c);
	void addContactsFromfile(String fileName);
	void reverseList(int NodesToReverse);
	String toString(int index);
	
}
