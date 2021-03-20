package java_3.lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

interface lambdaMath {
    int variables(int a, int b);
}

class Numbers {

    private static final List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    static List<Integer> getNums() {
        System.out.println("Nums = "+nums);
        return nums;
    }

    static int getNum(int i) {
        System.out.println("Index value is = "+nums.get(i));
        var result = nums.get(i);
        return nums.get(i);
    }


    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        Predicate<Integer> checkOdds = a -> (a % 2 != 0);
        boolean checkOdd = checkOdds.test(i);
        System.out.println(checkOdd);
        return checkOdd;
    }


    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        Predicate<Integer> checkEvens = a -> (a % 2 == 0);
        boolean checkEven = checkEvens.test(i);
        System.out.println(checkEven);
        return checkEven;
    }

    static boolean isPrime(int i) {
         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        IntPredicate divisible = a -> i % a == 0;
        System.out.println(i > 1 && IntStream.range(2, i - 1).noneMatch(divisible));
        return i > 1 && IntStream.range(2, i-1).noneMatch(divisible);
    }

    static int added() {
        //add all the elements in the list.  return the sum.
        Integer addition = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(addition);
        return 0;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        Integer subtraction = nums.stream().reduce(0, (a, b) -> a - b);
        System.out.println(subtraction);
        return 0;
    }

    static int multipled() {
        //multiply all the elements in the list. and return the product.
        //Integer multiplication = nums.stream().reduce(1, (a, b) -> a * b);
        Integer multiplication = nums.stream().reduce(0, (a, b) -> (a * b));
        System.out.println(multiplication);
        return 0;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        Integer division = nums.stream().reduce(0, (a, b) -> (a / b));
        System.out.println(division);
        return 0;
    }

    static int findMax() {
         //return the maximum value in the list.
        Integer maxNum = nums.stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
        System.out.println(maxNum);
        return 0;
    }

    static int findMin() {
        //return the minimum value in the list.
        Integer minNum = nums.stream().mapToInt(x -> x).min().orElseThrow(NoSuchElementException::new);
        System.out.println(minNum);
        return 0;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        return 0;
    }

}
