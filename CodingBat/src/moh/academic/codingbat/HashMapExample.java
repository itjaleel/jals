package moh.academic.codingbat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {
    	HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        hmap.put( "Abdul",5);
        hmap.put( "Bala",6);
        hmap.put( "Sunil",23);
        hmap.put( "Binu",11);
        hmap.put( "Siraj",56);
        hmap.put( "Razik",78);
        hmap.put( "Mujeeb",90);
    
        System.out.println("----Before Sorting-----");
                 
         Iterator iterator = hmap.entrySet().iterator();
         while(iterator.hasNext()) {
               Map.Entry me = (Map.Entry)iterator.next();
               System.out.print(me.getKey() + ": ");
               System.out.println(me.getValue());
         }
         
         
         Map<String,Integer> map = new TreeMap<String,Integer>(hmap); 
         System.out.println("---After Sorting----");
         System.out.println(map);
         
         
    }
}