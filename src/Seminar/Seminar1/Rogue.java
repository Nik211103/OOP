package Seminar.Seminar1;

public class Rogue extends Hero {
    public Rogue(String nameHero, int posX, int posY) {
        super(  "Разбойник",
                100,
                100,
                5,
                new int[]{20, 30},
                nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " Броня: " + armor);
    }
}
