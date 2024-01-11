package Seminar.Seminar1;

public abstract class Archer extends Hero{
    protected int maxArrows;
    protected int currentArrows;

    public Archer(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY){
        super(classHero,healthMax, currentHealth, armor,damage,nameHero,posX,posY);
    }

    public void attack(Hero hero){
        int damage = Hero.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];

        if(this.currentArrows > 0){
            hero.getDamage(damage);
        }
        else {
            hero.getDamage(0);
        }
    }

    public void replenishmentArrows(int arrows){
        if(this.currentArrows + arrows > this.maxArrows){
            this.currentArrows = this.maxArrows;
        }
        else{
            this.currentArrows = this.currentArrows + arrows;
        }
    }

    @Override
    public String toString() {
        return ("Класс: " + classHero + " Имя: " + nameHero + " " + "Здоровье: " + currentHealth + "/" + healthMax + " Броня: " + armor);
    }
}
