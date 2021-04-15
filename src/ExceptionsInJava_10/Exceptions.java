package ExceptionsInJava_10;
/**
 * @author: Jakub Marciniak
 * #10
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //1
        String[] pets = {"dog , cat" , "monkey"};
        //System.out.println(pets[5]);

        //2
        //int i = "String";

        //3
        ArrayList<String> list = new ArrayList<String>();
        //list.get(0);

        //4
        ArrayList<String> list1 = null;
        //list.get(0);

        //It's good
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Book");
        System.out.println(list2.get(0));

        /**
         * nullPointer Exception
         */

        //5
        String a = null;
        //System.out.println(a.length());

        //6
        //int i = null;

        //7
        Scanner scan = null;
        //scan.nextInt();

    }
}
