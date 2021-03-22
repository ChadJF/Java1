package java_2.oop.phone;

class Contact {
/*
	Properties :
        - Name
        - Phone number
		- Address
*/

    String name;
    String phoneNum;
    String address;

    public Contact(String name, String phoneNum, String address) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

