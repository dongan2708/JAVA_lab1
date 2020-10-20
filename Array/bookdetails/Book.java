package Array.bookdetails;

import java.util.Scanner;

public class Book {
    int books[][];
    byte bookCount;

    public Book(){
        books = new int[3][3];
        bookCount = 0;
    }
    void addBook(){
        Scanner input = new Scanner(System.in);

        if (bookCount < books.length){
            //Accept the ISBN number
            System.out.println("Enter the IDBN number of the book:");
            books[bookCount][0] = input.nextInt();
            //Accept the number of pages in the book
            System.out.println("Enter the number of pages in the book:");
            books[bookCount][1] = input.nextInt();
            //Accept the year of publication
            System.out.println("Enter the year of publication:");
            books[bookCount][2] = input.nextInt();

            bookCount++;
        }else
            System.out.println("Sorry! Unable to add more books.\n");

    }
    void displayBooks(){
        //Display books only if the repository is not empty
        if (bookCount > 0){
            System.out.println("\n ISBN \t\tPages \t Publication Year");
            System.out.println("---------------------------------------");

            for (int rowIndex = 0;rowIndex < bookCount;rowIndex++){
                System.out.printf("%d\t\t", books[rowIndex][0]);
                System.out.printf("%d\t\t",books[rowIndex][1]);
                System.out.printf("%d\t\t",books[rowIndex][2]);
            }
        }else
            System.out.println("No books to display");
    }
    void searchByIsbn() {
        boolean bookFound = false;
        if (bookCount > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the ISBN number of the book you " + "want to search for:");
            int searchIsbn = input.nextInt();
            System.out.println("ISBN \t\tPages \t Publication Year");
            System.out.println("-------------------------------------");

            for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                if (books[rowIndex][0] == searchIsbn) {
                    System.out.printf("%d\t\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\t\t", books[rowIndex][2]);
                    bookFound = true;
                    break;
                }
            }
            if (!bookFound)
                System.out.println("Book not found,");
        } else
            System.out.println("No books to search");
    }
    void searchByYear(){
            boolean bookFound = false;

            if (bookCount > 0) {
                Scanner input = new Scanner(System.in);
                System.out.println("\n enter the year of publication of the book" +
                        "you want share for: ");
                int publicationYear = input.nextInt();
                System.out.println("ISBN \t\tPages \t publication year");
                System.out.println("-------------------------------------");

                for (int rowIndex = 0; rowIndex < bookCount; rowIndex++) {
                    if (books[rowIndex][0] == publicationYear) {
                        System.out.printf("%d\t\t", books[rowIndex][0]);
                        System.out.printf("%d\t\t", books[rowIndex][1]);
                        System.out.printf("%d\t\t", books[rowIndex][2]);
                        bookFound = true;
                        if (!bookFound)
                            System.out.println("Book not found,");
                    } else
                        System.out.println("No books to search");
                }
            }
    }

}
