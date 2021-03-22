package java_2.oop.bank;

public class Customer {
    String firstName = "";
    String lastName = "";
    int ssn = 0;
    String dob = "";
    double wallet = 0;

    public Customer(String fName, String lName, int social, String birthDate, double dollarAmount) {
        this.firstName = fName;
        this.lastName = lName;
        this.ssn = social;
        this.dob = birthDate;
        this.wallet = dollarAmount;

        // ...
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public String getDob() {
        return dob;
    }

    public double getWallet() {
        return wallet;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    /*
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn=" + ssn +
                ", dob='" + dob + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}

