package Strategy.ducks;

import Strategy.behavior.fly.FlyNoWay;
import Strategy.behavior.fly.FlyWithWings;
import Strategy.behavior.quack.Quack;
import Strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("Rubber");
    }
}
