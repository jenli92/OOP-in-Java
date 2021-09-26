class MountainBike implements Bicycle {
    private int gear;
    private int speed;
    private int seatHeight;
    
    public MountainBike(int startGear, int startSpeed, int startSeatHeight){
        gear = startGear;
        speed = startSpeed;
        seatHeight = startSeatHeight;
    }

    @Override
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment){
        spead += increment;
    }

    public int getGear(){
        return gear;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSeatHeight(){
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight){
        gear = newGear;
    }
}