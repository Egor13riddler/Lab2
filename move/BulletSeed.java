package move;

import ru.ifmo.se.pokemon.*;

public class BulletSeed extends PhysicalMove {

    public BulletSeed() {
        super(Type.GRASS, 25, 1.0, 0, calculateHits());
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
        return "used Bullet Seed";
    }
}