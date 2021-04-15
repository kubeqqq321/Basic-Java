package TryCatch_11;

/**
 * @author: Jakub Marciniak
 * #11
 */

import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args) {

        int[] arr = {4,5,1};
        //System.out.println(arr[3]); Wrong

        try{
            int[] arr1 = {4,5,1};
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println("Exception!");
            System.out.println("--------------------------");
        }

        System.out.println("-----------Scanner Exception-----------");
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your favourite number: ");
        //try write for example a color "red"
        //int a = scan.nextInt();
        //System.out.println(a);

        try{
            int n = scan.nextInt();
            System.out.println(n);
        }catch (Exception exception) {
            System.out.println("It is not a number!!");
        }


        System.out.println("-----------Array Exception-----------");
        int[] arr1 = null;
        //System.out.println(arr1[1]);

        try {
            int[] arr3 = null;
            System.out.println(arr3[1]);
        }catch (Exception exception) {
            System.out.println("Ups , we have a problem!");

        }


        System.out.println("-----------Array Multiply Exception-----------");
        try{
            //int[] b = {4};
            int[] b = null;
            System.out.println(b[1]);

        }catch (NullPointerException nullPointerException){
            System.out.println("Your array is null");
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Your index out of bounds!");
        }catch (Exception e){
            System.out.println("Something else went wrong!");
        }




    }
}
