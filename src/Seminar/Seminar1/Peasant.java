package Seminar.Seminar1;

public class Peasant extends Hero {
    public Peasant(String name, int x, int y) {
        super(name,
                100,
                100,
                0,
                0,
                new int[]{0, 0},
                x,
                y,
                0);
    }

    @Override
    public String getInfo() {
        return "Человек";
    }//Для удобства отображения на карте(т.к. К-крестьянин и К-копейщик)

    @Override
    public String toString() {
        return "Человек" + super.toString();
    }
}
