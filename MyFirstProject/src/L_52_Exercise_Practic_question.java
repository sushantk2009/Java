class Circle{

    public int radius;
    Circle(int r) {
        System.out.println("I am circle paratermetrise constructor :");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylender1 extends Circle{
        Cylender1(int r,int h){
            super(r);
            System.out.println("I am Cylender1 parametrised Constructor :");
            this.height=h;

        }

    public int   height;
   public double volume(){
        return Math.PI*this.radius*this.radius*this.height;

   }
}

public class L_52_Exercise_Practic_question {
    public static void main(String[] args) {
        //PROBLEM 1:
//        Circle objc=new Circle(12);
       Cylender1 obj=new Cylender1(12,4);//cylender1 ka object bana rha




    }
}
