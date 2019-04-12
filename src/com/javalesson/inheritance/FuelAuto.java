package com.javalesson.inheritance;

public abstract class FuelAuto extends Auto {
    private int availiblePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, Engine engine, int availiblePetrol, int tankVolume) {
        super(producer, model, engine);
        this.availiblePetrol = availiblePetrol;
        this.tankVolume = tankVolume;
    }

    void fuelUp(int petrolVolume){
        availiblePetrol+=petrolVolume;
        System.out.println("Adding fuel");
    }



    public int getAvailiblePetrol() {
        return availiblePetrol;
    }

    public void setAvailiblePetrol(int availiblePetrol) {
        this.availiblePetrol = availiblePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
