package Examples;

/**
 * @author Alex T.H.
 */
public class Factorial {

    static int NUMBER_TEST = 9;

    public static void main(String[] args) {
        System.out.println(factorial(NUMBER_TEST));
    }

    // Subrutina para hallar el factorial de un numero
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

}
