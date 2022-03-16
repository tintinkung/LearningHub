public class Main {

    public static void main(String[] args) {


        Integer[] numbers_1 = { 1, 34, 65, 2, 12, 5, 11 };
        Double[] numbers_2 = { 31.2, 16.2, 15.63, 10.64, 21.36 };


        System.out.println(NonGenericClass.findHighestNum(numbers_1));
        System.out.println(NonGenericClass.findHighestNum(numbers_2));

        int number = 69;
        NonGenericClass test = new NonGenericClass(number);
        System.out.println(test.getValue());
    }
}

class NonGenericClass {
    /* Making Generic method */
    double value;
    <A extends Number> NonGenericClass(A number) {
        value = number.doubleValue();
    }

    public double getValue() {
        return value;
    }


    static<ArrayParam extends Number> double findHighestNum(ArrayParam[] array) {

        double highestNumber = 0.0;

        for (ArrayParam element: array) {
            if(element.doubleValue() > highestNumber) {
                highestNumber = element.doubleValue();
            }
        }

        return highestNumber;
    }


}