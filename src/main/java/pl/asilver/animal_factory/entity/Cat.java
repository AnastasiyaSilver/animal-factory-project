package pl.asilver.animal_factory.entity;

import java.awt.*;

public class Cat implements Comparable<Cat>{
    private static long idCounter = 0;
    private Long id;
    private int age;
    private double weight;
    private Color color;

    public Cat(int age, double weight, Color color){
        this.id = idCounter++;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Long getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public Color getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Cat: " +
                "id = " + id +
                ", age = " + age +
                ", weight = " + weight +
                ", color = " + color +
                ".";
    }

    public int compareTo(Cat cat){
        return color.compareTo(cat.getColor());
    }
}

