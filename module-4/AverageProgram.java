package averageprogram;
public class AverageProgram {

    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.5, 2.5};

        System.out.print("Short Array: ");
        for (short n : shortArray) System.out.print(n + " ");
        System.out.println("\nAverage: " + average(shortArray));

        System.out.print("\nInt Array: ");
        for (int n : intArray) System.out.print(n + " ");
        System.out.println("\nAverage: " + average(intArray));

        System.out.print("\nLong Array: ");
        for (long n : longArray) System.out.print(n + " ");
        System.out.println("\nAverage: " + average(longArray));

        System.out.print("\nDouble Array: ");
        for (double n : doubleArray) System.out.print(n + " ");
        System.out.println("\nAverage: " + average(doubleArray));
    }
}