package org.spring;

import java.util.List;

public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    @Override
    public void draw() {
        System.out.println("Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}');
    }


//    List<Point> points;
//
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }
//
//
//    @Override
//    public void draw() {
//        System.out.println("Triangle{" +
//                "points=" + points +
//                '}'
//        );
//    }
}
