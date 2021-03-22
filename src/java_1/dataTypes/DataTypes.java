package java_1.dataTypes;

import java.util.Scanner;

class DataTypes {

//		boolean number = 2021;
	boolean number = true;
//		byte yearOfBirth = 1977;
	int yearOfBirth = 1997;
//		Array nums = [3,4,5,6,7,8,10,12];
	int nums[] = {3,4,5,6,7,8,10,12};
//		Object movieName = "Meet The Parents";.
	String movieName = "Meet The Parents";
//		double male = 'm';
	char male = 'm';
//		triple triplet = 3L;
	long triplet = 3L;
//		float female = 'f';
	char female = 'f';
//		short decimalVal = .0000000000001f;
	double decimalVal = .0000000000001f;
//		long halfByte = 0101;
	byte halfByte = 0101;


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs

		var myArrays = new DataTypes();
		myArrays.yearsToMonths();
		myArrays.monthsToHours();
		myArrays.daysToSeconds();
		myArrays.centuriesToSeconds();
		myArrays.dollarsToBitcoin();
		myArrays.canDrive();
	}

	void yearsToMonths() {
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		System.out.println("Enter years: ");
		Scanner scanner = new Scanner(System.in);
		int years = scanner.nextInt();
		int months = years*12;
		System.out.println("Months = "+months);
	}

	void monthsToHours() {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours <- This is literally impossible, correct answer is 5840 hours
		System.out.println("Enter months: ");
		Scanner scanner = new Scanner(System.in);
		int months = scanner.nextInt();
		int hours = months*730;
		System.out.println("Hours = "+hours);
	}

	void daysToSeconds() {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 years => 17520 hours Typo
		System.out.println("Enter days: ");
		Scanner scanner = new Scanner(System.in);
		long days = scanner.nextInt();
		long seconds = days*86400;
		System.out.println("Seconds = "+seconds);
	}

	void centuriesToSeconds() {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds
		System.out.println("Enter centuries: ");
		Scanner scanner = new Scanner(System.in);
		double centuries = scanner.nextInt();
		double seconds = centuries*(3.1556952 * (Math.pow(10, 9)));
		System.out.println("Seconds = "+seconds);
	}

	void dollarsToBitcoin() {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars
		System.out.println("Enter dollars: ");
		Scanner scanner = new Scanner(System.in);
		double dollars = scanner.nextInt();
		double bitcoin = dollars/35000;
		System.out.println("Bitcoin = "+bitcoin);
	}

	void canDrive() {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		System.out.println("Enter age: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("Able to drive.");
		}
		else if (age > 15) {
			System.out.println("Needs a permit to drive.");
		}
		else {
			System.out.println("Too young to drive.");
		}
	}

	String[] getDataTypes(int num1, boolean bool1, long long1) {
//		Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.
		System.out.println("Enter num1: ");
		Scanner scanner1 = new Scanner(System.in);
		num1 = scanner1.nextInt();
		System.out.println("Enter boolean: ");
		Scanner scanner2 = new Scanner(System.in);
//		bool1 = scanner2.nextInt();
		System.out.println("Enter long1: ");
		Scanner scanner3 = new Scanner(System.in);
		long1 = scanner3.nextInt();

		return new String[]{null,null,null};
	}

}