package java_3.serial;

import java.io.IOException;

public class Fax {

/*	Properties :
		brand
		model
		year

	Methods :
		transmit(message)
		receive(message)

 */

	String brand;
	String model;
	String year;

	public Fax(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public static void transmit(Message msg, String msgFileName) throws IOException {
		//The transmit message must serialize a Message, and write it to a file.
		Serialization.serialization(msg, msgFileName);
	}

	public static void receive(Message msg, String msgFileName) throws IOException, ClassNotFoundException {
//		The receive method should deserialize a message by reading it in from a file. and then print it to the console.
		Message reMsg = (Message) Serialization.deserialization(msgFileName);
		System.out.println(reMsg);
	}

	@Override
	public String toString() {
		return "Fax{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", year='" + year + '\'' +
				'}';
	}
}
