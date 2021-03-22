package java_2.oop.rainforest;

public class RainforestCreature extends Creature {
	//your code here
    public RainforestCreature(String name, String type, String[]food){super (name,type, food);}

    public void eat(){
        System.out.println(this.name+" eats "+String.join(", ", this.food));
    }
}
