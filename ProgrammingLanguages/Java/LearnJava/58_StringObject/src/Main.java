public class Main {

    public static void main(String[] args) {

        String string_1 = "uwu"; //<-- what we know
        String string_2 = new String("uwu"); //<-- the actual thing its doing nehind the scene

        // String by character array
        // this is actually like using char pointer to create string in c / c++
        char[] letters = {'u', 'w', 'u'};
        String charsArray_1 = new String(letters);
        String charsArray_2 = new String(letters, 1, 2); // defining with offset (will return "wu")

        byte[] bytes = { 117, 119, 117 };
        String byteArray = new String(bytes);

        System.out.println("uwu: [1]"
        + string_1 + "\n[2] "
        + string_2 + "\n[3] "
        + charsArray_1 + "\n[4] "
        + charsArray_2 + "\n[5] "
        + byteArray);

    // String Concatenating

        String bob = "Bob";
        String age = "10";
        String WhoIsBob = bob + " is a man of age " + age;// ofc its easy huh

        System.out.println(WhoIsBob);
    }
}
