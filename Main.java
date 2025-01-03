public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Leonardo da Vinci", 67, "Renaissance");
        Artist artist2 = new Artist("Vincent van Gogh", 37, "Post-Impressionism");

        Artwork artwork1 = new Artwork("Mona Lisa", "Oil on Canvas", 1503, 860000000);
        Artwork artwork2 = new Artwork("Starry Night", "Oil on Canvas", 1889, 100000000);
        Artwork artwork3 = new Artwork("The Last Supper", "Oil on Plaster", 1498, 450000000);

        Artwork[] artworks = {artwork1, artwork2, artwork3};

        Gallery gallery = new Gallery("The Art Hub", "Paris", artworks);

        gallery.displayAllArtworks();

        gallery.filterByPrice(200000000);

        gallery.sortArtworksByYear();

        System.out.println("\nDemonstrating Polymorphism:");
        Person[] people = {artist1, artist2};
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
