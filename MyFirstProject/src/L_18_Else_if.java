
import java.util.Scanner;
public class L_18_Else_if{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter The Age :");
Scanner sc=new Scanner(System.in);

  age= sc.nextInt();
//if (age>50){
//    System.out.println("Experience person");
//}
//else if(age>30){
//    System.out.println("semi-Experience person");
//}
//else if(age>22){
//    System.out.println("Beginner");
//}
//else{
//    System.out.println("Your are not able to jab");
//}


//        SWITCH CASE----------->
switch (age){
    case 18:
        System.out.println("You are going To adult");
        break;
    case 21:
        System.out.println("You Rew going to job");
        break;
    case 50:
        System.out.println("You are going to Retired");
        break;
    default:
        System.out.println("Enjoy your Life");
}

    }
}
