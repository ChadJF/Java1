package java_2.oop.phone;

import java.util.ArrayList;
import java.util.List;

class CellPhone implements Phoneable {
/*
	* Properties :
	* 	contact list
	* 	cost
	*   carrier (Verizon, AT&T, T-Mobile, etc.)
	*   brand (Apple, Samsung, Motorola, etc.)
	* 	power (is the phone turned on or off? yes or no)

	* Functionality :
	 	- call(Contact); display a message indicating the Contact's phone number is being called. Note that the cell phone can only call contacts that are in the contact list.
		- addContact(Contact) add a new Contact to the contact list.
		- updateContact(Contact) //setter
		****When adding or updating be sure to check if the contact already exists****
		- removeContact(Contact) remove a contact from the contact list of the cell phone
		- searchContacts(Contact) return a contact from the contact list if one exists.
		* getters and setters for carrier, brand, and cost

****Be sure not to expose the inner workings of the CellPhone (use concepts of encapsulation)**
*/

    List<Contact> contactList = new ArrayList<>();
    int cost;
    String carrier;
    String brand;
    boolean power;

    public CellPhone(int cost, String carrier, String brand, boolean power) {
        this.cost = cost;
        this.carrier = carrier;
        this.brand = brand;
        this.power = power;
    }

    public void addContact(Contact contact) {
        if (contactList.contains(contact)){
            System.out.println("This contact currently exists already.");
        }
        else {
            contactList.add(contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void removeContact(Contact contact) {
        contactList.remove(contact);
        System.out.println("Contact has been removed.");
    }

    public void updateContact(Contact contact, String name, String phoneNum, String address) {
        if (contactList.contains(contact)){
            contact.setName(name);
            contact.setPhoneNum(phoneNum);
            contact.setAddress(address);
            System.out.println(contact);
        }
        else {
            System.out.println("This contact doesn't exist.");
        }
    }

    public void contactSearch(List<Contact> contactList, Contact contact) {
        if (contactList.contains(contact)){
            System.out.println(contact);
        }
        else {
            System.out.println("This contact doesn't exist.");
        }
    }

    @Override
    public void call(Contact contact) {
        System.out.println("Calling: "+contact.name+"...");
    }

    @Override
    public void ring() {

    }

    @Override
    public void hangUp() {

    }

    @Override
    public void pickUp() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void powerOn() {

    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "contactList=" + contactList +
                ", cost=" + cost +
                ", carrier='" + carrier + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }
}


