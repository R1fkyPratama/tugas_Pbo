
package com.mycompany.rifkypratamaputra_keluarga;



public class Child extends Parent {

    Child(String name, int age, double weight, double height, String occupation) {
        super(name, age, weight, height, occupation);
    }

    @Override
    public void displayInfo() {
        System.out.println("Child Information:");
        super.displayInfo();
    }
}
