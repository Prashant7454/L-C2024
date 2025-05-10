import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookRepository {
    public void save(Book book) {
        String filename = "documents/" + book.getTitle() + " - " + book.getAuthor() + ".ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Book saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
