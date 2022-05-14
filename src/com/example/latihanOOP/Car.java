package com.example.latihanOOP;

public class Car {
    private String name;
    private String color;
    private int distance = 0;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println("Nama: "+ this.name);
        System.out.println("Warna: "+ this.color);
        System.out.println("Jarak: "+ this.distance + " km");
    }

    public void run(int distance) {
        System.out.println("Bergerak "+ distance +"km ...");
        this.distance = distance;
        System.out.println("Jarak: "+ this.distance + " km");
    }
}
