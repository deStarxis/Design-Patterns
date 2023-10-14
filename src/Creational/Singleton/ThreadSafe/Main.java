package Creational.Singleton.ThreadSafe;

public class Main {
    public static void main(String[] args) {
        //        ThreadSafe implementation of Singleton
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Threadsafe-One");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Threadsafe-Two");
            System.out.println(singleton.value);
        }
    }

}
