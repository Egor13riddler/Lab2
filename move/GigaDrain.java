package move;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {

    private double healAmount;

    public GigaDrain() {
        super(Type.GRASS, 75, 1.0);
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        healAmount = damage / 2;
    }

    protected void applySelfEffects(Pokemon p) {
        double hp = p.getHP();
        double hpTrue = p.getStat(Stat.HP);
        double heal = Math.min(healAmount, hpTrue - hp);

        p.setMod(Stat.HP, (int)(-heal));
    }

    public String describe() {
        return "used Giga Drain";
    }

}