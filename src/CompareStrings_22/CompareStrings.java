package CompareStrings_22;

/**
 * @author: Jakub Marciniak
 * #22
 */

public class CompareStrings {
    public static void main(String[] args) {

        // ==
        // .equals();

        String a = "Monkey";
        String b = "Monkey";

        if(a == b){
            System.out.println(a +" == "+ b);
        }
        else{
            System.out.println(a+" != "+b);
        }



        String a1 = new String("Cat"); //This is object
        String b1 = new String("Cat"); // This is object

        //==
        if(a1 == b1){
            System.out.println(a1 +" == "+ b1);
        }
        else{
            System.out.println(a1+" != "+b1);
        }

        //equals(); to objectss
        if(a1.equals(b1)){
            System.out.println(a1 +" == "+ b1);
        }
        else{
            System.out.println(a1+" != "+b1);
        }




        String a2 = "Dog";

        //if(a2 == "Dog"){
        if(a2.equals("Dog")){
            System.out.println(a2 +" == "+ a2);
        }
        else{
            System.out.println(a2+" != "+a2);
        }




        String a3 = "DOG is HuNgRy";

        if(a3.toLowerCase().equals("DOg is hungrY")){
            System.out.println(a3 +" == "+ a3);
        }
        else{
            System.out.println(a3+" != "+a3);
        }

    }

}
