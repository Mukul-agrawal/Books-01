package Books01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        if (n > 0) {
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Book name : ");
                String bookName = scanner.nextLine().trim();
                System.out.print("Enter Author name : ");
                String autherName = scanner.nextLine().trim();
                System.out.print("Enter ISBN number : ");
                String ISBN = scanner.nextLine().trim();
                books[i] = new Book(bookName,autherName,ISBN);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
        } else {
            System.out.println("N/A");
        }


    }
}
