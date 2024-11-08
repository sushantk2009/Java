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
    //PrintFibonacci series
     //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
     //14:12


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

    }
}
