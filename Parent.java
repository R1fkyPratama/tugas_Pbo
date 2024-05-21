
package com.mycompany.rifkypratamaputra_keluarga;


public class Parent extends Person {

    Parent(String name, int age, double weight, double height, String occupation) {
        super(name, age, weight, height, occupation);
    }

    @Override
    public void displayInfo() {
        System.out.println("Parent Information:");
        super.displayInfo();
    }
}
