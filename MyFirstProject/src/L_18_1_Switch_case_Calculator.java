import java.util.Scanner;
public class L_18_1_Switch_case_Calculator {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number :");
        a= sc.nextInt();
        System.out.println("What You Want '+'-''*''/'");
        char cal;
        cal = sc.next().charAt(0);
        System.out.println("Enter Second Number :");
        b= sc.nextInt();

        switch (cal){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operator");

        }

    }
}
