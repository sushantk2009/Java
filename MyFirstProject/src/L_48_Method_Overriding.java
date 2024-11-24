//OVERRIGING
class A{
    public int a;
    public int Test(){
        return 4;
    }
    public void meth2(){
        System.out.println("This is method 2 of class A");
    }

}

class B extends A{
@Override  //method overriding hoga tabhi run hoga warna error dege
    public void meth2(){
        System.out.println("This is method 2 of class B");
    }
    public void meth3(){
        System.out.println("This is method 3 of class B");
    }
}

public class L_48_Method_Overriding {
    public static void main(String[]args){

    A a= new A();
    a.meth2();

        B b=new B();
        b.meth2();

    }
}
