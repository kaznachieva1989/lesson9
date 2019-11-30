package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Гуччи");
        dog1.setBreed("лабрадор");
        dog1.setColor(Color.WHITE);
        dog1.setShelter(new Shelter("Мимими", "Токтогула 175"));
        dog1.setCommands("бегом");
        dog1.setAge(5);

        Dog dog2 = new Dog("Мухтар", "овчарка", Color.GRAY, new Shelter("Защитник", "Чуй 25"));
        dog2.setCommands("сидеть");
        dog2.setAge(7);

        Dog dog3 = new Dog("Симбо", "хаска", new Shelter("Друзья", "5мкр.57"), "лежать");
        dog3.setColor(Color.BLACK);
        dog3.setAge(9);

        Dog[] dogs = {dog1, dog2, dog3};
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getInfo());
            dogs[i].makeVoice("Гав");
            dogs[i].makeVoice(2);
            dogs[i].makeVoice("Гав", 2);
        }
    }
}

