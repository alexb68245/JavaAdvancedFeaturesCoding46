import java.util.*;

public class Storage {

    private Map<String, List<String>> storageMap = new HashMap<>();

    public Storage(Map<String, List<String>> storageMap){
        this.storageMap = storageMap;
    }

    public void addToStorage(String key, String value){
        List<String> listOfValues = new ArrayList<>();
        if(storageMap.containsKey(key)){
            storageMap.get(key).add(value);
        }else {
            listOfValues.add(value);
            storageMap.put(key, listOfValues);
        }

        System.out.println(storageMap);
    }

    public void printValues(String key){
        if (!storageMap.containsKey(key)){
            System.out.println("There is no key with that name");
        }else {
            System.out.println("Values of " + key + " are: " + storageMap.get(key));
        }

    }

    public List<String> findValues(String value){
        List<String> listOfKeys = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : storageMap.entrySet()) {
            if (entry.getValue().contains(value)){
                listOfKeys.add(entry.getKey());
            }else {
                System.out.println("There are no keys with that value");
            }
        }
        return listOfKeys;
    }

    public static void main(String[] args) {
        Storage storage = new Storage(new HashMap<>());
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a key and a value");
        storage.addToStorage(scanner.next(), scanner.next());
        System.out.println("Enter a value for key  'key' ");
        storage.addToStorage("key", scanner.next());
        System.out.println("Enter a key you want to find the value of");
        storage.printValues(scanner.next());

         */
        List<String> firstElement = new ArrayList<>();
        firstElement.add("A");
        firstElement.add("B");
        firstElement.add("C");
        storage.storageMap.put("key", firstElement);

        List<String> secondElement = new ArrayList<>();
        secondElement.add("A");
        secondElement.add("D");
        secondElement.add("f");
        storage.storageMap.put("someKey", secondElement);

        List<String> thirdElement = new ArrayList<>();
        thirdElement.add("H");
        thirdElement.add("k");
        thirdElement.add("f");
        storage.storageMap.put("someOtherKey", thirdElement);

        System.out.println(storage.findValues("A"));
    }
}
