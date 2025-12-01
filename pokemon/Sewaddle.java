package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Sewaddle extends Pokemon {

    public Sewaddle(String name, int level) {
        super(name,level);
        setType(Type.GRASS, Type.BUG);
        setStats(45, 53, 70, 40, 60, 42);
        this.setMove(new Tackle(), new EnergyBall());
    }

}