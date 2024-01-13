package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Random;


public abstract class Hero {
    protected static Random random = new Random();
    protected int healthMax, currentHealth, armor, initiative;
    protected Vector2 position;
    int[] damage;
    protected String nameHero, classHero;


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
        if (this.currentHealth - damage > 0) {
            this.currentHealth -= damage;
        } else {
            this.currentHealth = 0;
        }
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
            if(currentEnemy.currentHealth > 0) {
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

    public int getHealthMax() {return healthMax;}

    public int getCurrentHealth() {return currentHealth;}

    public int getArmor() {return armor;}
    public int getInitiative() {return initiative;}


    public void printEnemyDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }

    //метод печати метода нахождения дистанции для всех
    public abstract void step(ArrayList<Hero> enemies);

    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }



}





