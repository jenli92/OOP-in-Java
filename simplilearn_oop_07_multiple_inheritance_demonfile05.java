public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MountainBike obj1 = new MountainBike(20, 10, 1);

        System.out.println("Gear is " + obj1.getGear());
        System.out.println("Spped is " + obj1.getSpeed());
        System.out.println("Seat Height is " + obj1.getSeatHeight());

        obj1.applyBrake(1);
        System.out.println("Speed after appying brake is " + obj1.getSpeed());

        obj1.speedUp(10);
        System.out.println("Speed after speeding up is " + obj1.getSpeed());

        obj1.canRotateTwoWheelers();
        obj1.canDrive();
    }
}
