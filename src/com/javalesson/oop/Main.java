package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        Dog.getDogsCount();

        Dog lab = new Dog();
        lab.setName("Charley");
        lab.setBreed("Labr");
        lab.setSize(Size.AVERAGE);
        lab.bark();

        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        //sheppard.setSize(Size.BIG);
        sheppard.bark();

        Dog doberman = new Dog();
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.BIG);
        doberman.bite();


        Size s = Size.SMALL;
        System.out.println(s);

        Size[] values = Size.values();
        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }
    }

}