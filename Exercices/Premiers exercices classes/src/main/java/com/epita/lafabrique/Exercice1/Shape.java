package com.epita.lafabrique.Exercice1;

public abstract class Shape {
    double area;
    int x;
    int y;

    public Shape() {
        area = 20;
        x = 0;
        y = 0;
    }

    abstract void draw();

    abstract void translate(int dx);
}

