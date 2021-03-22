package java_1.dataTypes;

import java.util.Random;

class Arrays {
    public static void main(String[] args){
        var myArrays = new Arrays();
        myArrays.printNums();
        myArrays.greet("Chad");
        myArrays.bitsToBinaries();
        myArrays.keepColors();
    }

    int[] nums = new int[]{10,23,3,4,5,2,1};
    String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};

    void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        for (int element: nums) {
            System.out.println(element);
        }
    };

    void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        System.out.println(greetings[index]+" "+name);
    };

    boolean[] bitsToBinaries() {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        for (int element: bits) {
            if (element == 1) {
                System.out.println("true");
            }
            else if (element == 0){
                System.out.println("false");
            }
        }
            return null;
    };

    String[] keepColors() {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]

        String[] newColors = java.util.Arrays.stream(colors).filter((s -> s.toLowerCase().contains("blue") || s.toLowerCase().contains("green") || s.toLowerCase().contains("pink") || s.toLowerCase().contains("red") || s.toLowerCase().contains("yellow") || s.toLowerCase().contains("black") || s.toLowerCase().contains("white"))).toArray(String[]::new);
        for (String i: newColors){
            System.out.println(i);
        }

        return null;
    }

}







