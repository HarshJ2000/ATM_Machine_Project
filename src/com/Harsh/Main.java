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
            while(true){
                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini-Statement\n5. Exit");
                System.out.println("Enter Choice: ");
                int ch = sc.nextInt();
                if (ch == 1) {

                }
                else if (ch == 2) {

                }
                else if (ch == 3) {

                }
                else if (ch == 4) {

                }
                else if (ch == 5) {
                    System.out.println("Please Collect Your ATM Card...\n Thank you for using  ATM Machine!!!");
                    System.exit(0);
                }else{
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}
