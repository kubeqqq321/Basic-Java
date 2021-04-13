package Break_2;

/**
 * author: Jakub Marciniak
 * #2
 */

public class BreakDown {
    public static void main(String[] args) {

        // this is brake -> //TODO break;
        // it's can be use only with loops and switch
        // you cannot use it normal in the method


        //infinite while loop when break is comment
        while (true) {
            System.out.println("Hi\n");
            break;
        }

        //when the number in the array numbers is equal 30
        // then loop break and program will stop
        int[] numbers = {10,20,30,40,50};
        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i] == 30){
                break;
            }
            System.out.println(numbers[i]);
        }

        int option = 1;

        switch(option){
            case 0:
                System.out.println("Zero!");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("What's going on man?!!");
                break;
        }

    }
}
