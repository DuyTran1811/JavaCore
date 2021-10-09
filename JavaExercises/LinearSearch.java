import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Import an array number: ");
        int n = input.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter the th element " + (i + 1) + ": ");
            number[i] = input.nextInt();
        }
        System.out.println("Enter the element you want  to find");
        int x = input.nextInt();
        int posistion = -1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                posistion = i;
                break;
            }
        }
        input.close();
        if (posistion != -1)
            System.out.println("Found at posistion " + (posistion + 1));
        else
            System.out.println("Not Found: " + x);
    }
}
