package pl.asilver.animal_factory.service;

import pl.asilver.animal_factory.entity.Cat;
import pl.asilver.animal_factory.entity.Color;

public class CatService {
    public Cat createCat(){
        int age = (int) Math.random() * 15 + 1;
        double weight = (double) Math.random() * 10 + 1;
        Color color = Color.values()[(int) (Math.random() * Color.values().length)];
        return new Cat(age,weight,color);
    }
}
