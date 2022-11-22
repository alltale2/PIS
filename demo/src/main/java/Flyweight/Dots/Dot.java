package Flyweight.Dots;

import java.awt.*;

public class Dot {
    private int x;
    private int y;
    private DotType type;

    public Dot(int x, int y, DotType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}