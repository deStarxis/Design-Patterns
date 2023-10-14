package Strategy.ducks;

import Strategy.behavior.fly.FlyWithWings;
import Strategy.behavior.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
