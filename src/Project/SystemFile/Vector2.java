package Project.SystemFile;

import Project.AbstractCLasesAndInterface.Hero;

public class Vector2 {
    protected int x, y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public void setX(int newX) {x = newX;}

    public void setY(int newY) {y = newY;}

    public float getDistance(Hero hero) {
        Vector2 position = hero.position;
        return (float) Math.sqrt(Math.pow(x - position.x, 2) + Math.pow(y - position.y, 2));
    }

    public Vector2 getDeltas(Vector2 positionEnemy) {
        return new Vector2(x - positionEnemy.x, y - positionEnemy.y);
    }

    public boolean equals(Vector2 positionEnemy) {
        return x == positionEnemy.getX() && y == positionEnemy.getY();
    }
}
