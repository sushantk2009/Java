
import java.util.Scanner;
public class factorial {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Factoraial Value:");
        int n=sc.nextInt();
        int x=1;
        for(int i=n;i>=1;i--){
          x=x*i;
            System.out.print(i+"*");
        }
        System.out.println("="+x);
    }
}
