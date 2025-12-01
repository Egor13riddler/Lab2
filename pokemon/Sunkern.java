package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Sunkern extends Pokemon{

    public Sunkern(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(30, 30, 30, 30, 30, 30);
//        this.addMove(new GigaDrain());
//        this.addMove(new RazorLeaf());
        this.setMove(new RazorLeaf(), new GigaDrain(), new Facade());
    }

}
