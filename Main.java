
package com.mycompany.rifkypratamaputra_keluarga;


public class Main {
    public static void main(String[] args) {
        Parent father = new Parent("Panut", 55, 75.5, 168.0, "BUruh");
        Parent mother = new Parent("Sulistin Fatmawati ", 45, 65.0, 160.0, "Guru");
        Child child = new Child("Rifky Pratama putra", 20, 60.0, 175.0, "Mahasiswa");

        System.out.println("Family Information:");
        father.displayInfo();
        System.out.println();
        mother.displayInfo();
        System.out.println();
        child.displayInfo();
    }
}