package HashMap_12;

import java.util.HashMap;

/**
 * author: Jakub Marciniak
 * #12
 */

public class HashMapAwesome {
    public static void main(String[] args) {

        int a =10;
        String b = "Hello";
        int[] arr = {1,2,3};

        int x = 67;
        int y = 78;
        int z = 89;


        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("x",10);
        hash.put("y",12);
        hash.put("z",19);

        System.out.println(hash);
        //System.out.println(hash.get("x"));

        HashMap<String,String> hash1 = new HashMap<String,String>();
        hash1.put("Destroyer78" , "DestroyPonies");
        hash1.put("Kitty190" , "tamagothi");
        hash1.put("JeLLyWag0N" , "password123");

        System.out.println(hash1);
        //hash1.remove("Destroyer78");

        System.out.println("hash1.containsValue(): "+hash1.containsValue("password123"));
        System.out.println("hash1.containsKey(): "+hash1.containsKey("JeLLyWag0N" ));
        System.out.println("hash1.size(): "+hash1.size());
        System.out.println("hash1.replace(): "+hash1.replace("Destroyer78" ,"DestroyPonies" , "DestroyerOfAll"));
        System.out.println("hash1.keySet(): "+hash1.keySet());
        System.out.println("hash1.values(): "+hash1.values());

        System.out.println(hash1);





    }
}
