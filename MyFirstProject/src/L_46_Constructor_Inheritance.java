
class Base1{            //class hai
    Base1(){
        System.out.println("This is Base Class Constructor :");
    }
    Base1(int x){
        System.out.println("This is overloaded constructor with with value of a as :"+x);
    }
}
class Derived1 extends Base1{        //Base1 class ko Inherite kar liya
         Derived1(){
            //super(0);
             System.out.println("This is Derived class constructor");
         }
         Derived1(int x, int y){
             super(x);
             System.out.println("This is overloded constructor of Derived with the value of y as :"+y);
         }

}
class chileOfDerived extends Derived1{
    chileOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("This is overloded constructor of Derived with the value of z as :"+z);
    }
}

public class L_46_Constructor_Inheritance {
    public static void main(String [] args){

//        Base1 b=new Base1();
//        Derived1 d=new Derived1(14,64);
chileOfDerived child=new chileOfDerived(24,5,64);
    }
}
