import java.io.*;

public class Main {

    public static void main(String[] args) {
    /* Basic usage */
    try {
        FileOutputStream fout = new FileOutputStream("readme.txt");

        /* Write a file
         * as ASCII character
         * IF file doesnt exist, it'll create one itself
         */
        fout.write('X');
        /* [Note]
         * every time write() is called, it'll overwrite to the latest edit
         */
        fout.write('A');
        /* Don't forget to close file too! */
        fout.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    /* Write a file by input */
    try {
        String fileName = "readme.txt";
        FileOutputStream fout = new FileOutputStream(fileName);


        System.out.println("Hi, would you like to write some stuff in " + fileName);
        System.out.print("(y/n) >>>> ");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        char isYes = (char) br.read();
        int input;
        if (isYes == 'y') {
            System.out.println("Write anything you want here\n(type 'x' to exit)");
            System.out.print(">>>> ");
            do {
                input = br.read();
                if (input != 'x') fout.write(input);
            }
            while (input != 'x');
            System.out.println(">>>>> Done! <<<<<");
        }

        System.out.println("File closed");
        fout.close();
    }
    catch (IOException e) { e.printStackTrace(); }
    }
}
