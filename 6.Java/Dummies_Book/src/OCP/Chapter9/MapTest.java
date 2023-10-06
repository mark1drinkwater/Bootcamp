package OCP.Chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map1 = Map.ofEntries(
                Map.entry("George", "078-123-4569"),
                Map.entry("Steve", "064-675-3331")
        );

        Map<String, String> map2 = Map.copyOf(map1);

        //Maps created from ofEntries, copyOf are IMMUTABLE
        // Meaning they cannot be changed


        Set<String> keys1 = map1.keySet();
        for (String key : keys1)
            System.out.println(key + " " + map1.get(key));

        System.out.println("\nPrinting out the copy");

        Set<String> keys2 = map2.keySet();
        for (String key : keys2)
            System.out.println(key + " " + map1.get(key));

        System.out.println("\nHash Mapping");
        Map<String, String> animals = new HashMap<>();
        animals.put("koala", "bamboo");
        animals.put("lion", "meat");
        animals.put("giraffe", "leaf");

        String food = animals.get("koala");
        System.out.println("What is a koala's favourite food? It's " + food );
        for (String key: animals.keySet())
            System.out.println("Animal: " + key + ", " + "Favourite food: " + animals.get(key));

        System.out.println(animals.containsKey("lion"));
        System.out.println(animals.containsValue("lion"));
        System.out.println(animals.containsValue("meat"));
        System.out.println(animals.size());
        animals.clear();
        System.out.println(animals.size());
        System.out.println(animals.isEmpty());

        System.out.println("\nPrinting with for each loop");
        Map<Integer, Character> charsMap = new HashMap<>();
        charsMap.put(1, 'a');
        charsMap.put(2, 'b');
        charsMap.put(3, 'c');

        charsMap.forEach((key,val) -> System.out.println(key + " : " + val));
        System.out.println("Just looping through the keys.");
        charsMap.keySet().forEach(System.out::println);
        System.out.println("Just looping through the values.");
        charsMap.values().forEach(System.out::println);

        System.out.println("Advanced for loop");
        for (Character x: charsMap.values())
            System.out.println(x);

        System.out.println("Printing with entry set");
        charsMap.entrySet().forEach(System.out::println);
        charsMap.entrySet().forEach( e -> System.out.println(e.getKey() + " : " + e.getValue()) );

        System.out.println("\nGetting Values Safely");
        Map<Character, String> treasureMap = new HashMap<>();
        treasureMap.put('x', "spot");
        System.out.println("X marks the " + treasureMap.get('x'));
        System.out.println("X marks the " + treasureMap.getOrDefault('x', ""));
        System.out.println("Y marks the " + treasureMap.get('y'));
        System.out.println("Y marks the " + treasureMap.getOrDefault('y', ""));

        System.out.println("\nReplacing Values");
        Map<Integer, Integer> replaceMap = new HashMap<>();
        replaceMap.put(1, 2);
        replaceMap.put(2, 4);
        Integer original = replaceMap.replace(2, 10);
        System.out.println(replaceMap);
        replaceMap.replaceAll((k, v) -> k * 2);
        System.out.println(replaceMap);

        System.out.println("\nPutting If Absent");
        Map<String, String> favourites = new HashMap<>();
        favourites.put("Jenny", "Bus Tour");
        favourites.put("Tom", null);
        favourites.putIfAbsent("Jenny", "Tram");
        favourites.putIfAbsent("Sam", "Tram");
        favourites.putIfAbsent("Tom", "Tram");
        System.out.println(favourites);

        System.out.println("\n Merging data");
        BiFunction<String, String, String> mapper = (v1, v2)
            -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favList = new HashMap<>();
        favList.put("Jenny", "Bus Tour");
        favList.put("Tom", "Tram");

        String jenny = favourites.merge("Jenny", "Skyride", mapper);
        String tom = favourites.merge("Tom", "Skyride", mapper);

        System.out.println(favourites);
        System.out.println("Jenny: " + jenny);
        System.out.println("Tom: " + tom);

        //
        BiFunction<String,String,String> mapper2 = (v1,v2) -> null;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bus Tour");
        favorites2.put("Tom", "Bus Tour");
        // Jenny gets removed from the output.
        // Because when null is returned it gets removed.
        favorites2.merge("Jenny", "Skyride", mapper2);
        favorites2.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites2);
    }
}
