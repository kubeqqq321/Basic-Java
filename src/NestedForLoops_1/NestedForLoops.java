package NestedForLoops_1;

/**
 * @author: Jakub Marciniak
 * #1
 */

public class NestedForLoops {
    public static void main(String[] args) {


        //normal (for) loop
        for (int i = 0; i<5 ; i++) {
            System.out.println(i);
            //System.out.println("On the outside is darkness night");
        }

        //
        String [] colors = {"White" , "Red" ,"Blue"};
        for(int i=0; i< colors.length ;i++) {
            System.out.println(colors[i]);
        }
        System.out.println("-------------------------");

        String[][] fancyColors = {{"White" , "Red" ,"Blue"},
                {"Green" , "Yellow" , "Orange"}};
        for (int i=0;i< fancyColors.length;i++){
            for(int j=0;j<fancyColors.length;j++)
            {
                System.out.println(fancyColors[i][j]);
            }
        }
        System.out.println("-------------------------");



        /**
         * fajny przykładzik taki dodatkowy
         */
        System.out.println("-------------------------");
        for (int i=0;i<5;i++){
            for(int j=0;j<10;j++)
            {
                System.out.println("i: " + i + ", j: "+j);
            }
        }


    }
}
