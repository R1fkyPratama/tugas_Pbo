
package com.mycompany.rifkypratamaputra_keluarga;


public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String occupation;

    public Person(String name, int age, double weight, double height, String occupation) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getOccupation() {
        return occupation;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Occupation: " + occupation);
    }
}