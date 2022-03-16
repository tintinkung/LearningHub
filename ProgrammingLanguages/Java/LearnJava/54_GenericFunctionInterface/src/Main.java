interface Playground<A> { A result(A a); }

public class Main {

    public static void main(String[] args) {

        Playground<String> reverse = (s)
        -> {
            String reversedString = "";

            for(int i = s.length() -1; i >= 0; i--) {
                reversedString += s.charAt(i);
            }
            return reversedString;
        };

        System.out.println("[1] Reverse string of \"pickle\" is "+ reverse.result("pickle"));

        Playground<Integer> findFactorial = (num)
        -> {
              int result = 1;
              for(int i = 1; i<= num; i++) { result = i * result; }
              return result;
        };

        System.out.println("[2] Factorial of 4 is " + findFactorial.result(4));
    }
}