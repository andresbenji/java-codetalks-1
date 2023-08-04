public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
//This code defines a class named "PrimeNumber" with a static method called "isPrime." This method takes an integer "number" as input and checks whether it is a prime number. It first handles the special cases where "number" is less than or equal to 1, returning false in those cases since prime numbers are greater than 1. Then, it uses a for loop to iterate from 2 up to "number" - 1, checking if "number" is divisible by any value in this range. If a divisor is found (i.e., "number" is not prime), the method immediately returns false. If the loop completes without finding any divisors, it means "number" is prime, and the method returns true.

