package be.intecbrussel;

public class BookStore {
    public static void main(String[] args) {


        Book book = new Book();//no-args constructor

        Book book2 = new Book("Lord of the Rings");//constructor met 1 parameter

        Book book3 = new Book("Dikke van Dale", 99.95, true);


//        book.setTitle("Harry Potter");
//        System.out.println(book.getTitle());
//        System.out.println(book.getPrice());
//        System.out.println(book.getisAvailable());


//        System.out.println(book3);
//        System.out.println(book);
//        System.out.println(book2);


        book.requestBook(6);



    }
}
