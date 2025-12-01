package move;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{

    public Swagger(){
        super(Type.NORMAL, 0.0, 0.85);
    }

    protected void applyOppEffects(Pokemon p){
        //System.out.println(p.getStat(Stat.ATTACK) + " " + Stat.valueOf("ATTACK"));
        p.setMod(Stat.ATTACK, +2);
        Effect.confuse(p);
    }

    protected String describe() {
        return "used Swagger";
    }
}