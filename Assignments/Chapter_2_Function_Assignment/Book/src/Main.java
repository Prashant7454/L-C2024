public class Main {
    public static void main(String[] args) {
        Book book = new Book("A Great Book", "John Doe");
        book.turnPage();

        Printer plainPrinter = new PlainTextPrinter();
        plainPrinter.printPage(book.getCurrentPage());

        BookRepository repository = new BookRepository();
        repository.save(book);

        LibraryLocation location = new LibraryLocation("A12", "Room 3");
        System.out.println("Book location: " + location.getLocation());
    }
}
