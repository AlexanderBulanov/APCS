//Adam Barszczak, Alexander Bulanov

//2. Double-digit keys not ending in 0 go in increasing order.
//   They are followed by digits from 0 to 9 in increasing order,
//   with key of 10 ending the hash. This is due to value of hashcode -
//   keys associated with the largest hashcodes go first in sequential
//   order, with key of same magnitude ending in 0 closing off the next set
//   of keys lower in magnitude.
//3. Hashcodes increase in increments of 1 for keys 0-9,
//   then they jump up 1010 points to 1567 and continue
//   increasing by 1. This reminds me of ASCII values of
//   alphabet, when comparing lowercase and uppercase letter codes.

import java.util.*;

public class Main {
    static final int ITEMS = 13;
    static final int CAPACITY = (int) (Math.ceil(ITEMS*1.3));
    static HashMap<String,Integer> h = new HashMap<String,Integer>(CAPACITY);
    
    public static void main(String[] args) {    
        initHashMap();
        printHashMap();
    }

    public static void initHashMap() {
        String keyInt;
        for (int i = 0; i < 1000; i++) {
            keyInt = "" + ((int) (Math.random() * ITEMS));
            if (h.get(keyInt) == null) {
                h.put((keyInt + ""), 1);
            } else {
                h.put((keyInt + ""), (Integer) (h.get(keyInt)) + 1);
            }
        }
    }
    
    public static void printHashMap() {
        Set keySet = h.keySet();   // returns all keys in the HashMap
        Iterator iter = keySet.iterator();
        
        while (iter.hasNext()) {
            Object key = iter.next();
            Object value = h.get(key);
            System.out.println(key + ": " +
                    ", hashcode = " + key.hashCode() + 
                    ", occurrences = " + value);
        }
        
        System.out.println(h.keySet());
        System.out.println(h.values());
    }
    
    public static String getItem(String s) {
        return "" + ((Integer) (h.get(s)));
    }
}
