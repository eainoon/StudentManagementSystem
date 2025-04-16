public class Library {
    private String location;
    private int totalBooks;
    private boolean isOpen;

    // Constructor
    public Library(String location, int totalBooks, boolean isOpen) {
        this.location = location;
        this.totalBooks = totalBooks;
        this.isOpen = isOpen;
    }

    // Methods
    public void borrowBook() {
        if (totalBooks > 0 && isOpen) {
            totalBooks--;
            System.out.println("A book has been borrowed. Remaining books: " + totalBooks);
        } else {
            System.out.println("Cannot borrow books right now.");
        }
    }

    public void returnBook() {
        totalBooks++;
        System.out.println("A book was returned. Total books: " + totalBooks);
    }

    public void status() {
        System.out.println("Library Location: " + location);
        System.out.println("Open Status: " + (isOpen ? "Open" : "Closed"));
        System.out.println("Available Books: " + totalBooks);
    }
}
//Eainan is doing this in Assignment 2
