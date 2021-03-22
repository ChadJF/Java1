package java_3.serial;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String msgFileName = "Test";
        Message msg = new Message(987654, "This is a message");

        Serialization.serialization(msg, msgFileName);

        Fax.transmit(msg, msgFileName);

        Fax.receive(msg, msgFileName);
    }
}
