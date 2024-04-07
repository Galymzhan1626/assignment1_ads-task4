import java.util.Scanner;

public class Main {
    /**
     * This method calculates the factorial of a given number 'n'.
     * It uses recursion to perform the calculation, multiplying 'n' by the factorial of 'n-1'.
     * The base case is when 'n' is 0, where it returns 1.
     *
     * @param n The non-negative integer for which the factorial is to be calculated.
     * @return The factorial of 'n'.
     */
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));

    }
}
