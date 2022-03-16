public class Main {

    public static void main(String[] args) {

    /* Type Wrapper
     * - a way to intricate regular primitive datatype to object
     * - ex. convert int integer to an integer object
     * - ex. sometime you need to pass object as parameter, but you can't use normal primitive datatype
     */

    /* Character object */
            // regular way
            Character char_1 = 'a';
            // old-fashioned way and deprecated
            Character char_2 = new Character('c'); // same thing as regular object but it's an object
            //modern method (Java9+)
            Character char_3 = Character.valueOf('c'); // not deprecated and fully valid
        System.out.println("[1] This is Character as object: " + char_3);

    /* Boolean object */
            Boolean boolean_1 = Boolean.valueOf(true);
            Boolean boolean_2 = Boolean.valueOf("true");
        System.out.println("[2] This is Boolean as object: " + boolean_1 + " " + boolean_2);

    /* Integer object */
        try /*in-case*/ {
            Integer integer_1 = Integer.valueOf("1242");
            System.out.println("[3] This is Integer as object: " + integer_1);
        } catch (NumberFormatException e ) {
            e.printStackTrace();
        }

    /* Converts object of datatype back to primitive datatype */
        Integer intObj = Integer.valueOf(100);
        int normalInt = intObj.intValue();
        System.out.println("[4] This is Integer as objectValue: " + normalInt);




    }
}
