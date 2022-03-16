public class Main {

    /* Auto Boxing Usage Example */
    class AutoBox {
        /**
         * This method returns primitive int object.
         * but with an Integer of object as parameter.
         * if we return out integer right away, java will autobox the obj automatically to primitive type as we declared it.
         *
         * [CAUTION] JAVA JDK 9+ ONLY
         */
        static int m(Integer obj) {
            return obj;
        }
    }

    public static void main(String[] args) {

        /* Auto Boxing?
         * automative convert of object datatype to the primitive one
         * - the same as #42 but easier and better also prevents error
         */

        Integer int_1 = 100/*<-- no longer needed to type Integer.valueOf(100)*/ ;
        int int_2 = int_1 /*can type this right away*/;
        System.out.println("[1] AutoBoxing: " + int_1 + " " + int_2);

        /* both of this works because java autobox for us */
        Integer int_3 = AutoBox.m(100);
        int int_4 = AutoBox.m(100);
        System.out.println("[2] Auto Boxed: " + int_3 + " " + int_4);

/* AutoBoxing concept Around Java */
        Integer int_5, int_6;
        int i;

        int_5 = 100;
        System.out.println("[3] Original Value of int_5: " + int_5);
        /* unbox Integer object of int_5 and ++; the value then auto box back to Integer object */
        ++int_5;
        System.out.println("[3] New int_5: " + int_5);

        /* same concept as before */
        int_6 = int_1 / 3;
        /* unbox BUT wonts rebox after the expression cus `i` is already a primitive */
        i = int_5 + (int_5 / 3);

        Boolean b_obj = true;
        boolean b_priv = true;
        Character char_1 = 'x';
        char char_2 = char_1;

        /* unboxed ad use in statement */
        if(b_obj) {
            System.out.println("[4] UNboxed boolean: " + b_obj);
        }
    }
}
