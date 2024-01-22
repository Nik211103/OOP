package Seminar.Seminar1;

public class Crossbower extends Archer{

    public Crossbower(String name, int x, int y) {
        super(name,
                75,
                75,
                25,
                25,
                new int[]{10, 15},
                x,
                y,
                3,
                30,
                30,
                7);
    }

    @Override
    public String getInfo() {
        return "Арбалетчки";
    }

    @Override
    public String toString() {
        return "Арбалетчки" + super.toString();
    }
}
