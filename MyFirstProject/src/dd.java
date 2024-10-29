import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = sc.nextInt();
        int mult = 1;

        // Loop to calculate the factorial
        for (int i = f; i >= 1; i--) {
            mult = mult * i;
        }

        System.out.println("Factorial of " + f + " is " + mult);
    }
}

