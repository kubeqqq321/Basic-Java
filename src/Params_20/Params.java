package Params_20;

/**
 * @author: Jakub Marciniak
 * #20
 */


public class Params {

    public static void main(String[] args) {
        HI();
        HiBoby();
        saySomething("Alex");
        saySomething("laptop");
        saySomething("printer");

        printInfo("Adam", 43);

        System.out.println(add(4,6));

        int result = add(3,6);
        int result1 = add(5,7);
        int result2 = add(6,8);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


    }

    public static void HI(){
        System.out.println("Hi :)");
    }

    public static void HiBoby(){
        System.out.println("Hi Boby :)");
    }

    public static void saySomething(String s){
        System.out.println("Hi "+ s);
    }

    public static void printInfo(String name , int age){
        System.out.println("Hi " +name + " "+age + " years");
    }

    public static int add(int x , int y){
        return x + y;
    }





}
