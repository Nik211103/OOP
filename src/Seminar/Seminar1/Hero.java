package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Collections;



public abstract class Hero {
    protected int healthMax, currentHealth, armor, initiative, posX, posY;
    protected Vector2 position;
    int[] damage;
    protected String nameHero, classHero;
    protected float closeEnemy;


    public Hero(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY, int initiative) {
        this.classHero = classHero;
        this.healthMax = healthMax;
        this.currentHealth = currentHealth;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
        this.initiative = initiative;
    }


    protected void getDamage(int damage) {
        if (armor > 0) {
            armor -= damage;
            if (armor < 0) {
                armor = 0;
            }
        } else {
            currentHealth = currentHealth + armor - damage;
            if (currentHealth < 0) {
                currentHealth = 0;
            }
        }

    }

    public void win(){
        System.out.println("Победа!");
    }

    public void die(ArrayList<Hero> heroes) {
        System.out.println(classHero + " " +nameHero + " Умер"); // Удалить персонажа из списка
    }
    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 newPosition) {
        this.position = newPosition;
    }

    public float getCloseEnemy() {
        return closeEnemy;
    }


    protected Hero findNearestAliveEnemy(ArrayList<Hero> enemies) {
        int i;
        Hero currentEnemy, nearestAliveEnemy = null;
        int enemiesNumber = enemies.size();

        for (i = 0; i < enemiesNumber; i++) {
            currentEnemy = enemies.get(i);
            if (currentEnemy.currentHealth > 0) {
                nearestAliveEnemy = currentEnemy;
                break;
            }
        }

        for (int j = i + 1; j < enemiesNumber; j++) {
            currentEnemy = enemies.get(j);
            if (currentEnemy.currentHealth > 0) {
                assert nearestAliveEnemy != null;
                if (position.rangeEnemy(currentEnemy.position) < position.rangeEnemy(nearestAliveEnemy.position)) {
                    nearestAliveEnemy = currentEnemy;
                }
            }
        }
        return nearestAliveEnemy;
    }


    public String getClassHeroes() {
        return this.classHero; // Возвращает значение поля classHero из текущего экземпляра
    }

    public int getHealthMax() {
        return healthMax;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getArmor() {
        return armor;
    }

    public int getInitiative() {
        return initiative;
    }


    //метод печати метода нахождения дистанции для всех

    public void printEnemyDistance(ArrayList<Hero> enemies) {
        enemies.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }

    public void showDistanceToEnemies(ArrayList<Hero> enemies) {
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeEnemy(n.position)));
        closeEnemy = Collections.min(listPositions);
        System.out.println(closeEnemy);
    }


    public abstract void step(ArrayList<Hero> enemies);

    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }


}





