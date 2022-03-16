import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // reading a whole line of input

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        /* container to contain read data */
        String container = null;

        /* reading a line of input */
        try {
            System.out.print("Type something\n>>>> ");

            container = br.readLine(); // reading input by line of string

            System.out.println("[1] You typed \""  + container + "\"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* funny typing loop usage */
        try {
            do {
                System.out.print("Type something (type stop to stop the program)\n>>>> ");

                container = br.readLine();

                System.out.println("[L] You typed \""  + container + "\"\n");
            } while (
                !container.toLowerCase().equalsIgnoreCase("Stop")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
