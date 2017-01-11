package com.allstate.models;

import java.util.List;

public class Triangle {
    private int height;
    private int width;

    public static double area(List<Triangle> triangles){
        return 0.3;
    }

    public Triangle() {
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea(){
        return this.height * this.width * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
