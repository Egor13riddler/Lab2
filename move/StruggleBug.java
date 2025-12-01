package move;

import ru.ifmo.se.pokemon.*;

public class StruggleBug extends SpecialMove {

    public StruggleBug() {
        super(Type.BUG, 50, 1.0);
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    protected String describe() {
        return "used Struggle BugAAA";
    }
}