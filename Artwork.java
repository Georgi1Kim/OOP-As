import java.util.Objects;

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

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork: " + title + ", Medium: " + medium + ", Year: " + year + ", Price: $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artwork artwork = (Artwork) obj;
        return year == artwork.year && Double.compare(artwork.price, price) == 0 && title.equals(artwork.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, price);
    }
}
