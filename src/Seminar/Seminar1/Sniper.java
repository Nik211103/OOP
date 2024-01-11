package Seminar.Seminar1;

public class Sniper extends Archer {
    public Sniper(String nameHero, int posX, int posY) {
        super(  "Снайпер",
                75,
                75,
                2,
                new int[]{10, 15},
                nameHero, posX, posY);
        this.maxArrows = this.currentArrows = 10;
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }


}
