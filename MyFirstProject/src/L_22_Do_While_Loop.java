import java.util.Scanner;
public class L_22_Do_While_Loop {
    public static void main(String[] args) {

        // This is Do While Program
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Starting Number:");
        int i= sc.nextInt();
        System.out.println("Enter Second Number :");
        int num= sc.nextInt();
        do{
            if (i%2 ==0)
            System.out.println(i);
            i++;
        }while(i<=num);
    }
}
