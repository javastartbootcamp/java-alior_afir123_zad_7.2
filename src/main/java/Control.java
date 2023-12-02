import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    static int getUserInput(Scanner scanner) {
        System.out.println("Podaj liczby całkowite dodatnie:");
        return scanner.nextInt();
    }

    static void saveNumbers(Scanner scanner, ArrayList<Integer> list, int userInput) {
        do {
            list.add(userInput);
        }
        while ((userInput = scanner.nextInt()) > 0);
    }

    static void printReverse(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(list.size() - 1 - i));
            } else {
                System.out.print(list.get(list.size() - 1 - i) + ", ");
            }
        }
    }

    static void sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + " + ");
            }
            sum += element;
        }
        System.out.println(" = " + sum);
    }

    static void min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + min);
    }

    static void max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("Największa liczba w liście to " + max);
    }
}
