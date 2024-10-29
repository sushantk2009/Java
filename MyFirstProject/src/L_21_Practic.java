import java.util.Scanner;
public class L_21_Practic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Starting Point :");
        int i= sc.nextInt();
        System.out.println("Enter Ending point: ");
        int num= sc.nextInt();

        while (i<=num){
            System.out.println(i);
            i++;
        }

    }
}
