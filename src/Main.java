package src;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        World w = new World(1000, 1000);
        Turtle tom = new Turtle(w);

        // Spelled out TOM (Part B)

        tom.forward(100);
        tom.turn(270);
        tom.penUp();
        tom.forward(50);
        tom.turn(180);
        tom.penDown();
        tom.forward();

        tom.penUp();
        tom.forward(15);

        tom.penDown();
        tom.forward(100);
        tom.turnRight();
        tom.forward(100);
        tom.turnRight();
        tom.forward(100);
        tom.turnRight();
        tom.forward(100);

        tom.turnRight();
        tom.penUp();
        tom.forward(115);

        tom.turnRight();
        tom.penDown();
        tom.forward(100);
        tom.turn(180);
        tom.penUp();
        tom.forward(100);
        tom.penDown();

        tom.turn(140);
        tom.forward(80);
        tom.turn(-100);
        tom.forward(80);
        tom.turn(140);
        tom.forward(100);

    }

}
