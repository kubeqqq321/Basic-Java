package ReturnStatements_5;

/**
 * @author: Jakub Marciniak
 * #5
 */

public class ReturnStatement {
    public static void main(String[] args) {

        printMessage();

       // int sum = add(5,6); this is wrong
        add(6,8);

        int sum = Add(6,8);
        System.out.println(sum);

        String something = caps();
        System.out.println(something);

        String UPPER = upper("Why it's so easy?");
        System.out.println(UPPER);


        int[] ar = ArrayInts(3,5,6);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        System.out.println(ar[3]);

    }

    public static void printMessage(){
        System.out.println("This is our first method ");
    }
    public static void add(int a , int b){
        System.out.println("I'm add method: "+ a+b);
    }
    public static int Add(int a , int b){
        return a+b;
    }
    public static String caps(){
        return "sth";
    }
    public static String upper(String s){
        return s.toUpperCase();
    }

    public static int[] ArrayInts(int a, int b ,int c){
        int[] array = new int[4];
            array[0] = a;
            array[1] = b;
            array[2] = c;
        return array;
    }

}
