package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
        getDescription();
    }

    public String getDescription() {
        String str;
        if (hasFur) {
            str = String.format("This animal is mostly %s. It has %d paws and a fur.", color, numberOfPaws);
        } else {
            str = String.format("This animal is mostly %s. It has %d paws and no fur.", color, numberOfPaws);
        }
        return str;
    }
    }
