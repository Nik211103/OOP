package Seminar.Seminar1;


public class Crossbower extends Archer {

    public Crossbower(String nameHero, int posX, int posY) {
        super("Арбалетчик",
                75,
                75,
                2,
                new int[]{10, 15},
                nameHero, posX, posY,
                3);
        rangeMaxDamage = 4;
        this.position = new Vector2(posX, posY);
        this.maxArrows = this.currentArrows = 12;
    }



    protected int rangeMaxDamage;
     Vector2 position;

//    public String getName(){
//        return nameHero;
//    }

    @Override
    public String toString() {
        return super.toString();
    }

}
