package pattern;

public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            for (int space = 1; space <= (7 - i); space++) {
                System.out.print("  ");
            }

            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * 2;
            }

            num = num / 2;
            for (int j = 1; j < i; j++) {
                num = num / 2;
                System.out.print(num + " ");
            }

            System.out.println("@");
        }
    }
}