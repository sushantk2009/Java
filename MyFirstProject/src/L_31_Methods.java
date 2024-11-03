//public class L_31_Methods {
//    static int logic(int x, int y) {//Ststic method
//        int z;
//        if (x > y) {
//            z = x + y;
//        } else {
//            z = (x + y) * 5;
//        }
//        return z;  // Added return statement
//    }
//    public static void main(String[] args) {
//        //ek static method banayenge
//        int a=5;
//        int b=7;
//        int c;
//        c=logic(a,b);//ye call kr rha hai static method ko.... jo ji pahle se define hai
//        System.out.println(c);
//        int a1=51;
//        int b1=3;
//        int c1;
//        c1=logic(a1,b1);//ye call kr rha hai static method ko.... jo ji pahle se define hai
//        System.out.println(c1);
//
//
//    }
//}




//              //ANOTHER METHOD TO CALL METHOD  :-----------------------
public class L_31_Methods {
     int logic(int x, int y) {//Ststic ko hata diye hai
         //Static bana diye to Object nhi banana padta...Agar Static nhi banaya to Object banana padta hai
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;  // Added return statement
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        L_31_Methods obj=new L_31_Methods(); //Ststic ko hata diye hai... to object bana ke call ke rhe hai "L_31_Methods" ko
        c=obj.logic(a,b);// to obj.logic() ---Object ko OOP'S me jaise call karte hai ussi tarah isme bhi call kar rhe hai
        System.out.println(c);
        int a1=51;
        int b1=3;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c1);

        //ANOTHER METHOD TO CALL METHOD
    }
}
