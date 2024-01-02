package Lesson.Lesson1;

import static Lesson.Lesson1.Point2D.distance;

public class Lesson1 {
//    static double distance(Point2D a, Point2D b){
//        return Math.sqrt(Math.pow(a.geyX() - b.geyX(), 2) + Math.pow(a.geyY() - b.geyY(), 2));
//    }
    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
        System.out.println(a);
        a.setX(2);
        System.out.println(a.geyX());

        Point2D b = new Point2D(0,2);
        System.out.println(b);
        System.out.println(distance(a,b));

        var dis = distance(a,b);
    }
}
