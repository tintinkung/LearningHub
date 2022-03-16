/**
 * [WARNING]:
 * project language level & java SDK MUST BE atleast 8
 */
public class Main {

    public static void main(String[] args) {

        // Lambda
        // basically arrow function of java

        // whenever we want to use lambda, we need to have the funtional interface (like abstract method)

        FunctionInterface interface_1;
        FunctionInterface interface_2;

    /* overriding the interface of giveNumber() method */
        // Syntax:
        // data     = param   ->  return
        //  \/         \/           \/
        interface_1 =  ()     ->   123;

        /* returning can be in block scope */
        interface_2 = () -> {
          return  213;
        };

        System.out.println(interface_1.giveNumber()/*will return 123*/);
        System.out.println(interface_2.giveNumber()/*will return 213*/);


        Matherizing adding;
        Matherizing substracting;
        // parameter in function must match the overriding interface
        adding = (double a, double b) -> a + b;
        substracting = (/*will auto snap to double, double as the parent interface*/a, b) -> a - b;

        System.out.println(adding.giveResult(14, 16));
        System.out.println(substracting.giveResult(13.5, 6.3));

    }
}

interface FunctionInterface {
    int giveNumber();
}

interface Matherizing {
    double giveResult(double a, double b);
}