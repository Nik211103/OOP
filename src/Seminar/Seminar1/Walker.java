package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Walker extends Hero {


    public Walker(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY, int initiative) {
        super(classHero, healthMax, currentHealth, armor, damage, nameHero, posX, posY, initiative);
    }

    protected void attack(Hero enemy) {
        if(enemy == null){
            win();
        } else {
            int randomDamage = ThreadLocalRandom.current().nextInt(damage[0], damage[1] + 1);
            enemy.getDamage(randomDamage);
        }


    }


    public void step(ArrayList<Hero> enemies) {
        if (currentHealth > 0) {
            Hero nearestEnemy = findNearestAliveEnemy(enemies);
            if (closeEnemy >= 1 && closeEnemy < 1.5) {
                attack(nearestEnemy);// Если враг находится рядом, персонаж начинает атаковать
            } else if(closeEnemy > 1.5) {
                going(enemies); // Если враг находится далеко, персонаж идет к нему
            }
        } else {
            die(enemies);
        }
    }

    public void going(ArrayList<Hero> enemies) {
        if (closeEnemy >= 1) {
            float minDistance = Float.MAX_VALUE;
            Vector2 newPosition = new Vector2(posX, posY); // Новая позиция по умолчанию
            for (Hero enemy : enemies) {
                if (enemy.getCurrentHealth() > 0) {
                    float distance = position.rangeEnemy(enemy.getPosition());
                    if (distance < minDistance) {
                        minDistance = distance;
                        newPosition = enemy.getPosition();
                    }
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
        else if(closeEnemy < 1) {
            return;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}