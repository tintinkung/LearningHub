
public class Main {

    public static void main(String[] args) {

        /* create an expression by lambda with {} code block */
        Playground reverseString = (s)
        -> {
              String reversedString   = "";
              for (int i = s.length() -1; i >= 0; i--) { reversedString += s.charAt(i); }
              return reversedString;
        };

        System.out.println(reverseString.giveString("parker"));
    }
}

interface Playground {
    String giveString(String s);
}
