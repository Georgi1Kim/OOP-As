import java.util.Arrays;

public class Gallery {
    private String name;
    private String location;
    private Artwork[] artworks;

    public Gallery(String name, String location, Artwork[] artworks) {
        this.name = name;
        this.location = location;
        this.artworks = artworks;
    }

    public void displayAllArtworks() {
        System.out.println("Gallery: " + name + ", Location: " + location);
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }
    }

    public void filterByPrice(double minPrice) {
        System.out.println("Artworks priced above $" + minPrice + ":");
        for (Artwork artwork : artworks) {
            if (artwork.getPrice() > minPrice) {
                System.out.println(artwork);
            }
        }
    }

    public void sortArtworksByYear() {
        Arrays.sort(artworks, (a1, a2) -> Integer.compare(a1.getYear(), a2.getYear()));
        System.out.println("Artworks sorted by year:");
        displayAllArtworks();
    }
}
