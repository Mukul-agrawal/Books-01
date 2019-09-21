package Books01;

public class Book {
    private String Authername;
    private String Bookname;
    private String ISBN;

    public Book(String Bookname, String Authername, String ISBN) {
        this.Bookname = Bookname;
        this.Authername = Authername;
        this.ISBN = ISBN;

    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String Bookname) {
        this.Bookname = Bookname;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthername() {
        return Authername;
    }

    public void setAuthername(String Authername) {
        this.Authername = Authername;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + getBookname() +
                "\nAuthor Name:\t" + getAuthername() +
                "\nISBN:\t" + getISBN() +
                "\n-----------------------------";

    }
}
