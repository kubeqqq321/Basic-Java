package FinalyKeywords_19;

import java.util.Scanner;

/**
 * @author: Jakub Marciniak
 * #19
 */

public class FinallyKey {
    public static void main(String[] args) {

        int a =5;
        int b = 0;
        //int c = a/b;
        //System.out.println(c);

        try {
            int v = 5 / 0;
            //int n =5/1;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is in Finally, it always gets run!");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Write sth: ");

        try{
            System.out.println(scanner.nextLine());
        }catch (Exception e){
                System.out.println(e);
        }finally {
            scanner.close();
        }




    }
}
