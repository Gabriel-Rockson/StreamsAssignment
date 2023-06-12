package assignment;

import java.util.ArrayList;
import java.util.List;

public class StreamsAssignment {
    public static int sumOfIntegers(List<Integer> numbers) {
        // method that returns the sum of numbers
        return numbers.stream().reduce(0, Integer::sum);
    }

    public static List<String> upperCaseOfStrings(List<String> listOfStrings) {
        return listOfStrings.stream().filter(string -> string.length() > 4).map(String::toUpperCase).toList();
    }

    public static List<Double> cubesOfElements(List<Double> listOfDoubles) {
        return listOfDoubles.stream().map(number -> Math.pow(number, 3)).toList();
    }

    public static void main(String[] args) {
        // METHOD 1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        System.out.println(sumOfIntegers(numbers));

        // METHOD 2
        List<String> strings = new ArrayList<>();
        strings.add("kweku");
        strings.add("yam");
        strings.add("of");
        strings.add("century");

        System.out.println(upperCaseOfStrings(strings));

        // METHOD 3
        List<Double> doubles = new ArrayList<>();
        doubles.add(2.0);
        doubles.add(822.23);
        doubles.add(982.2343);
        doubles.add(2223.923);

        System.out.println(cubesOfElements(doubles));
    }
}
