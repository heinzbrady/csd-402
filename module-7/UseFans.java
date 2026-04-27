//Brady Heinz 4/26/26 7.2 Assignment

package fan;

import java.util.ArrayList;

public class UseFans {

    public static void displayFan(Fan fan) {
        System.out.println("Fan Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("------------------------");
    }

    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("yellow");
        fan1.setRadius(8);

        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.SLOW, false, 6, "white");
        Fan fan4 = new Fan(Fan.STOPPED, false, 12, "black");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        System.out.println("Displaying one fan:");
        displayFan(fan1);

        System.out.println("\nDisplaying all fans:");
        displayFans(fans);
    }
}