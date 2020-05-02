package Books01;

public class Book {
    private String authorName;
    private String bookName;
    private String isbn;

    public Book(String bookName, String authorName, String isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "AuthorName = '" + authorName + '\'' +
                ", BookName = '" + bookName + '\'' +
                ", ISBN = '" + isbn + '\'';
    }
}

