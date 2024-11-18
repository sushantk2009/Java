class Base{   //class banaya hai
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void printme(){
        System.out.println("my name is sushant");
    }
}
class Derived extends Base{ //Base class ko inherite kr liya hai
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
        }
public class L_45_Inheritance {
    public static void main(String[] args){

        //Creating an Object of base class
        Base b=new Base();
        b.setX(56);
        System.out.println("This Value is come from Base class : "+b.getX());

        //Creating an Object pf Derived class
        Derived d=new Derived();
        d.setY(5758);
        System.out.println("This value is Come From Derived class : "+d.getY());

    }
}
