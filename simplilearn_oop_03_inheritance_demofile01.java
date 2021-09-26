class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }
    
    public void setGear(int newGear){
        gear = newGear;
    }
    public void applyBrake(int decrement){
        //a += b is short-hand for a = a + b (though note that the expression a will only be evaluated once.)
        //a =+ b is a = (+b), i.e. assigning the unary + of b to a.
        //just don't use =+
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
