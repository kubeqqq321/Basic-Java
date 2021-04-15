package ForEach_17;

import java.util.ArrayList;

/**
 * @author: Jakub Marciniak
 * #17
 */

public class FForEEach {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------");
        //Normal For
        String[] cars = {"BMW", "Ford", "Toyota", "Mercedes", "Kia"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("------------------------------");
        //For Each
        //cars and c => String
        for (String c : cars) {
            System.out.print(c + ", ");
        }

        System.out.println("------------------------------");

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for (char c : chars) {
            System.out.println(c + ",");
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(1);

        for (int a : numbers) {
            System.out.println(a);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
