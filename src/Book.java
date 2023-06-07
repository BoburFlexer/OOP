public class Book {
    String name;
    String author;
    int year;
    public static String name(String name){
        return name;
    }
    public static  String author(String author){
        return author;
    }
    public static int year(int year){
        return year;
    }
}
//        Book book = new Book();
//        book.name = "War and peace";
//        book.author = "Tolstoy";
//        book.year = 1867;
//        System.out.println(Book.name(book.name));
//        System.out.println(Book.author(book.author));
//        System.out.println(Book.year(book.year));