package HashSetters_13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetters {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(arr[1]+"\n");

        HashSet<String> hash = new HashSet<String>();
        hash.add("Monkey");
        hash.add("Dog");
        hash.add("Cat");
        hash.add("Fish");

        //hash.remove("Monkey");
        //hash.clear();

        System.out.println("hash.size(): "+hash.size());
        System.out.println("hash.contains(\"Dog\"): "+hash.contains("Dog"));
        System.out.println("hash.contains(\"Bird\"): "+hash.contains("Bird"));


        System.out.println("hash: "+hash);
        System.out.println("");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(13);
        hashSet.add(26);
        hashSet.add(39);


        Object[] h = hashSet.toArray();
        System.out.println(h[0]);

        System.out.println("");

        Iterator<Integer> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(hashSet);





    }
}
