package ArrayList_9;

/**
 * author: Jakub Marciniak
 * #9
 */

import java.util.ArrayList;

public class ArrayListProject {
    public static void main(String[] args) {

        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Banana";
        fruits[2] = "Apple";
        //+
        //fruits[3] = "Watermelon";
        //when you want to add Watermelon to array
        //you have to change size of array from 3 to 4
        System.out.println(fruits[0]);


        //In ArrayList it is enough to add a new element
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Watermelon");

        fruitList.remove("Apple");
        //fruitList.clear();
        System.out.println(fruitList.contains("Strawberry"));

        System.out.println(fruitList);


    }
}
