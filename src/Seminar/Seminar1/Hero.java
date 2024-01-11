package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Random;


public abstract class Hero {
    protected static Random random = new Random();
    protected int healthMax, currentHealth, armor;
    protected Vector2 position;
    int[] damage;
    protected String nameHero, classHero;


    public Hero(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.classHero = classHero;
        this.healthMax = healthMax;
        this.currentHealth = currentHealth;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }

    public String getClassHeroes() {
        return this.classHero; // Возвращает значение поля classHero из текущего экземпляра
    }

    public void getDamage(int damage) {
        if (this.currentHealth - damage > 0) {
            this.currentHealth -= damage;
        } else {
            this.currentHealth = 0;
        }
    }



    public void printEnemyDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }
    //метод печати метода нахождения дистанции для всех


}





