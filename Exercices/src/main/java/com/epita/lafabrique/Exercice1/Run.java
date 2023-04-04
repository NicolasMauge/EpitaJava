package com.epita.lafabrique.Exercice1;

public class Run {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.translate(2);
        shape.draw();
        shape = new Rectangle();
        shape.translate(5);
        shape.draw();
    }
}

