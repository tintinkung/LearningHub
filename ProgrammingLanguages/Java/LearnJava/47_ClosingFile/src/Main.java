import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // currently, we must call file.close() method everytime the file finish
        // But how to automatically close file stream?
        int input;
        String fileName = "readme.txt";
        /* Declaring File input to try parameter
         * - makes the try state done running, automatically close the stream
         * - called "try with resource"
         */
    try(FileInputStream fin = new FileInputStream(fileName))  {
        // basic program to read a file
        System.out.print(">>>>>> " + fileName + " <<<<<<\n»\n»\t");
        do {
            input = fin.read();
            System.out.print(
                (input != -1) ?
                    ((char) input == '\n') ?
                        "\n»\t" :
                        (char) input
                : "\n»\n<<<<<< " + fileName + " >>>>>>"
            );
        }
        while (input != -1);

        // no longer needed to fin.close anymore
    }
    catch (IOException e) { e.printStackTrace(); }

    }
}
