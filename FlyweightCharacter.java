public class FlyweightCharacter implements Character{
    private String font;
    private String color;
    private int size;

    public FlyweightCharacter(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
