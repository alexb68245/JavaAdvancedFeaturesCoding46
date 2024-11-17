import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 18);
        map.put("Python", 1);
        map.put("C#", 2);
        map.put("PHP", 0);
        map.put("C++", 30);
        /*
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            System.out.println(",");
        }
         */

        List<Map.Entry<String, Integer>> list = List.copyOf(map.entrySet());
        for (int i = 0; i < list.size(); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.print("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            if (i < list.size() - 1) {
                System.out.println(", ");
            }else {
                System.out.print(".");
            }
        }
    }
}
