package Flyweight.Field;

import Flyweight.Dots.Dot;
import Flyweight.Dots.DotFactory;
import Flyweight.Dots.DotType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field extends JFrame {
    private List<Dot> dots = new ArrayList<>();

    public void plantDot(int x, int y, String name, Color color, String otherDotData) {
        DotType type = DotFactory.getDotType(name, color, otherDotData);
        Dot dot = new Dot(x, y, type);
        dots.add(dot);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Dot dot : dots) {
            dot.draw(graphics);
        }
    }
}