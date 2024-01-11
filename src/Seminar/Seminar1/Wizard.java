package Seminar.Seminar1;

public class Wizard extends Hero{
    public Wizard(String nameHero, int posX, int posY) {
        super(  "Колдун",
                50,
                50,
                1,
                new int[]{10, 15},
                nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }
}
