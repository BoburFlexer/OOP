public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "War and peace";
        book.author = "Tolstoy";
        book.year = 1867;
        System.out.println(Book.name(book.name));
        System.out.println(Book.author(book.author));
        System.out.println(Book.year(book.year));
    }
}