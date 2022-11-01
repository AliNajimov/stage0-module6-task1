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
            if (numberOfPaws == 1) {
                str = "This animal is mostly ";
                str += color;
                str += ".It has ";
                str += numberOfPaws;
                str += " paw and a fur";
            } else {
                str = "This animal is mostly ";
                str += color;
                str += ". It has ";
                str += numberOfPaws;
                str += " paws and a fur";
            }
            return str;
        } else {
            if (numberOfPaws == 1) {
                str = "This animal is mostly ";
                str += color;
                str += ". It has ";
                str += numberOfPaws;
                str += " paw and no fur";
            } else {
                str = "This animal is mostly ";
                str += color;
                str += ". It has ";
                str += numberOfPaws;
                str += " paws and no fur";
            }
            return str;
        }
    }
