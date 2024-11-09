import java.util.Scanner;

public class L_35_practic_Test_methods {
    //method problem --:1
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);

        }

    }
    //method problem --:2
    static void pattern1(int n){
        int b=1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //method problem --:3
    static int sumRec(int n){
        if (n==1){
            return 1;
        } return n + sumRec(n-1);


    }
    //method problem --:4
    static void pattern2(int n){
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //method problem --:5
    //Print Fibonacci series
     //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....



    public static void main(String[] args) {
        // PROBLEM 1:-
        System.out.println("Problem 1:");
        multiplication(6);
        // PROBLEM 2:-
        System.out.println("Problem 2:");
         pattern1(4);
         //PROBLEM 4:-
        System.out.println("Problem 4:");
        pattern2(6);
        //PROBLEM 3:-
        System.out.println("Problem 3:");
        int c= sumRec(3);
        System.out.println(c);
        //PROBLEM 5:-
//        int result =feb(n);
//        System.out.println(result);




        //Print Fibonacci series by using for loop
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
        //a, b
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Value for Fibonacci series: ");
        int a=0;//Assign First value a=0
        int b=1;//Assign second value b=1
        int d;//Take a veriable
        int point= sc.nextInt(); // kaha tak Print karana hai series ko
        for(int i=0;i<=point;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;


        }

    }
}
