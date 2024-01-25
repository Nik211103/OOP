package Project.AbstractCLasesAndInterface;

import Project.AbstractCLasesAndInterface.Hero;

import java.util.ArrayList;

public interface Game {
    void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates);
}
