public class Main {

    public static void main(String[] args) {

        /* Bounded Type
         * - a way to limit which class to use parameter type
         */
        Integer[] nums = {1, 3, 4, 5, 3};
        Double[] doubles = { 1.3, 4.2, 1.6, 9.4, 9.2};


        Numbers<Double> my_data_1 = new Numbers<Double>(doubles);
        Numbers<Integer> my_data_2 = new Numbers<Integer>(nums);

        // find average?

        System.out.println(my_data_1.getAverage());
        System.out.println(my_data_2.getAverage());

    }
}

/**
 * A Numbers class limited to Number super class
 * @param <A> array of types.
 *           The array extends by Number class to limit only numbers.
 */
class Numbers<A extends Number> {
    A[] numberArray;

    public Numbers(A[] numberArray) {
        this.numberArray = numberArray;
    }

    double getAverage() {
        double sum = 0.0;
        for (A element: numberArray) {
            sum = sum + element.doubleValue(); // <- this wouldn't work without extending Number class
        }

        return sum / numberArray.length;
    }
}