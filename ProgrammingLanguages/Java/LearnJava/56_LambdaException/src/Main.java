
interface NumberPlayground {
    int func(int[] array);
}
/// solving empty array exception
interface NumberInterface {
    /* this abstract method now ave capability of throwing an exception*/
    int func(int[] array) throws EmptyArrayException;
}
/**
 * Make an empty array exception to solve the problem
 */
class EmptyArrayException extends Exception{
    EmptyArrayException() {
        super("Array is empty");
    }
}

public class Main {

    public static void main(String[] args) {


        int[] numbers = { 123, 35, 122, 164, 546, 23 };
        /* a basic find highest number lambda*/
        NumberPlayground getHighestNum = (int[] nums)
        -> {
            int highestNum = 1;

            for (int element:
                 nums) {
                if(element > highestNum) {
                    highestNum = element;
                }
            }
          return highestNum;
        };
        System.out.println(getHighestNum.func(numbers));


    /// What if we want to have exception thrown when parameter is empty array?
        int[] nums = {  };

    try {/* We use an interface which its abstract throws EmptyArrayException we made itself */
        NumberInterface getHighestNumber = (int[] numsArray)
        -> {
            /*
             * Since the interface abstract now able to throws exception, we can now use basic if statement to catch it.
             */
            if(numsArray.length == 0) {
                /* we use `throw new` keyword to throw a new exception */
                throw new EmptyArrayException();

            } else {
                int highestNum = 1;
                for (int element:
                        numsArray) {
                    if(element > highestNum) {
                        highestNum = element;
                    }
                }
                return highestNum;
            }
        };

        System.out.println(getHighestNumber.func(nums));
    }
    catch (EmptyArrayException e) { e.printStackTrace(); }



    }
}


