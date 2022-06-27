import java.util.*;
import java.util.Arrays;
import java.lang.Math;
public class Main {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the question: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter the number: ");
                int num1 = sc.nextInt();
                if (isPrime(num1)) {
                    System.out.println("This is a prime number.");
                }
                else {
                    System.out.println("This is not a prime number.");
                }
                break;
            case 2:
                String s = "";
                for (int i = 1; i <= 100; i++) {
                    if (isPrime(i)) {
                        s += i + " ";
                    }
                }
                System.out.println("All the prime numbers between 1 and 100: " + s);
                break;
            case 3:
                System.out.print("Enter a number: ");
                String s1 = sc.next();
                int n1 = s1.length();
                int n2 = Integer.parseInt(s1);
                int sum = 0;
                int n3 = 0;
                int n4 = n2;
                for (int i = 0; i < n1; i++) {
                    n3 = n4 % 10;
                    sum += Math.pow(n3, n1);
                    n4 /= 10;
                    n3 = 0;
                }
                if (sum == n2 ) {
                    System.out.println("This is an armstrong number.");
                }
                else {
                    System.out.println("This is not an armstrong number.");
                }
                break;
        }
    }
}