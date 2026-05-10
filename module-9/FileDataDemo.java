//Brady Heinz 5/10/26 9.2 Assignment

package filedatademo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileDataDemo {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            if (file.createNewFile()) {
                System.out.println("File created: data.file");
            } else {
                System.out.println("File already exists. Appending data.");
            }

            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100) + 1;
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("\nData in file:");

            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
        }
    }
}