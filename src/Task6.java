import java.util.TreeMap;

public class Task6 {

    public void printFirstAndLastEntry(TreeMap<String, String> map){
        System.out.println("The first entry is: "+ "Key: " + map.firstEntry().getKey()
                + " Value: " + map.firstEntry().getValue());


        System.out.println("The last entry is: "+ "Key: " + map.lastEntry().getKey()
                + " Value: " + map.lastEntry().getValue());
    }

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        Task6 task6 = new Task6();
        task6.printFirstAndLastEntry(map);
    }
}
