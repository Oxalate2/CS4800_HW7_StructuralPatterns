import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = new Document();

        // Add characters with different properties
        document.addCharacter(CharacterFactory.getCharacter("Arial", "Red", 12), 'H');
        document.addCharacter(CharacterFactory.getCharacter("Calibri", "Blue", 14), 'e');
        document.addCharacter(CharacterFactory.getCharacter("Verdana", "Black", 16), 'l');
        document.addCharacter(CharacterFactory.getCharacter("Arial", "Red", 12), 'l');
        document.addCharacter(CharacterFactory.getCharacter("Calibri", "Blue", 14), 'o');
        document.addCharacter(CharacterFactory.getCharacter("Verdana", "Black", 16), 'W');
        document.addCharacter(CharacterFactory.getCharacter("Arial", "Red", 12), 'o');
        document.addCharacter(CharacterFactory.getCharacter("Calibri", "Blue", 14), 'r');
        document.addCharacter(CharacterFactory.getCharacter("Verdana", "Black", 16), 'l');
        document.addCharacter(CharacterFactory.getCharacter("Arial", "Red", 12), 'd');

        // Save the document to a file
        document.save("HelloWorldCS5800.txt");

        // Load document from a file
        Document loadedDocument = new Document();
        loadedDocument.load("HelloWorldCS5800.txt");

        // Print loaded document
        /*for (ConcreteCharacter character : loadedDocument.getCharacter()) {
            System.out.printf("%s %s %d %c%n", character.getFont(), character.getColor(), character.getSize(), character.getValue());
        }*/
    }
}
