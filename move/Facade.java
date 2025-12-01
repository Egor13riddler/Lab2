package move;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 1.0);
    }


    protected String describe() {
        return "used Facade";
    }
}