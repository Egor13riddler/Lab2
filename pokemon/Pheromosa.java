package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Pheromosa extends Pokemon{

    public Pheromosa(String name, int level){
        super(name, level);
        setType(Type.BUG,Type.FIGHTING);
        setStats(71,137,37,137,37,151);
        this.addMove(new Roost());
        this.addMove(new Swagger());
        this.addMove(new Facade());
        this.addMove(new CometPunch());
    }

}