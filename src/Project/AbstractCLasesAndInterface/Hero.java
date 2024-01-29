package Project.AbstractCLasesAndInterface;

import Project.SystemFile.Vector2;

import java.util.ArrayList;

public abstract class Hero implements Game {

    protected String name;
    protected float maxHealth, health, maxArmor, armor;
    protected int[] damage;
    public Vector2 position;

    protected int initiative;

    public Hero(String name, int maxHealth, int health, int maxArmor, int armor, int[] damage, int x, int y, int initiative) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.maxArmor = maxArmor;
        this.armor = armor;
        this.damage = damage;
        this.position = new Vector2(x, y);
        this.initiative = initiative;
    }


//    public float getMaxHealth() {return maxHealth;}
//
//    public float getMaxArmor() {return maxArmor;}
//
//    public float getArmor() {return armor;}

    public String getName() {return name;}

    public float getHealth() {return health;}

    public int[] getPosition() {
        return new int[]{position.getX(), position.getY()};
    }

    public int getInitiative() {return initiative;}

    public abstract String getInfo();

    public boolean isDead() {
        return health == 0;
    }

//    protected void printDistance(ArrayList<Hero> enemies) {
//        enemies.forEach(n->System.out.print(position.getDistance(n) + ", "));
//    }

    protected Vector2 nextPosition(Hero hero) {
        int step = 1;
        Vector2 deltas = position.getDeltas(hero);
        Vector2 nextPosition = new Vector2(position.getX(), position.getY());

        int deltaX = deltas.getX();
        int deltaY = deltas.getY();

        if (deltaX < 0) {
            nextPosition.setX(nextPosition.getX() + step);
        } else if (deltaX > 0) {
            nextPosition.setX(nextPosition.getX() - step);
        } else if (deltaY < 0) {
            nextPosition.setY(nextPosition.getY() + step);
        } else if (deltaY > 0) {
            nextPosition.setY(nextPosition.getY() - step);
        }

        return nextPosition;
    }

    protected void moveToward(Hero hero, ArrayList<Hero> teammates) {
        Vector2 nextPosition = nextPosition(hero);
        boolean isStepFree = true;

        for (Hero teammate : teammates) {
            if (nextPosition.equals(teammate.position) && teammate.health > 0) {
                isStepFree = false;
                break;
            }
        }

        if (isStepFree) position = nextPosition;
    }

    protected Hero nearest(ArrayList<Hero> heroes, String status, String type) {
        Hero currentHero, nearestHero = null;
        int teamSize = heroes.size();
        int i;
        boolean isAlive;
        boolean isWounded;

        for (i = 0; i < teamSize; i++) {
            currentHero = heroes.get(i);

            isAlive = currentHero.health > 0;
            isWounded = currentHero.health < currentHero.maxHealth * 0.4;

            if ( (status.equals("Живой") && isAlive) || (status.equals("Мертвый") && !isAlive) || (status.equals("Раненый") && isWounded) ) {
                if (type.equals("все") || type.equals(currentHero.getInfo())) {
                    nearestHero = currentHero;
                    break;
                }
            }
        }

        if (nearestHero != null) {
            for (int j = i + 1; j < teamSize; j++) {
                currentHero = heroes.get(j);

                isAlive = currentHero.health > 0;
                isWounded = currentHero.health < currentHero.maxHealth * 0.4;

                if ( (status.equals("Живой") && isAlive) || (status.equals("Мертвый") && !isAlive) || (status.equals("Раненый") && isWounded) ) {
                    if (type.equals("все") || type.equals(currentHero.getInfo())) {
                        if (position.getDistance(currentHero) < position.getDistance(nearestHero)) {
                            nearestHero = currentHero;
                        }
                    }
                }
            }
        }

        return nearestHero;
    }


    protected void receiveDamage(float damage) {
        if (damage < armor) {
            armor -= damage;
        } else {
            health -= (damage - armor);
            armor = 0;
        }

        if (health < 0) health = 0;
    }

    protected void receiveHealing(float healPoint) {
        health += healPoint;
    }

    public void attack(Hero enemy) {}

    public void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates) {}

    @Override
    public String toString() {
        return "-" + name + " => Здоровье: " + health + "/" + maxHealth + ", Броня: " + armor + "/" + maxArmor + ", Позиция: (" + position.getX() + ", " + position.getY() + ")";
    }
}
