package java_1.dataTypes;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class

		var myArrays = new JavaChallenges();
		myArrays.printMsg("hello world", 3);
		System.out.println(nthFibonacci(7));
		myArrays.calcPay(80, 50, 8);
		myArrays.solveQuadratic(4, 2, 11);
		myArrays.countQuarters(10.5);
		myArrays.reverseString("hello world");
		System.out.println(shuffleMessage("Hi Dear Friend"));
		myArrays.calcGPA();
		myArrays.printEgg();
	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */

		for (int i = 0; i < repeats; i++) {
			System.out.println(msg);
		}

	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */

		if (n <= 1)
			return n;
		return nthFibonacci(n-1) + nthFibonacci(n-2);

//		return 1;
	}

	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		double totalPay = hrsPerPeriod * hourlyRate * payPeriods;
		System.out.println(totalPay);

		return 0.0d;
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */

		double equation = Math.pow(x, 2) + y + z;
		System.out.println(equation);

		return x;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42

		double change = amount / .25;
		System.out.println(change);

		return 0;
	}

	static String reverseString(String str) {
		//reverse the input string and return it.

		StringBuilder input = new StringBuilder();
		input.append(str);
		input.reverse();
		System.out.println(input);

		return str;
	}

	static String shuffleMessage(String messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		List<String> letters = Arrays.asList(messages.split(" "));
		Collections.shuffle(letters);
		StringBuilder builder = new StringBuilder();
		for (String letter : letters) {
			builder.append(letter);
		}
		return builder.toString();

//		return null;
	}

	static double calcGPA() {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */

		double total = 0;

		int[] scores = {66, 50, 90, 70, 85, 100, 91};

		for(int i=0; i<scores.length; i++){
			total = total + scores[i];
		}
		double average = total / scores.length;

		if (average >= 90 || average < 100){
			System.out.println("GPA = 4.0");
		}
		else if (average >= 80 || average < 90){
			System.out.println("GPA = 3.0");
		}
		else if (average >= 70 || average < 80){
			System.out.println("GPA = 2.0");
		}
		else if (average >= 60 || average < 70){
			System.out.println("GPA = 1.0");
		}
		else if (average >= 0 || average < 60){
			System.out.println("GPA = 0.0");
		}

		return 4.0;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/

		System.out.println("\t\t  _______\n" +
				"\t\t /       \\\n" +
				"\t\t/         \\\n" +
				"\t\t-\"-'-\"-'-\"-\n" +
				"\t\t\\         /\n" +
				"\t\t \\_______/");
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
			return 0.0;

		}
	}