package move;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {

    public EnergyBall() {
        super(Type.GRASS, 90, 1.0);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    protected String describe() {
        return "used Energy Ball";
    }
}