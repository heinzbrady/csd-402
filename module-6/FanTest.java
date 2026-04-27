//Brady Heinz 4/19/26 6.2 Assignment

package fan;

public class FanTest {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("yellow");
        fan1.setRadius(8);

        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println("\nFan 2:");
        System.out.println(fan2);
    }
}