public class LibraryLocation {
    private String shelfNumber;
    private String roomNumber;

    public LibraryLocation(String shelfNumber, String roomNumber) {
        this.shelfNumber = shelfNumber;
        this.roomNumber = roomNumber;
    }

    public String getLocation() {
        return "Shelf: " + shelfNumber + ", Room: " + roomNumber;
    }
}
