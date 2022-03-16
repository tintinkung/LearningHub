public class Main {

    public static void main(String[] args) {


        /* Variable capture with lambda expression
         * - Happens when we use a variable inside lambda block, it cannot be change anymore.
         * - The variable will be captured by the lambda block.
         * - Shorthandly, "Effectively final"
         */


        int thing = 23;



        Playground bob = (int a)
        -> {
            int result;
            result = thing;
            //thing = 24; <- !!Error: thing is effectively final, lambda captured it
            return result;
        };

        // thing = 213; <- !!Error: thing SHOULD be final, lambda already captured it
    }
}

interface Playground {
    int func(int a);
}