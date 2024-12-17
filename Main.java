public class Main {
    public static void main(String[] args) {
        // Create Artists
        Artist artist1 = new Artist("Leonardo da Vinci", 67);
        Artist artist2 = new Artist("Vincent van Gogh", 37);

        // Create Artworks
        Artwork artwork1 = new Artwork("Mona Lisa", "Oil on Canvas", 1503, 860000000);
        Artwork artwork2 = new Artwork("Starry Night", "Oil on Canvas", 1889, 100000000);

        // Create a Gallery
        Gallery gallery = new Gallery("The Art Hub", "Paris");

        // Display Gallery
        gallery.display();

        // Display Artists
        artist1.display();
        artist2.display();

        // Display Artworks
        artwork1.display();
        artwork2.display();

        // Compare Artwork Prices
        System.out.println("\nComparing Artworks:");
        if (artwork1.getPrice() > artwork2.getPrice()) {
            System.out.println(artwork1.getTitle() + " is more expensive than " + artwork2.getTitle());
        } else {
            System.out.println(artwork2.getTitle() + " is more expensive than " + artwork1.getTitle());
        }
    }
}
