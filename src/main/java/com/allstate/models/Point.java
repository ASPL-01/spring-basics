package com.allstate.models;

import java.lang.Math;


public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distance(Point p1, Point p2){
        double x1 = p1.x;
        double y1 = p1.y;
        double x2 = p2.x;
        double y2 = p2.y;
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
    }

    public static double slope(Point p1, Point p2) {
        double x1 = p1.x;
        double y1 = p1.y;
        double x2 = p2.x;
        double y2 = p2.y;
        return (y1-y2)/(x1-x2);
    }

    public static double intercept(Point p1, Point p2) {
        double x1 = p1.x;
        double y1 = p1.y;
        return y1-slope(p1,p2)*x1;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
