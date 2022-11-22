package Flyweight.Dots;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class DotFactory {
    static Map<String, DotType> dotTypes = new HashMap<>();

    public static DotType getDotType(String name, Color color, String otherDotData) {
        DotType result = dotTypes.get(name);
        if (result == null) {
            result = new DotType(name, color, otherDotData);
            dotTypes.put(name, result);
        }
        return result;
    }

}