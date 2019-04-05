package Polimorfizm1;

public class Skeleton extends Monster {

    public Skeleton(){
        System.out.println("This is main Polimorfizm1.Skeleton Class constrcutor");
    }

    @Override
    public int getDamage(){
        return super.getDamage() + 10;
    }
}
