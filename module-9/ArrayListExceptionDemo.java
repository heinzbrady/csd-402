//Brady Heinz 5/10/26 9.2 Assignment

package arraylistexceptiondemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        System.out.println("ArrayList items:");

        for (String item : items) {
            System.out.println(item);
        }

        System.out.print("\nEnter the index of the item you would like to see again: ");
        String userInput = input.nextLine();

        try {
            Integer index = Integer.parseInt(userInput);

            String selectedItem = items.get(index);

            System.out.println("You selected: " + selectedItem);
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        input.close();
    }
}