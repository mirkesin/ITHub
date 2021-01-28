//package ru.company.Section1.Task4;
//
//import java.util.Arrays;
//
//public class MyCircle {
//    MyPoint center;
//    int radius;
//
//    public MyCircle() {
//        center = new MyPoint(0, 0);
//        radius = 1;
//    }
//
//    public MyCircle(int x, int y, int radius) {
//        center.setXY(x, y);
//        this.radius = radius;
//    }
//
//    public MyCircle(MyPoint center, int radius) {
//        this.center = center;
//        this.radius = radius;
//    }
//
//    public MyPoint getCenter() {
//        return center;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setCenter(MyPoint center) {
//        this.center = center;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getCenterX() {
//        return center.getX();
//    }
//
//    public int getCenterY() {
//        return center.getY();
//    }
//
//    public void setCenterX(int x) {
//        center.setX(x);
//    }
//
//    public void setCenterY(int y) {
//        center.setY(y);
//    }
//
//    public int[] getCenterXY() {
//        return new int[]{center.getX(), center.getY()};
//    }
//
//    public void setCenterXY(int x, int y) {
//        center.setXY(x, y);
//    }
//
//    @Override
//    public String toString() {
//        return "MyCircle{" +
//                "center=" + Arrays.toString(center.getXY()) +
//                ", radius=" + radius +
//                '}';
//    }
//
//    public double getArea() {
//        return Math.pow(center.getX(), 2) + Math.pow(center.getY(), 2) * Math.PI;
//    }
//
//    public double getCircumference() {
//        return 2 * Math.PI * Math.sqrt(Math.pow(center.getX(), 2) + Math.pow(center.getY(), 2));
//    }
//
//    public double distance(MyCircle another) {
//        double diffX = another.getCenterX() - center.getX();
//        double diffY = another.getCenterY() - center.getY();
//        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
//    }
//}
