package com.javalesson.inheritance;

public class ElectricCar extends Auto {

    private int bateeryVolume;
    private int passangersNumber;

    public ElectricCar(String producer, String model, int bateeryVolume, int passangersNumber) {
        super(producer, model, new Engine());
        this.bateeryVolume = bateeryVolume;
        this.passangersNumber = passangersNumber;
    }

    private void charge() {
        System.out.println("Battery is charging");
    }

    public int getBateeryVolume() {
        return bateeryVolume;
    }

    public void setBateeryVolume(int bateeryVolume) {
        this.bateeryVolume = bateeryVolume;
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }

    public void setPassangersNumber(int passangersNumber) {
        this.passangersNumber = passangersNumber;
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Car has stopped");
    }

    @Override
    public void energize() {
        charge();
    }
}
