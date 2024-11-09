
//     Samajh nhi aaya ye lacture
public class L_34_Recursion {
    static int factorial_ittrative(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product =1;
            for (int i=1;i<=n;i++){  //loop 1 to n chalega
                product=product*i;
            }
            return product;
        }
    }
//Find factorial by Recursion Approch:--------------
    //factorial(0)= 1
    //factorial(n)=n*n+1*n-2*.....1
    //factorial(5)=5*4*3*2*1
    //factorial(n)=n*factorial(n-1)
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
        return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("The Value of Factorial is: "+factorial(x));

        //Find factorial by Ittrative Approch:--------------//mathod file upar hai static int factorial_ittrative(int n)
        System.out.println("the value of factorial 4 by ittrative method is: "+factorial_ittrative(x));
    }
}
