import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class LinkedListMultimap {

    public static void main(String[] args) {

        // Create a LinkedListMultimap
        Multimap<String, String> multimap = ArrayListMultimap.create();

        // Put values into the multimap
        multimap.put("key1", "value1");
        multimap.put("key1", "value2");
        multimap.put("key2", "value3");
        multimap.put("key2", "value4");

        // Get values associated with a key
        System.out.println("Values for key1: " + multimap.get("key1"));
        System.out.println("Values for key2: " + multimap.get("key2"));

        // Output:
        // Values for key1: [value1, value2]
        // Values for key2: [value3, value4]
    }

}
