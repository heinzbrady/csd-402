//Brady Heinz 4/19/26 5.2 Assignment

package arraylocator;

public class ArrayLocator {

    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 1},
            {9, 2, 8},
            {4, 7, 6}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("INT ARRAY:");
        System.out.println("Largest at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");

        double[][] doubleArray = {
            {1.5, 2.3, 0.7},
            {9.1, 4.4, 3.3},
            {5.5, 6.6, 2.2}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("\nDOUBLE ARRAY:");
        System.out.println("Largest at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }

    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
}