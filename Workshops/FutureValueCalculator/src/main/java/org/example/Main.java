package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double deposit;
    double interestRate;
    int numberOfYears;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter deposit amount: ");
        deposit = scanner.nextDouble();

        System.out.println("Enter interest rate: ");
        interestRate = scanner.nextDouble();

        System.out.println("Enter the total number of years: ");
        numberOfYears = scanner.nextInt();
        double decInterestRate = interestRate / 100.0;

        double futureValue = deposit * Math.pow(1 + ( decInterestRate/ 365), 365 * numberOfYears);
        double totalInterest = futureValue - deposit;



        System.out.println("The future value of your CD would be: " + futureValue);
        System.out.println("The total interest earned would be: " + totalInterest);
    }
}