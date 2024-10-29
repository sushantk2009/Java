//LHUD SE KARNA HAI
import java.util.Scanner;

public class L_06_Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The marks");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e = sc.nextInt();
        float total=a+b+c+e;
        System.out.println("Total Percentage is :");
        System.out.println(total/5);
    }
}
