package java_2.oop.phone;

public interface Phoneable {
	//		Anything that implements Phoneable has the following functionality :
	//		call() ring(), hangUp(), pickUp(); powerOff(); powerOn();  Implement these methods how you see fit in the CellPhone Class

    public void call(Contact contact);
    public void ring();
    public void hangUp();
    public void pickUp();
    public void powerOff();
    public void powerOn();

}
