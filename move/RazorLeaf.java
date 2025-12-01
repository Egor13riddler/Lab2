package move;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {

    public RazorLeaf() {
        super(Type.GRASS, 55, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        if (att.getLevel() < 12) {
            //System.out.println("MISSED");
            return false;
        } else {
            //System.out.println("GotEm");
            return true;
        }
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 1.0/8.0) {
            System.out.println("Crictical hit!");
            return 2;
        }
        else return 1;
    }

    public String describe() {
        return "used Razor Leaf";
    }

}