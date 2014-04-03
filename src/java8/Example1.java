package java8;

/**
 * Created by raj on 4/2/14.
 */
public class Example1 {

    public static void main(String[] args) {
        System.out.println("runnable test");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is runnable 1");
            }
        };


        //note that this examples uses "target typing" - the compiler is able to determine the
        //the single
        Runnable r2 = () -> System.out.println("This is runnable 2");

        r1.run();
        r2.run();
    }
}
