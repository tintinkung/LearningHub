import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "readme.txt";
    try {
            FileInputStream fin_1 = new FileInputStream(fileName);
            FileInputStream fin_2 = new FileInputStream(fileName);

        /* basic reading */
            int fileInput = fin_1.read(); // works the same as System.in.read(), output as byte
            // remember that read() only read out the first letter once as a byte ASCII character
            System.out.println("[1] first character in `" + fileName + "` is " + fileInput);

        /* reading the whole file */
            System.out.println(">>>>>>>> " + fileName + " <<<<<<<<");
            do {
                fileInput = fin_2.read();

                /* keep printing the file until the read is '-1'*/
                if(fileInput != -1) System.out.print((char) fileInput);
                else System.out.print("\n<<<<<<<< " + fileName + " >>>>>>>>");
            }
            while (fileInput != -1); //<-- -1 returns when there's nothing to read in the file anymore



        /* [WARNING]
         * After reading any file with input stream, close the stream
         * This is to prevent computer leaking ram to reading file when you finish using it
         */ fin_1.close();
            fin_2.close(); // :D
    }
    catch (IOException e) { e.printStackTrace(); }

    }
}
