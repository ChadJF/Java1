package java_2.oop.phone;

public class PhoneApp {

	public static void main(String[] args) {
		System.out.println("Let's make a Phone App");
/*
		-Use this to instantiate CellPhones and run the functions on the CellPhone.  You can run the following functions here in the main method, or add methods on this PhoneApp class and invoke them here.  The latter is probably preferred :)
		-iPhone-12, Samsung Galaxy S21, and any other phone model of your choosing.
		-Add 3 unique contacts to each cell phone
		-Make a phone call from each Cell Phone to a contact in the contact list of that Cell Phone
		-Update the contact list of a specific contact on one cell phone
		-Remove a Contact of a specific contact on another cell phone
		-Add a new contact to one of the cell phones.
		-Search for a contact by name in one of the cell phones.
		-Make the CellPhone class implement the Phoneable interface.  Implement the methods how you see fit in the CellPhone Class
*/

		// inheritance and association, interfaces

		CellPhone chadsPhone = new CellPhone(750, "Samsung Galaxy S9001", "Verizon", true);
		CellPhone dumbPhone = new CellPhone(9999, "iPhone-12", "AT&T", false);
		CellPhone goodPhone = new CellPhone(925, "Samsung Galaxy S21", "Sprint", true);

		Contact person1 = new Contact("Some Body", "123456789", "IDK WHERE I AM");
		Contact person2 = new Contact("Red-Eyes", "12345678", "1234 Dragon Land");
		Contact person3 = new Contact("Blue-Eyes", "1234567", "4321 Dragon Land");

		Contact person4 = new Contact("Dark Magician", "123456", "7765 Man Cave");
		Contact person5 = new Contact("Celtic Garden", "12345", "5596 Open Forest");
		Contact person6 = new Contact("Mystical Elf", "1234", "7745 Spring Valley");

		Contact person7 = new Contact("Buster Blader", "123", "2249 Dragon Land");
		Contact person8 = new Contact("Galaxy-Eyes", "12", "8526 Dragon Land");
		Contact person9 = new Contact("Niko Gal", "1", "7964 Not a Card");

		chadsPhone.addContact(person1);
		chadsPhone.addContact(person2);
		chadsPhone.addContact(person3);

		dumbPhone.addContact(person4);
		dumbPhone.addContact(person5);
		dumbPhone.addContact(person6);

		goodPhone.addContact(person7);
		goodPhone.addContact(person8);
		goodPhone.addContact(person9);

		chadsPhone.updateContact(person1, "Told Me", "987654321", "I STILL DON'T KNOW WHERE I AM");

		chadsPhone.contactSearch(chadsPhone.contactList, person2);
	}
}
