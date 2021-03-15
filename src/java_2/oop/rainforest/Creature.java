package java_2.oop.rainforest;

public abstract class Creature {
//	Define 1 common characteristic that any Creature may generally possess
    protected String name;
    protected String type;
    protected String[] food;

    public Creature(String name, String type, String[] food){
        this.name = name;
        this.type = type;
        this.food = food;
    }

//	Define 1 common action that any Creature may generally perform
}
