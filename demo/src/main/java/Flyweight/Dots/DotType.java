
package Flyweight.Dots;

import java.awt.*;

public class DotType {
    private String name;
    private Color color;
    private String otherDotData;

    public DotType(String name, Color color, String otherDotData) {
        this.name = name;
        this.color = color;
        this.otherDotData = otherDotData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}