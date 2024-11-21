import java.util.Scanner;

class Cylender{
private double radius;
private int height;

public double getRadius(){
    return radius;

}
public void setRadius(double radius){
    this.radius=radius;
}
public int getHeidht(){
    return height;
}
public void setHeidht(int height){
    this.height=height;
}
public double areaodcylender(){
    return (2*3.14*radius*height)+(2*3.14*radius*radius);
}

}
public class Z{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
Cylender mycylender=new Cylender();

    System.out.println("Enter Height: ");
int hei= sc.nextInt();
mycylender.setHeidht(hei);
//    System.out.println(mycylender.getHeidht());
    System.out.println("Enter Radius : ");
    int rad=sc.nextInt();
    mycylender.setRadius(rad);
//    System.out.println(mycylender.getRadius());
    mycylender.areaodcylender();
    System.out.println("Area of Cylender is : "+mycylender.areaodcylender());
}
}