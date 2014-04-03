package java8;

import com.sun.tools.doclint.resources.doclint;

/**
 * Created by rsingh on 4/3/14.
 */
public class Example2 {

    public static String name = "Example2";

    public static void main(String[] args) {
        System.out.println(name);

        Lambdatest test1 = (1, 2) <- (return x + y);
    }

    public static interface Lambdatest {
        public abstract int add(int x, int y);
    }


}
