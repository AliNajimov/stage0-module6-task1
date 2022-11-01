package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String str = "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
        return str;
    }
}
