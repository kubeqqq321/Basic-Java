package StacksRFun_16;

import java.util.Stack;

/**
 * @author: Jakub Marciniak
 * #16
 */

public class StackRFun {
    public static void main(String[] args) {

        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Guitar hero");
        games.add("Mario");

//        System.out.println(games);
//        System.out.println(games.pop());
//        System.out.println(games);

//        System.out.println(games);
//        System.out.println(games.peek());
//        System.out.println(games);

        //Y yellow
        //B blue
        //R red

        Stack<Character> tower = new Stack<Character>();
        tower.add('R');
        tower.add('B');
        tower.add('Y');

//        System.out.println(tower);
//        System.out.println(tower.peek());
//        System.out.println(tower);

        //Remove the top
//        System.out.println(tower);
//        System.out.println(tower.pop());
//        System.out.println(tower);

        System.out.println(tower.contains('P'));
        System.out.println(tower.contains('R'));

        System.out.println(tower.empty());

        System.out.println(tower.get(0));
        System.out.println(tower.get(1));
        System.out.println(tower.get(2));

        System.out.println(tower.set(1 , 'P'));
        System.out.println(tower);

        System.out.println(tower.size());

    }
}
