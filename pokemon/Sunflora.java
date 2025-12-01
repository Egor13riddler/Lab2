package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Sunflora extends Sunkern {

    public Sunflora(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(75, 75, 55, 105, 85, 30);
        this.addMove(new BulletSeed());
    }

}

