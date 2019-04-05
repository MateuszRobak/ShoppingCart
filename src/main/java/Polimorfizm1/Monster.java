package Polimorfizm1;

abstract public class Monster {
    int damage = 50;
    public Monster(){
        System.out.println("this is main Polimorfizm1.Monster class constructor");

    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
