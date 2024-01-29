package Project.Hero;

import Project.AbstractCLasesAndInterface.Human;

public class Peasant extends Human{
    public Peasant(String name, int x, int y) {
        super(name,
                100,
                100,
                0,
                0,
                new int[]{0, 0},
                x,
                y,
                0,
                false);
    }



    @Override
    public String getInfo() {
        return "Человек";
    }//Для удобства отображения на карте(т.к. К-крестьянин и К-копейщик)

    @Override
    public String toString() {
        return "Человек" + super.toString() + ", Занят: " + (isBusy? "да" : "нет");
    }
}
