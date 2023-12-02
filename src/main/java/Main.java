import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        int userInput = Control.getUserInput(scanner);
        //jakoś nie do końca to elegancko ale nie bardzo mam pomysł jak to poprawić :P
        try {
            if (userInput < 0) {
                throw new IndexOutOfBoundsException("Pierwsza podana lista jest ujemna. Lista liczb dodatnich jest pusta.");
            } else {
                Control.saveNumbers(scanner, list, userInput);
                Control.printReverse(list);
                Control.sum(list);
                Control.min(list);
                Control.max(list);
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Pierwsza podana lista jest ujemna. Lista liczb dodatnich jest pusta.");
        }
    }
}
