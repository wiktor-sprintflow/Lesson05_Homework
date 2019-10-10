package airconditioning;

public class AirCondition {
    public static void main(String[] args) {
        Room room1 = new Room(20, 18, true, 2500);
        System.out.println(room1.decreaseTempAndGetDetails());
        System.out.println(room1.decreaseTempAndGetDetails());
        System.out.println(room1.decreaseTempAndGetDetails());
        System.out.println(room1.decreaseTempAndGetDetails());
        System.out.println(room1.decreaseTempAndGetDetails());

        System.out.println();

        Room room2 = new Room(18, true);
        System.out.println(room2.decreaseTempAndGetDetails());
        System.out.println(room2.decreaseTempAndGetDetails());

        System.out.println();

        Room room3 = new Room(45, 18, true, 2500);
        System.out.println(room3.decreaseTempAndGetDetails());
        System.out.println(room3.decreaseTempAndGetDetails());
        System.out.println(room3.decreaseTempAndGetDetails());
        System.out.println(room3.decreaseTempAndGetDetails());
        System.out.println(room3.decreaseTempAndGetDetails());
        System.out.println(room3.decreaseTempAndGetDetails());
    }
}
