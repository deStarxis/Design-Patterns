package Creational.Singleton.SingleThreaded;

public class Main {

    public static void main(String[] args) {
        //    Single Threaded
        Singleton singleton = Singleton.getInstance("ONE");
        Singleton singleton2 = Singleton.getInstance("TWO");
        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}
