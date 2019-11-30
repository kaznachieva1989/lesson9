package com.company;

import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    Shelter shelter;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int generateDefaultAge() {
        Random r = new Random();
        int num = r.nextInt(5) + 1;
        return num;
    }

    public String getInfo() { // если поставить final после public, дочерние классы не смогут перезаписать
        return "Pet [" + "age: " + age + ",shelter's name: " + shelter.getName() +
                "shelter's address: " + shelter.getAddress() + ", color " + color + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = generateDefaultAge();
    }
}
