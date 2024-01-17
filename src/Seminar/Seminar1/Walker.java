
package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Walker extends Hero{


    public Walker(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY, int initiative) {
        super(classHero, healthMax, currentHealth, armor, damage, nameHero, posX, posY, initiative);
    }

    protected void attack(Hero enemy) {
        Random random = new Random();
        enemy.getDamage(random.nextInt(damage[0],damage[1]));
    }

    public void step(ArrayList<Hero> enemies) {
        if (currentHealth > 0) {
            Hero nearestEnemy = findNearestAliveEnemy(enemies);
            float distanceToNearestEnemy = position.rangeEnemy(nearestEnemy.getPosition());
            if(distanceToNearestEnemy > 1 && distanceToNearestEnemy < 2)  {
                attack(nearestEnemy);// Если враг находится рядом, персонаж начинает атаковать

            }else {
                going(enemies); // Если враг находится далеко, персонаж идет к нему
            }
        } else {
            return;
        }
    }

    public void going(ArrayList<Hero> enemies){
        Hero nearestEnemy = findNearestAliveEnemy(enemies);
        float minDistance = Float.MAX_VALUE;
        Vector2 newPosition = new Vector2(posX, posY); // Новая позиция по умолчанию

        for (Hero enemy : enemies) {
            float distance = position.rangeEnemy(enemy.getPosition());
            if (distance < minDistance) {
                minDistance = distance;
                newPosition = enemy.getPosition();
            }
        }

        //Здесь была ошибка, позиция при ходьбе менялась не так как надо, она прибавлялась в координаты врага
        if (getPosition().getX() < newPosition.getX()) {
            newPosition.setX(newPosition.getX() - 1); // Идти вправо
        } else if (getPosition().getX() > newPosition.getX()) {
            newPosition.setX(newPosition.getX() + 1); // Идти влево
        }
        if (getPosition().getY() < newPosition.getY()) {
            newPosition.setY(newPosition.getY() - 1); // Идти вверх
        } else if (getPosition().getY() > newPosition.getY()) {
            newPosition.setY(newPosition.getY() + 1); // Идти вниз
        }
    }




    @Override
    public String toString() {
        return super.toString();
    }
}