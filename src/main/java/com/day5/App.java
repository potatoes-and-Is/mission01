package com.day5;

import com.day5.plant.Elephant;
import com.day5.plant.Giraffe;
import com.day5.predetor.Lion;

public class App {

    public static void main(String[] args) {
//        Animal[] animals = {new Lion("사자",4), new Giraffe("기린")};
        Plant[] plants = {new Elephant("사자"), new Giraffe("기린")};
        AnimalCage<Plant> animalCage = new AnimalCage<>();

        setGiraffe(animalCage, plants);
        getPlant(animalCage);
    }

    // Predetor 포함 자식들만 가지고 온다
    private static void getPlant (AnimalCage <? extends Plant> planAnimalCage) {
        Plant[] plants = planAnimalCage.getAnimal(); // 배열로 받아옴
        for (Plant plant : plants) {
            System.out.println(plant.getName());
        }
    }

    // Giraffe 포함 상위
    private static void setGiraffe (AnimalCage <? super Plant> planAnimalCage, Plant[] plants) {
        planAnimalCage.setAnimal(plants);
    }

}

