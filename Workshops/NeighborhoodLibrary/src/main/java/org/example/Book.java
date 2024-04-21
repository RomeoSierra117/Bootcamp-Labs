package org.example;

import java.util.Scanner;

    class Book {
        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        Scanner scanner = new Scanner(System.in);

        // Constructor
        public Book(int id, String isbn, String title) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = "";
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getTitle() {
            return title;
        }

        public boolean isCheckedOut() {
            return isCheckedOut;
        }

        public String getCheckedOutTo() {
            return checkedOutTo;
        }

        // Method to check out the book
        public void checkOut(String name) {
            if (!isCheckedOut) {
                isCheckedOut = true;
                checkedOutTo = name;
                System.out.println("Book checked out successfully to " + name);
            } else {
                System.out.println("Sorry, the book is already checked out.");
            }
        }

        // Method to check in the book
        public void checkIn() {
            if (isCheckedOut) {
                isCheckedOut = false;
                checkedOutTo = "";
                System.out.println("Book checked in successfully.");
            } else {
                System.out.println("This book is not checked out.");
            }
        }
    }



