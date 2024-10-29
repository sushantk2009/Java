//input lene ke liye ye sab use karna hota  hai
// PAHLE SCANNER CLASS IMPORT KARNA HOTA HAI -->import java.util.Scanner;
//FIR SCANNER NAME KA VARIABLE BANAN HOTA HAI -->Scanner sc= new Scanner(System.in);
//INTEGE LANE KE LIYE -->int a =sc.nextInt();
//FLOAT LANE KE LIYE -->float c=sc.nextFloat()
import java.util.Scanner;

public class L_05_Taking_Input {
    public static void main(String[] args) {
//        System.out.println("Taking Input From The User");
         Scanner sc= new Scanner(System.in);
//        System.out.println("Enter Number 1 : ");
//        int a =sc.nextInt();
//        System.out.println("Enter number 2 ");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println("Enter The Float Number :");
//        float c=sc.nextFloat();
//        System.out.println("The Sum Of Two Number is :");
//        float fsum=sum+c;
//        System.out.println(fsum);
//        String str=sc.next(); //EX= JAINE MAINE LIKHA<--sushant is a good boy-->TO sushant bss print hoga pura print nhi hoga
        String str=sc.nextLine(); //isme pura print hoga
        System.out.println(str);
    }
}
