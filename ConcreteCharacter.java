public class ConcreteCharacter {
    private Character flyweight;
    private char value;

    public ConcreteCharacter(Character flyweight, char value) {
        this.flyweight = flyweight;
        this.value = value;
    }

    public String getFont() {
        return flyweight.getFont();
    }

    public String getColor() {
        return flyweight.getColor();
    }

    public int getSize() {
        return flyweight.getSize();
    }

    public char getValue() {
        return value;
    }
}
