package com.day5;

public class AnimalCage <T> {

    private T[] animal;

    public T[] getAnimal() {
        return animal;
    }

    public void setAnimal(T[] animal) {
        this.animal = animal;
    }
}
