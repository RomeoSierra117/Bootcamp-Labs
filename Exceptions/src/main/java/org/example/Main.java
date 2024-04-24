package org.example;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put in a number");

        try {
            //parsing is converting one thing to another-- taking a string and converting it to an interger
            double number = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the next number");

            double secondNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Result : " + (number/secondNumber));

        }
        catch (InputMismatchException ex) {
            System.out.println("Please input a number");
        }

        }
        catch (NumberFormatException ex) {
            System.out.println("Please type in a number");
        }
        catch (Exception ex){
            System.out.println("Sorry about that! We're working on it.");
        }


        //all the red messages when you run the code is called stack trace
        //basically everything that happened before the code crashed


        // exceptions cause your program to crash
        //if your program builds it can run
        //there are compile time errors and run time error


    }
}