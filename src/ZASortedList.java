import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZASortedList {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        //metoda 1
        /*
        for (char c = 'A'; c <= 'Z'; c++) {
            listOfStrings.add(c + "");
        }
         */

        //metoda 2
        listOfStrings.add("Aleksia");
        listOfStrings.add("DYSGAHS");
        listOfStrings.add("ZDFU");
        listOfStrings.add("Yusadhj");
        listOfStrings.add("HSJDDJSHBF");
        System.out.println(listOfStrings);

        listOfStrings.sort((a,b) -> a.compareTo(b));


        System.out.println(listOfStrings);

        listOfStrings.sort(Collections.reverseOrder());
        System.out.println(listOfStrings);


        //metoda 3
        List<String> reversedListOfStrings = new ArrayList<>();
         for (char c = 'Z'; c >= 'A'; c--) {
            reversedListOfStrings.add(c + "");
        }

        System.out.println(reversedListOfStrings);

    }
}
