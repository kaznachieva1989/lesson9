package com.company;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
    }

    void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice + " ");
        }
    }

    void makeVoice(String voice) {
        System.out.println(voice);
    }

    void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Гав-гав ");
        }
    }

    @Override
    public String getInfo() {
        return "Dog [" + "name: " + name + ", breed: " + breed + "command: " + commands + "]" + "\n" + super.getInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
}
