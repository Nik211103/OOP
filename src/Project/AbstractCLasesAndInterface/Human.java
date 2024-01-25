package Project.AbstractCLasesAndInterface;


public class Human extends Hero{

    protected boolean isBusy;

    public Human(String name, int maxHealth, int health, int maxArmor, int armor, int[] damage, int x, int y, int initiative, boolean isBusy) {
        super(name, maxHealth, health, maxArmor, armor, damage, x, y, initiative);
        this.isBusy = isBusy;
    }

    public void giveArrows (Archer hero) {
        hero.receiveArrows(3);
    }

    public boolean isBusy() {return isBusy;}
    public void setStatus(boolean status) {isBusy = status;}



    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ", Занят: " + (isBusy? "да" : "нет");
    }
}
