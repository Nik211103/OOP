package Seminar.Seminar1;

import java.util.ArrayList;


public abstract class Hero {
    protected int health, healthMax, armor;
    protected Vector2 position;
    int[] damage;
    protected String nameHero, classHero;

    public Hero(String classHero, int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.classHero = classHero;
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }

    public String getClassHeroes() {
        return this.classHero; // Возвращает значение поля classHero из текущего экземпляра
    }


    public void printEnemyDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }
    //метод печати метода нахождения дистанции для всех



}





