package Seminar.Seminar1;

public class Vector2 {

    public int X, Y;


    public Vector2(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public float rangeEnemy(Vector2 posEnemy) {
        double distance = Math.sqrt(Math.pow(posEnemy.Y - Y, 2) + Math.pow(posEnemy.X - X, 2));
        return (float) distance;
    }
    //метод поиска дистанции врага

    public Vector2 getDelta(Vector2 posEnemy){
        return new Vector2(X-posEnemy.X, Y - posEnemy.Y);
    }





}
