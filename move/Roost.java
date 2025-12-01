package move;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove{

    public Roost(){
        super(Type.FLYING, 0.0, 0.0);
    }

    protected void applySelfEffects(Pokemon p){
        double hp = p.getHP();
        double hpTrue = p.getStat(Stat.HP);
        if(hp<=hpTrue/2) p.setMod(Stat.HP,(int)-hpTrue/2);
        else p.setMod(Stat.HP, (int) -(hpTrue-hp));
        System.out.println(p.getHP() + " " + p.getStat(Stat.HP));
    }

    public String describe(){
        return "used Roost";
    }
}