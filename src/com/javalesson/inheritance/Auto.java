package com.javalesson.inheritance;

public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    // constructor to initialize producer; model; engine fields
    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }

    public abstract void energize();
    //methods
    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
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


    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public Engine getEngine() {
        return engine;
    }
}
