abstract class parent{
    public parent(){
        System.out.println("This is constructor of Parent Class :");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greed();
}

class parent2 extends parent{
    @Override
    public void greed(){
        System.out.println("Good Morning");
    }

}
abstract class parent3 extends parent2{
    public void hi(){
        System.out.println("Good Night :");
    }
}


public class L_53_Abstract_Class {
    public static void main(String[]args){
   parent2 p=new parent2();
//   parent3 pp=new parent3();//iska object create nhi hoga


    }
}
