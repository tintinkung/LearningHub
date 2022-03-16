interface Numbers {
    int result(int num);
}

public class Main {

    /**
     * interface that returns result of Numbers.result()
     * @param Interface the Numbers interface
     * @return result of Interface.result();
     */
    static int returnResult(Numbers Interface, int inputNum) {
        return Interface.result(inputNum);
    }

    public static void main(String[] args) {

        /* Run an input through a 5 multiplier modifier.
         * - result is run through a static function of lambda interface as parameter.
         */
        int num_1 = returnResult((num) //<- This first parameter is a Numbers Interface, but we input as Lambda body
        -> {
            int modifier = 5; //<- Now we can modify the result in function itself.
            return num * modifier;
        }
        , 5);//<- This is second parameter of returnResult() function

        /* short lambda example */
        int num_2 = returnResult((num) -> num + 16, 24);

        System.out.println("[1] 5 modify with 5 multiplier: " + num_1);
        System.out.println("[2] param of 24 add by 16: " + num_2);

        /*
         * Plugging a variable of reference Numbers interface works too
         */
        Numbers squareRoot = (int num) -> (int) Math.sqrt(num);
        int num_3 = returnResult(squareRoot, 45);

        System.out.println("[3] squareRoot of 45 is " + num_3);



    }
}

