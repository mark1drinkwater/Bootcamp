package ch13;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class N_ConcurrentCollections {
    // This will give a ConcurrentModificationException at runtime
    // In the second iteration of the loop, since the iterator on keySet() is not properly updated
    // after the first element is removed.
    public static void main(String[] args) {
//        var foodData = new HashMap<String, Integer>();
        // This fixes it:
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        System.out.println(foodData);
        for (String key : foodData.keySet())
            foodData.remove(key);
        System.out.println(foodData);
    }
}

////////////////////////////////////////////////////
// Copy on write
class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for(var n :favNumbers)
        {
            System.out.print(n + " "); // 4 3 42
            favNumbers.add(n + 1);
        }
        System.out.println();
        System.out.println("Size: "+favNumbers.size()); // Size: 6
    }
}