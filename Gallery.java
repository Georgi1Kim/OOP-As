public class Gallery {
    private String name;
    private String location;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("Gallery: " + name + ", Location: " + location);
    }
}
