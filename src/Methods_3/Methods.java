package Methods_3;

/**
 * @author: Jakub Marciniak
 * #3
 */

public class Methods {
    public static void main(String[] args) {

        welcome();

        int a =5;
        int b = 10;
        System.out.println(a*b);
        multiply(5,10);
        multiply(10,5);
        multiply(100,3);

        divide(13,6);
        divide(73,7);

        int c = 2;
        int d = 5;
        System.out.println(c+d);

    }

    //main metod
    public static void multiply(int a , int b){
        System.out.println("I'm multiply method: "+a*b);
    }


    public static void welcome(){
        System.out.println("Hi dear user, Welcome here :)\n");

    }

    public static void divide(int a ,int b){
        System.out.println("I'm divided method: "+a/b);
    }



}
