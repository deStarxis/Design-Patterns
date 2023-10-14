package Strategy;

import Strategy.behavior.fly.FlyRocketPowered;
import Strategy.ducks.Duck;
import Strategy.ducks.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
