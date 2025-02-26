public class Book {
    private String title;
    private String author;
    private int currentPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.currentPage = 1;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void turnPage() {
        currentPage++;
    }

    public String getCurrentPage() {
        return "Page " + currentPage;
    }
}
