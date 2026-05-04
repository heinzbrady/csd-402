//Brady Heinz 5/3/26 8.2 Assignment

package bradyarraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class BradyArrayListTest {

    // Method to find the maximum value
    public static Integer max(ArrayList list) {
        // If list is empty, return 0
        if (list == null || list.size() == 0) {
            return 0;
        }

        Integer maxValue = (Integer) list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > maxValue) {
                maxValue = current;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        int value;
        do {
            value = input.nextInt();
            numbers.add(value); // include 0 in the list
        } while (value != 0);

        // Call the method
        Integer result = max(numbers);

        // Display result
        System.out.println("The largest value is: " + result);

        input.close();
    }
}