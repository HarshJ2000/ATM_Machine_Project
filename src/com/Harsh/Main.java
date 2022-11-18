package com.Harsh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin: ");
        int pin = sc.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            System.out.println("Validation Done Successfully...");
        }
        else{
            System.out.println("Incorrect Atm Number or Pin!!!");
            System.exit(0);
        }
    }
}
