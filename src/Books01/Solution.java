package Books01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        if (n > 0) {
            scanner.nextLine().trim();

            for (int i = 0; i < n; i++) {
                String Bookname = scanner.nextLine().trim();
                String Authername = scanner.nextLine().trim();
                String ISBN = scanner.nextLine().trim();
                books[i] = new Book(Bookname, Authername, ISBN);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
        } else {
            System.out.println("N/A");
        }


    }
}
