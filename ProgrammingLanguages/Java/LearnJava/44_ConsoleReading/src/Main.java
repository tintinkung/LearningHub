import java.io.BufferedReader; /* reader imports */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
         //
        // What we've learnt is \sout to output info to console
        // We'll learn how to read the console input in this lesson
        //
        // How?
        // Old way: Byte stream
        // Modern way: Character Stream using input stream
        // Using class Called "BufferedReader"
       //

        InputStreamReader ir = new InputStreamReader(System.in/*byte character console in*/);
        BufferedReader br = new BufferedReader(ir/*converted reader object*/);

    /* using reader */
        try {
            System.out.print("Type something here (Type 'x' to stop the program)\n>>>> ");
            int input = br.read();
            /* read() Will only read one character from the input console forwards */
            System.out.println("[1] This is the read character: " + input /* output reader is stored as ASCII character */);
        } catch (IOException e) {
            e.printStackTrace();
        }

    /* converts reader's byte value to char */
        try {
            char input = (char) br.read(); // basically cast it to character
            /* output reader is stored as ASCII character BUT auto casted to char */
            System.out.println("[2] This is the read character: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    /* reading multiple character at a time with loop */
        try {
            char input;
            do { /* read every character until it reaches 'x' character */
                input = (char) br.read();
                System.out.println("[3]: " + input);
            } while (input != 'x');

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
