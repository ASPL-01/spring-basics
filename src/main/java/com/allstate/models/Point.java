package com.allstate.models;
import java.lang.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distance(Point p1, Point p2){
        return sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
    }

    public static double slope(Point p1, Point p2){
        return (p2.y - p1.y) / (p2.x - p1.x);
    }

    public static double intercept(Point p1, Point p2){
        return p1.y - (slope(p1, p2) * p1.x);
    }
}
