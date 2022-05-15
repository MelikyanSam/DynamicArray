package com.company.bar.CWork11;
interface AnimalEat {
    void eat();
//    void travel();
}
interface AnimalTravel {
    void travel();
//    void eat();

}
abstract class Eim{
    abstract void methot();
}

class Animal extends Eim implements AnimalEat, AnimalTravel {
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
    @Override
    public void travel() {
        System.out.println("Animal is travelling");
    }
    @Override
    void methot(){
        System.out.println("-----");
    }

}
public class Demo {
    public static void main(String args[]) {
        Animal a = new Animal();
        AnimalEat b = new Animal();
        a.eat();
        a.travel();
        b.eat();
//        b.travel();
AnimalTravel c = new Animal();
        c.travel();
//        c.eat();
    }
}