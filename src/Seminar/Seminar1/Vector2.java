package Seminar.Seminar1;

public class Vector2 {

    protected int X, Y;
    protected double distance;

    public Vector2(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public float rangeEnemy(Vector2 posEnemy) {
        distance = Math.sqrt(Math.pow(posEnemy.Y - Y, 2) + Math.pow(posEnemy.X - X, 2));
        return (float) distance;
    }
    //метод поиска дистанции врага


    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}