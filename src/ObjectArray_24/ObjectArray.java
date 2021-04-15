package ObjectArray_24;

/**
 * @author: Jakub Marciniak
 * #24
 */


class Monkey{

    String type = "Spider monkey";

    public static void sayOohAhhahh(){
        System.out.println("Ohh Ahh Ahh");
    }

}

public class ObjectArray {
    public static void main(String[] args) {

        //Obj[] myObjArray = {01, 02}


        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();
        Monkey[] monkeys = {m1,m2,m3};

        for (Monkey m : monkeys) {
            m.sayOohAhhahh();
        }

        int [] nums = {1,5,67,23};

    }
}
