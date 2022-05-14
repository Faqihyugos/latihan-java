package com.example.latihanOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle("Bianchi","Hijau");
        System.out.println(" [Info Sepeda] ");
        bicycle.printData();
        System.out.println("-----------------");
        System.out.print("Masukkan jarak yang akan ditempuh: ");
        int bicycleDistance = scanner.nextInt();
        bicycle.run(bicycleDistance);
    }
}
