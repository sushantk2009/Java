import java.sql.SQLOutput;
import java.util.Scanner;
public class L_24_Practic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //PROBLEM 1 ---:
        //This program to print this  * * * * *
        //                             * * * *
        //                              * * *
        //                               * *
        //                                *
//        int n;
//        n= sc.nextInt();
//        System.out.println("How many number print:");
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //PROBLEM 2 --:
        //To sum first n even numbers using while loop
//        int sum=0;
//        int num;
//        num=sc.nextInt();
//        for(int i=0;i<num;i++){
//            System.out.println(2*i+1);
//            sum= sum + (2*i+1);
//        }
//        System.out.println("The Sum is :-");
//        System.out.println(sum);

        //PROBLEM 3--:
        //Multiplication number
//        System.out.println("kiska multiplication table chahiye:-");
//        int m;
//        m= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(i*m);
//        }
        //PROBLEM 4--:
        //Reverse Multiplication Number
//        System.out.println("Enter the multiplication number--:");
//        int n;
//        n= sc.nextInt();
//        for (int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d%n", n, i, n * i);
//        }
        //PROBLEM 5--:
        //Factorial using for loop
//        int f;
//        f=sc.nextInt();
//        int mult=1;
//        for(int i=f;i>=1;i--){
//            mult=mult*i;
//        }
//        System.out.println(mult);

        //PROBLEM 5.1--:
        //Factorial using While loop
//        int n;
//        n=sc.nextInt();
//        int i=1;
//        int factorial=1;
//        while(i<=n){
//            factorial = factorial*i;
//            i++;
//        }
//        System.out.println(factorial);

        //PROBLEM 6--:
        //print 1  n numbers of times
//      int n;
//      n = sc.nextInt();
//      for(int i=0;i<=n;i++){
//          System.out.println(1);
//      }


        //PROBLEM 9--:
        //
        int n;
        n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=n*i;
        }
        System.out.println(sum);
    }
}
