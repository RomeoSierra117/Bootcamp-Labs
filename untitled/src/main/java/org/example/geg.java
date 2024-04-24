package org.example;

import java.util.Scanner;


public class NeighborhoodLibrary {
    private static Book[] inventory = new Book[20];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize some books in the inventory
        initializeInventory();

        // Main menu
        while (true) {
            System.out.println("Neighborhood Library - Home Screen");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAvailableBooks();
                    break;
                case 2:
                    showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeInventory() {
        // Initialize some example books
        inventory[0] = new Book(1, "978-0545582889", "The Hunger Games");
        inventory[1] = new Book(2, "978-0439064873", "Harry Potter and the Sorcerer's Stone");
        inventory[2] = new Book(3, "978-0439139601", "Harry Potter and the Chamber of Secrets");
        inventory[3] = new Book(4, "978-0439358071", "Harry Potter and the Prisoner of Azkaban");
        inventory[4] = new Book(5, "978-0439785969", "Harry Potter and the Goblet of Fire");
        inventory[5] = new Book(6, "978-0439064866", "Harry Potter and the Order of the Phoenix");
        inventory[6] = new Book(7, "978-0439785969", "Harry Potter and the Half-Blood Prince");
        inventory[7] = new Book(8, "978-0545010221", "Harry Potter and the Deathly Hallows");
        inventory[8] = new Book(9, "978-0142424179", "The Fault in Our Stars");
        inventory[9] = new Book(10, "978-0525478812", "The Book Thief");
        inventory[10] = new Book(11, "978-0739326222", "Twilight");
        inventory[11] = new Book(12, "978-0060256654", "Where the Wild Things Are");
        inventory[12] = new Book(13, "978-0439139601", "Percy Jackson & the Olympians: The Lightning Thief");
        inventory[13] = new Book(14, "978-0545162074", "The Maze Runner");
        inventory[14] = new Book(15, "978-0439023480", "The Hunger Games: Catching Fire");
        inventory[15] = new Book(16, "978-0545663267", "Fahrenheit 451");
        inventory[16] = new Book(17, "978-0142414934", "The Lightning Thief");
        inventory[17] = new Book(18, "978-0316015840", "The Hunger Games: Mockingjay Part 1");
        inventory[18] = new Book(19, "978-0316015841", "The Hunger Games: Mockingjay Part 2");
        inventory[19] = new Book(20, "978-0316015842", "The Hunger Games: Mockingjay Part 3 ");
        // Add more books as needed
    }

    private static void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : inventory) {
            if (book != null && !book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + " | ISBN: " + book.getIsbn() + " | Title: " + book.getTitle());
            }
        }
        System.out.println("Enter the ID of the book you want to check out (or 0 to go back):");
        int bookId = scanner.nextInt();
        if (bookId == 0) {
            return;
        }
        System.out.println("Enter your name:");
        String name = scanner.next();
        for (Book book : inventory) {
            if (book != null && book.getId() == bookId) {
                book.checkOut(name);
                break;
            }
        }
    }

    private static void showCheckedOutBooks() {
        System.out.println("Checked Out Books:");
        for (Book book : inventory) {
            if (book != null && book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + " | ISBN: " + book.getIsbn() + " | Title: " + book.getTitle() + " | Checked Out To: " + book.getCheckedOutTo());
            }
        }
        System.out.println("Enter C to check in a book, or X to go back to the home screen:");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("C")) {
            checkInBook();
        } else if (choice.equalsIgnoreCase("X")) {
            return;
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void checkInBook() {
        System.out.println("Enter the ID of the book you want to check in:");
        int bookId = scanner.nextInt();
        for (Book book : inventory) {
            if (book != null && book.getId() == bookId) {
                book.checkIn();
                break;
            }
        }
    }
}
