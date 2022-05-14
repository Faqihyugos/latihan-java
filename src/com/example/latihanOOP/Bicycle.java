package com.example.latihanOOP;

public class Bicycle {
    private String name;
    private String color;

    Bicycle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println("Nama: "+ this.getName());
        System.out.println("Color: "+ this.color);
    }
}
