package enums;

// Use enum in switch to print message.
enum Day {
    monday, sunday
}

public class enum_in_switch {
    public static void main(String[] args) {
        Day d = Day.monday;

        switch (d) {
            case monday:
                System.out.println("start");
                break;
            case sunday:
                System.out.println("end");
        }
    }
}
