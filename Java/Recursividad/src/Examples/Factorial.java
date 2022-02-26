package Examples;

/**
 *
 * @author Pragmatic Coder
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(Factorial(9));
    }
    
    
// Subrutina para hallar el factorial de un numero
    public static int Factorial(int Number) {
        if (Number == 0 || Number == 1) {
            return 1;
        }
        return Number * Factorial(Number - 1);
    }
    
}
