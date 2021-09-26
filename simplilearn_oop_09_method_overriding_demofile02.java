class MountainBike extends Bicycle {

    public int seatHeight;
    
    public MountainBike(int startGear, int startSpeed, int startSeatHeight){
        super(startGear, startSpeed);
        seatHeight = startSeatHeight;
    }

    public void setSeatHeight(int seatHeight){
        gear = newGear;
    }

    @Override
    public void setGear(int newGear){
        gear += 2;
    }

    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement - 10;
    }

    @Override
    public void speedUp(int increment){
        spead = speed + increment + 10;
    }

    @Override
    public void canDrive(){
        System.out.println("Mountain Bike can be driven.");
    }

}