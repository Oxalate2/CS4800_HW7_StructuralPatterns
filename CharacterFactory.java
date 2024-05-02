import java.util.Map;
import java.util.HashMap;

public class CharacterFactory {
    private static Map<String, Character> flyweights = new HashMap<>();

    public static Character getCharacter(String font, String color, int size) {
        String key = font + "-" + color + "-" + size;
        if(!flyweights.containsKey(key)) {
            flyweights.put(key, new FlyweightCharacter(font, color, size));
        }
        return flyweights.get(key);
    }
}
