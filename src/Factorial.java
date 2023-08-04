public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

}
   // The given Java code defines a class named "Factorial" with two methods: "factorial" and "main." The "factorial" method takes an integer "n" as input and calculates the factorial of "n" using a for loop. It initializes the variable "result" to 1 and then multiplies it with each integer from 1 to "n." The final result is returned. The "main" method is the entry point for the program and demonstrates the usage of the "factorial" method by calculating the factorial of the number 5 and printing the result to the console. In this case, the output will be "Factorial of 5 is: 120," as 5! (factorial of 5) equals 120.
