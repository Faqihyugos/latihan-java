package com.example.latihanOOP;

public class Bicycle {
    private String name;

    Bicycle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(" [Info Sepeda] ");
        System.out.println("Nama: "+ this.getName());
    }
}
