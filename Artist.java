public class Artist extends Person {
    private String style;

    public Artist(String name, int age, String style) {
        super(name, age);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public String toString() {
        return super.toString() + ", Style: " + style;
    }
}
