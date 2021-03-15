package java_2.oop.monkey;

import java.util.ArrayList;
import java.util.List;

class MonkeyCage {

    public List<Monkey> monkeys = new ArrayList();

    boolean areMonkeysSmiling(List<Monkey> monkeys) {
    //We have an array of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        int teeth = 0;
        int cavities = 0;

        for (Monkey notChimps : monkeys){
            if (notChimps.smiling == true){
                teeth++;
            }
            else {
                cavities++;
            }
        }

        if (teeth >= cavities){
            System.out.println("Monkeys are smiling");

            return true;
        }
        else {
            System.out.println("Monkeys are not smiling");

            return false;
        }
    }

    Monkey addMonkey(Monkey monkey) {
//        add a new monkey to the MonkeyCage
        monkeys.add(monkey);

        return monkey;
    }

    void removeMonkey(Monkey monkey) {
//        remove a monkey from the MonkeyCage
        monkeys.remove(monkey);
    }

    class Monkey { //inner class.  DO NOT MOVE THIS CLASS
        String name;
        boolean smiling;

        public Monkey(String name, boolean smiling) {
            this.name = name;
            this.smiling = smiling;
        }

        @Override
        public String toString() {
            return "Monkey{" +
                    "name='" + name + '\'' +
                    ", smiling=" + smiling +
                    '}';
        }
    }
}