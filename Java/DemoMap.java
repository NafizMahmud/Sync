import static java.util.Map.entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class DemoMap {
    public static void main(String[] args) {
        Map<String, String> test2 = Map.ofEntries(entry("a", "b"), entry("c", "d"));
        System.out.println(test2);

        Map<String, String> myMap = new HashMap<>() {
            {
                put("ac", "b");
                put("cc", "d");
            }
        };
        System.out.println(myMap);

        Map<String, String> immutableMap = Collections.singletonMap("rohit",
       "cricket");
       System.out.println(immutableMap);

       Map<Map<Integer, Integer>, Integer> memo = new LinkedHashMap<>();
       Map<Integer, Integer> a = Map.of(1, 3);
       Map<Integer, Integer> b = Map.of(4, 3);
       Map<Integer, Integer> c = Map.of(2, 3);

       memo.put(a,1);
       System.out.println(memo);
    }
}