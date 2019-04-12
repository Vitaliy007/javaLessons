package com.javalesson.inheritance;

public class Auto {
    private String producer;
    private String model;
    private Engine engineType;
    private int currentSpeed;
    protected boolean isRunning;

    // constructor to initialize producer; model; engineType fields
    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialized");
    }

    //methods
    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed+=kmPerHour;
        System.out.println("Accelerating is" +currentSpeed+"km/h");
    }


    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
