class InheritanceDemo {
    public static void main(String[] args){
        MountainBike obj1 = new MountainBike(10, 20, 1);
        System.out.println("Gear is " + obj1.gear);
        System.out.println("Speed is " + obj1.speed);
        System.out.println("Seat Height is " + obj1.seatHeight);
        obj1.applyBrake(5);
        System.out.println("Speed after applying break is " + obj1.speed);
    }
    
}
