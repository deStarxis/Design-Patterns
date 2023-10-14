package Strategy.ducks;

import Strategy.behavior.fly.FlyWithWings;
import Strategy.behavior.quack.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Red Head Duck");
    }
}
