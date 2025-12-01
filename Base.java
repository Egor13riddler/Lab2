import ru.ifmo.se.pokemon.*;
import pokemon.*;


public class Base {
    public static void main(String[] args){
        Battle b = new Battle();
        //Pokemon p1 = new Pokemon("Alien", 1);
        //Pokemon p2 = new Pokemon("Predator", 1);
        //b.addAlly(new Sewaddle("Caterpie",1));
        //b.addAlly(new Swadloon("Toxapex", 1));
        //b.addAlly(new Pheromosa("Beauty",1));
        b.addFoe(new Sunkern("Seedling", 46));
        b.addAlly(new Leavanny("Lurantis", 22));
        b.addFoe(new Sunflora("Sunflower", 10));
        //b.addAlly(p1);
        //b.addFoe(p2);
        b.go();
    }
}