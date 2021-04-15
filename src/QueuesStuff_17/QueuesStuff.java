package QueuesStuff_17;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Jakub Marciniak
 * #17
 */

public class QueuesStuff {
    public static void main(String[] args) {

        Queue<String> queueLine = new LinkedList<String>();

        queueLine.add("Jackson");
        queueLine.add("Dory");
        queueLine.add("Sue");


        //Jackson out
//        System.out.println(queueLine);
//        System.out.println(queueLine.poll());
//        System.out.println(queueLine);

//        System.out.println(queueLine);
//        System.out.println(queueLine.peek());
//        System.out.println(queueLine);


        Queue<String> q = new LinkedList();
        q.add("A");
        q.add("B");
        q.add("C");


        //A out
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.contains("P"));
        System.out.println(q.contains("A"));


        System.out.println(q.toArray()[1]);
    }
}
