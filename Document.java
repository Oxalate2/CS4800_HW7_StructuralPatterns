import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class Document {
    private List<ConcreteCharacter> characters = new ArrayList<>();

    public void addCharacter(Character flyweight, char value) {
        characters.add(new ConcreteCharacter(flyweight, value));
    }

    public void editCharacter(int index, char value) {
        characters.get(index).getValue();
    }

    public void save(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (ConcreteCharacter character : characters) {
                writer.printf("%s %s %d %c%n", character.getFont(), character.getColor(), character.getSize(), character.getValue());
            }
        }
    }

    public void load(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                Character flyweight = CharacterFactory.getCharacter(parts[0], parts[1], Integer.parseInt(parts[2]));
                char value = parts[3].charAt(0);
                addCharacter(flyweight, value);

            }
        }
    }
}
