import java.sql.SQLOutput;
import java.util.Scanner;
public class L_22_For_Loop_in_java {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Starting Number :");
//        int a= sc.nextInt();
//        System.out.println("Enter Second Number :");
//        int b=sc.nextInt();
//        for(int i=a;i<=b;i++){
//            if(a%2 ==0)
//                System.out.println(a);
//        }


//        for(int i=0;i<1000;i++){
//            System.out.println(2*i+1);
//        }
// how to print odd number between 500 to 100 in decreasing order
       int c;
       c= sc.nextInt();
       for(int i=500;i>=c;i-=2){
           System.out.println(i);
       }


    }
}
