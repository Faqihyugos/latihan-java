package com.example.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah orang: ");
        int people = scanner.nextInt();

        int maxAge = 0;
        int totalAge = 0;

        for (int i = 0; i < people; i++) {
            System.out.println("Orang ke " + (i+1) );

            System.out.print("Nama depan: ");
            String firstName = scanner.next();

            System.out.print("Nama belakang: ");
            String lastName = scanner.next();

            System.out.print("Usia: ");
            int age = scanner.nextInt();

            if (age > maxAge) {
                maxAge = age;
            }
            totalAge += age;

            System.out.print("Tinggi Badan(m): ");
            double height = scanner.nextDouble();

            System.out.print("Berat Badan(kg): ");
            double weight = scanner.nextDouble();

            Person.printData(firstName, lastName, age, height, weight);
        }
        System.out.println("Usia tertua: " + maxAge + ".");
        System.out.println("Usia rata-rata: " + totalAge / people + ".");
    }
}
