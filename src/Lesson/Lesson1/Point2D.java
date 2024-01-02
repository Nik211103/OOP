package Lesson.Lesson1;

/*
* Это точка 2D
*/

public class Point2D {
    private int x, y;
        static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.geyX() - b.geyX(), 2) + Math.pow(a.geyY() - b.geyY(), 2));
    }

    /**
     * Это конструктор
     * @param valueX это координата x
     * @param valueY это координата y
     */
    public Point2D(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }

    public Point2D(int value){
        this(value, value);
    }
    public Point2D(){
        this(0);
    }
//    public Point2D(int value){
//        x = value;
//        y = value;
//    }

    public int geyX(){
        return x;
    }
    public int geyY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }

    private String getInfo(){
        return String.format("x: %d; y: %d", x , y);

    }

    @Override
    public String toString() {
        return getInfo();
    }
}
