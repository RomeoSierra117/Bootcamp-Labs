package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double principal;
        //double interestRate;
       // int loanLenght;
        //double totalInterest;
      //  double monthlyPayment;



                System.out.println("Enter loan amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate in %: ");
        double interestRate = scanner.nextDouble();
        double monthlyInterest = interestRate / 100/ 12;


        System.out.println("Enter loan length in years: ");
        int loanLength = scanner.nextInt();
        int numberOfPayments = loanLength * 12;



        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;


        System.out.println(" Your monthly payment is: " + monthlyPayment);
        System.out.println("Your total interest paid would be: " + totalInterest);




        }

    }
