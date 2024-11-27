class Phone{
    public void greet(){
        System.out.println("Good Morning ");
    }


    public void on(){
        System.out.println("Turning on Phone : ");
    }
}


class Smartphone extends Phone{

    public void music(){
        System.out.println("Playing Music");
    }

    public void on(){
        System.out.println("Turning on Smart Phone :");
    }
}

public class L_49_Dynamic_method_Dispatch {
    public static void main(String[] args) {
//        Phone obj=new Phone (); //Ye bana Shakte hai...allow hai
//        Smartphone smobj=new Smartphone();//Ye bhi bana Shakte hai... Allowed
//        obj.name();//Allowed

        Phone obj=new Smartphone(); //Allow hai karna   //phone SUpar class //Smartphone Sub class hai
//        Smartphone obj2=new Phone();//Not allowed


        obj.greet();
        obj.on();
//        obj.music();//Not Allowed
        obj.greet();
    }
}
