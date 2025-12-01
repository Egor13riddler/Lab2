package move;

import ru.ifmo.se.pokemon.*;

public class CometPunch extends PhysicalMove {

    public CometPunch() {
        super(Type.NORMAL, 18, 0.85, 0, calculateHits());
    }


    

    private static int calculateHits() {
        double prob = Math.random();
        if (prob < 3.0 / 8.0) {
            return 2;
        } else if (prob < 6.0 / 8.0) {
            return 3;
        } else if (prob < 7.0 / 8.0) {
            return 4;
        } else {
            return 5;
        }
    }

    protected String describe() {
        return "used Comet Punch";
    }
}