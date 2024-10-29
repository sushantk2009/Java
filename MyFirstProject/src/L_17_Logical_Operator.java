public class L_17_Logical_Operator {
//    LOGICAL OPERATORS
//    && -->And
//    ||--> Or
//    !--->not
public static void main(String[] args) {
    boolean a= true;
    boolean  b=false;
    if(a && b){
        System.out.println("T");
    }
    else {
        System.out.println("F");
    }
    if(a || b){
        System.out.println("T");
    }
    else {
        System.out.println("F");
    }

// ! True ko False aur False ko True kar deta hai
    System.out.print("a is :");
    System.out.println(!a);
    System.out.print("b is :");
    System.out.println(!b);
}


}
