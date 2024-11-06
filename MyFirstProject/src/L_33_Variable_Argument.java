public class L_33_Variable_Argument {

//    static int sum(int a,int b){                             ---↓
//        return a+b;                                          ---↓
//    }                                                        ---↓
//    static int sum(int a,int b, int c){                      ---↓
//        return a+b+c;                                        ---↓
//    }                                                        ---↓
//    static int sum(int a,int b,int c,int d){                 ---↓
//        return a+b+c+d;                                      ---↓
//    }                                                        ---↓
//   //itne sare method banane ki jarurat nhi hai// ye niche wala bss bana shakte hai ↓
                    //jitne bhi argument mile usko array ke form me de do----> (int ...arr)
static int sum(int ...arr){
    //Available as int [] arr;
     int value=0;
     for(int element :arr){
         value+=element;

     }
    return value;
}
    public static void main(String[] args) {
        System.out.println("Welcome to Variable Argument class");
        System.out.println("Agar kuch nhi dalenge to value "+sum()+" aayegi");
        System.out.println("The Sum of 3 + 4 is: "+sum(3,4));
        System.out.println("The Sum of 3+6+8 is: "+sum(3,6,8));
        System.out.println("The Sum of 2+3+4+5 is: "+sum(2,3,4,5));
    }
}
