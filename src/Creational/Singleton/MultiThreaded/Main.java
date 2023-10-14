package Creational.Singleton.MultiThreaded;

public class Main {

    public static void main(String[] args) {
        //        Multi Threaded
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Multi-One");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Multi-Two");
            System.out.println(singleton.value);
        }
    }
}
