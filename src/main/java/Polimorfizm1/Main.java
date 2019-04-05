package Polimorfizm1;

public class Main {

    public static void main(String[] args) {
        Monster monster = new Skeleton();
        System.out.println(monster.getDamage());
        monster.setDamage(20);
        System.out.println(monster.getDamage());
    }
}
