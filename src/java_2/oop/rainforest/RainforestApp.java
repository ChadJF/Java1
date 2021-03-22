package java_2.oop.rainforest;

import java.sql.SQLOutput;

public class RainforestApp {

	public static void main(String[] args) {

	//	You are exploring the rainforests of the Amazon.  You have observed many different types of wildlife on your excursion.  To jog your memory,  different kinds of Rainforest Animals that you observed are found in the following URL : https://www.ietravel.com/blog/amazon-rainforest-animals-beginners-guide-21-species.  Feel free to use additional resources for more animal ideas.

	//	Pick 6 rainforest creatures and model them using the RainforestCreature class. i.e. Instantiate 6 rainforest creatures. Each Rainforest Creature should have 1 unique characteristic , and 1 unique action that it can do in addition to any general characteristics and actions that Creatures can do in general.*/

/*		Instantiate all 6 rainforest creatures here, print to the console each Rainforest Creature as a String representation, and have them perform any actions defined in the RainforestCreature class.

		ex : RainforestCreature riverDolphin = new RiverDolphin("riverDolphin","Amazon","pink",new String[]{"fish","crabs","turtles"};
			System.out.println(riverDolphin); => RiverDolphin{ properties... }.
			riverDolphin.eat() => "The river dolphin is eating fish."

		choose your own characteristics and methods to model).

*/
		// Polymorphism, abstraction, extension

		// RainforestCreature creature;

		RainforestCreature armadillo = new RainforestCreature("Armadillo", "mammal", new String[]{"insects", "fruits"});
		RainforestCreature otter = new RainforestCreature("Otter", "mammal", new String[]{"fish", "birds"});
		RainforestCreature jaguar = new RainforestCreature("Jaguar", "mammal", new String[]{"rodent", "fish", "birds", "mammals"});
		RainforestCreature ocelot = new RainforestCreature("Ocelot", "mammal", new String[]{"birds", "snakes", "monkeys"});
		RainforestCreature toucan = new RainforestCreature("Toucan", "mammal", new String[]{"insects", "fruits", "eggs", "small birds"});
		RainforestCreature dartFrog = new RainforestCreature("Dart Frog", "amphibian", new String[]{"insects", "more insects", "even more insects"});

		System.out.println("Name: "+armadillo.name+" Type: "+armadillo.type+" Food: "+String.join(", ", armadillo.food));
		armadillo.eat();
	}

}
