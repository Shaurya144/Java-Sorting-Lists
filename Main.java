import java.util.ArrayList;
import java.util.Collections;

// The .sort() method in the Collections class is used to order elements
// alphabetically or numerically
public class Main {

    public static void main(String[] args) {
        ArrayList<String> ListOfWords = new ArrayList<String>();
        ListOfWords.add("Potato");
        ListOfWords.add("Carrot");
        ListOfWords.add("Cart");
        ListOfWords.add("Aeroplane");
        ListOfWords.add("business");
        ListOfWords.add("Aircraft");
        Collections.sort(ListOfWords); // Sorts the list Alphabetically
        // Same for Numbers

        ArrayList<Integer> ListOfNumbers = new ArrayList<Integer>();
        ListOfNumbers.add(33);
        ListOfNumbers.add(15);
        ListOfNumbers.add(20);
        ListOfNumbers.add(34);
        ListOfNumbers.add(8);
        ListOfNumbers.add(12);
        Collections.sort(ListOfNumbers); // Sorts Numerically in ascending order

        // To reverse the order use
        Collections.sort(ListOfNumbers, Collections.reverseOrder());
    }
}