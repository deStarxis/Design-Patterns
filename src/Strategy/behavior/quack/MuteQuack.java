package Strategy.behavior.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am a mute duck");
    }
}
