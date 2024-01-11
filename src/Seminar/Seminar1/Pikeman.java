package Seminar.Seminar1;

public class Pikeman extends Hero{
    public Pikeman(String nameHero, int posX, int posY) {
        super(  "Копейщик",
                100,
                100,
                5,
                new int[]{20, 30},
                nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }
}
