package move;

import ru.ifmo.se.pokemon.*;

public class GrassWhistle extends StatusMove {

    public GrassWhistle() {
        super(Type.GRASS, 0.0, 0.55);
    }

    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }

    protected String describe() {
        return "used Grass Whistle";
    }
}