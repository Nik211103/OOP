package Project.AbstractCLasesAndInterface;

import java.util.ArrayList;

public interface Game {
    void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates);
    String getInfo();
}
