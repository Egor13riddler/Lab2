package move;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove  {

    public Tackle() {
        super(Type.NORMAL, 40, 1.0);

    }

    protected String describe() {
        return "used Tackle";
    }
//    public static void main(String[] args){
//        //A a = new A();
//        B b = new B();
//
//    }
}
//class A {
//    static int a = 1;
//    void pr(){
//        System.out.println("WWW");
//    }
//}
//class B extends A{
//    static int a = 2;
//    static {
//        pr();
//        System.out.println(a);
//    }
//}