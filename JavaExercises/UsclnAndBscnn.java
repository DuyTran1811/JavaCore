import java.util.Scanner;

public class UsclnAndBscnn {
    // Find USCLN and BSCNN of 2 positive integers in Java using Euclid . algorithm
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive interger a: ");
        int a = input.nextInt();
        System.out.print("Enter a positive interger b: ");
        int b = input.nextInt();
        input.close();
        System.out.println("USCLN of " + a + " and " + b + " is: " + USCLN(a, b));
        System.out.println("BSCNN of " + a + " and " + b + " is " + BSCNN(a, b));
    }
    // Find the greatest common divisor
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    // Find the least common divisor 
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
