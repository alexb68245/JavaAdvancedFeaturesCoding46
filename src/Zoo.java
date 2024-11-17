import java.util.*;

public class Zoo {

    private Map<String, Integer> animals = new HashMap<>();
    //<luan,3>
    //<elefant, 10>
    //<tiger, 5>

    public Zoo(Map<String, Integer> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllAnimals(){
        int numberOfAnimals = 0;
        for (Map.Entry<String, Integer> entry : animals.entrySet()) {
            numberOfAnimals += entry.getValue();
        }
        return numberOfAnimals;
    }

    public Map<String, Integer> getAnimalsCount() {
        return animals;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(animals.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        Map<String, Integer> sortedAnimals = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedAnimals.put(entry.getKey(), entry.getValue());
        }
        return sortedAnimals;
    }

    public void addAnimals(String animal, int count) {
        if (animals.containsKey(animal)) {
            animals.put(animal, animals.get(animal) + count);
        }else {
            animals.put(animal, count);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> animals = new HashMap<>();
        animals.put("elephant", 10);
        animals.put("lion", 3);
        animals.put("tiger", 5);
        Zoo zoo = new Zoo(animals);

        System.out.println("Number of animals: " + zoo.getNumberOfAllAnimals());
        for (Map.Entry<String, Integer> entry : zoo.getAnimalsCount().entrySet()) {
            System.out.println("Animal: " + entry.getKey() + ", count: " + entry.getValue());
        }
        System.out.println(zoo.getAnimalsCountSorted());
        zoo.addAnimals("elephant", 1);
        System.out.println(zoo.getAnimalsCountSorted());

    }

}
