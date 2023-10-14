package Strategy.ducks;

import Strategy.behavior.fly.FlyWithWings;
import Strategy.behavior.quack.MuteQuack;
import Strategy.behavior.quack.Quack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
