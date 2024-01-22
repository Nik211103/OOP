package Seminar.Seminar1;

public class Pikeman extends Walker {
    public Pikeman(String name, int x, int y) {
        super(name,
                100,
                100,
                20,
                20,
                new int[]{20, 30},
                x,
                y,
                2,
                2);
    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }

    @Override
    public String toString() {
        return "Копейщик" + super.toString();
    }
}
