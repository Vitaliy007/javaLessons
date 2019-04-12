package com.javalesson.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> pistons = new ArrayList<>();

    public Engine(double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        this.pistons = pistons;
    }
}
