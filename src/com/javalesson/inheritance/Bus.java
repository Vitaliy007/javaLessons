package com.javalesson.inheritance;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availiblePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availiblePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailiblePetrol();
        fuelUp(volume);
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailiblePetrol()+petrolVolume;
        if(volume>getTankVolume()){
            setAvailiblePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passangerNumber){
        this.passengerNumber +=passangerNumber;
        System.out.println("Picking yp passengers " + passangerNumber);
    }

    public void releasePassengers() {
        if(isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passangers released");
    }
}
