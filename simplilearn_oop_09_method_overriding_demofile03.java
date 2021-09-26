public class MethodOverridingDemo {
    public static void main(String[] args){
        Bicycle obj1 = new Bicycle(1, 10);
        System.out.println("Bicycle gear is " + obj1.gear);
        System.out.println("Bicycle speed is " + obj1.speed);
        obj1.applyBrake(1);
        System.out.println("Bicycle speed after applying brake is " + obj1.speed);

        //dynamic object binding concept, initialzing the child object with the reference of the parent object
        Bicycle obj2 = new MountainBike(50, 50, 3);
        System.out.println("Mountain Bike gear is " + obj2.gear);
        System.out.println("Bicycle gear is " + obj2.speed);
        System.out.println("Bicycle gear is " + obj2.seatHeight);

        obj2.applyBrake(1);
        System.out.println("Mountain Bike speed after applying brake is " + obj2.speed);
    }
    
}
