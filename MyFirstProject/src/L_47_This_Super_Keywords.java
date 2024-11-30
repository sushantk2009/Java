class EkClass{
    int a;
    public int getA(){
        return a;
    }


    EkClass(int v){
        a=v;
    }



    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{

    DoClass(int c){
        super(c);
        System.out.println("This is an constructor of DoClass : ");

    }
}

public class L_47_This_Super_Keywords {
    public static void main(String[]args){
        EkClass e=new EkClass(25);
        System.out.println(e.getA());
        DoClass d=new DoClass(45);
        System.out.println(e.getA());
        String s="\"\\\\\"";
        System.out.println(s);
    }
}
