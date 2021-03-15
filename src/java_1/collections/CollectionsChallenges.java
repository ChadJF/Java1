package java_1.collections;

import java_1.dataTypes.JavaChallenges;

import java.util.*;

public class CollectionsChallenges {

	public static void main(String[] args) {
//		Complete the code challenges for the following static methods

		var myArrays = new CollectionsChallenges();
		myArrays.findVal(3);
		myArrays.convertArrToList();
		myArrays.listToSet();
		myArrays.addToList(9);
		myArrays.removeFromList(3);
		myArrays.insertIntoList(2, 3);
		myArrays.reverseNums();
		// mutate linked list
		myArrays.removeDuplicates();
	}


	static int findVal(int val) {
//		find a value in the input array list.  return it if found.  If not, return 0.
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(8);
		arrList.add(2);
		arrList.add(6);
		arrList.add(3);

		if (arrList.contains(val)){
			return val;
		}
		else {
			return 0;
		}
	}

	static List convertArrToList() {
//		convert the array to a list and return it.
		Object[] array = {1, 2, 3, 4, 5};

		var list = Arrays.asList(array);

		return list;
	}

	static Set<String> listToSet() {
//		convert a list of US states to a set.  return the set.
		List<String> states = new ArrayList<String>();

		states.add("Texas");
		states.add("Washington");

		Set<String> newSet = new HashSet<String>(states);

		return newSet;
	}

	static int addToList(int x) {
		// add the x input to the array list.  return the value if successfully added.
		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(x);

		return x;
	}

	static void removeFromList(int x) {
		// remove the input parameter value x from the numList.
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(x);

		numList.remove(0);
	}

	static int insertIntoList(int x, int i) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(9);
		numList.add(8);
		numList.add(7);
		numList.add(6);
		numList.add(5);

		numList.add(x,i);

		return x;
	}

	static List<Integer> reverseNums() {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> newNums = new ArrayList<Integer>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		for (int i = nums.size() - 1; i >= 0; i--) {
			newNums.add(nums.get(i));
		}

		return newNums;

//		return null;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		return linkedList;
	}

	static ArrayList<String> removeDuplicates() {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Chad");
		names.add("Hannah");
		names.add("Chad");

		ArrayList<String> newNames = new ArrayList<String>();

		for (String element : names) {
			if (!newNames.contains(element)) {
				newNames.add(element);
			}
		}

		return newNames;

//		return names;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.

		return null;
	}

}
