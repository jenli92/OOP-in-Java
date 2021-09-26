class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startGear, int startSpeed, int startSeatHeight){
        //super constructor invocation needs to be the first inside the constructor
        super(startGear, startSpeed);
        seatHeight = startSeatHeight;
    }
    public void setSeatHeight(int newSeatHeight){
        seatHeight = newSeatHeight;
    }
}
