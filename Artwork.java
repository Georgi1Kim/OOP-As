public class Artwork {
    private String title;
    private String medium;
    private int year;
    private double price;

    public Artwork(String title, String medium, int year, double price) {
        this.title = title;
        this.medium = medium;
        this.year = year;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Artwork: " + title + ", Medium: " + medium + ", Year: " + year + ", Price: $" + price);
    }
}



