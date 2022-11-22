package Flyweight;

import Flyweight.Field.Field;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 1000;
    static int DOTS_TO_DRAW = 1000000;
    static int DOTS_TYPES = 11;

    public static void main(String[] args) {
        Field field = new Field();
        for (int i = 0; i < Math.floor(DOTS_TO_DRAW / DOTS_TYPES); i++) {
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Green", Color.GREEN, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Orange", Color.ORANGE, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Blue", Color.BLUE, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Red", Color.RED, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Pink", Color.PINK, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Yellow", Color.YELLOW, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Cyan", Color.CYAN, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Black", Color.BLACK, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Magenta", Color.MAGENTA, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Light Gray", Color.LIGHT_GRAY, "");
            field.plantDot(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Dark Gray", Color.DARK_GRAY, "");
        }
        field.setSize(CANVAS_SIZE, CANVAS_SIZE);
        field.setVisible(true);

        System.out.println(DOTS_TO_DRAW + " dots drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Dot size (8 bytes) * " + DOTS_TO_DRAW);
        System.out.println("+ DotTypes size (~30 bytes) * " + DOTS_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((DOTS_TO_DRAW * 8 + DOTS_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((DOTS_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}