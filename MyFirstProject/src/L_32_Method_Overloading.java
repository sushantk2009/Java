public class L_32_Method_Overloading {


    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=69;
    }
    static void tellJoke() {// jab hame return type nhi likhna hota to void likhte hai
        System.out.println("I Invented a new software8\n" + "Suro");
    }
    static  void foo(){
        System.out.println("Good morning to all!");
    }
    static void foo(int a){   //(int a) ko parameter kahte hai
        System.out.println("Good Morning to "+a+" all!");
    }
    static void foo(int a,int b){                 //(int a,int b) ko parameter kahte hai
        System.out.println("The value of a= "+a+" And Value of b= "+b);
    }
    static void foo(float a){   //(float a) ko parameter kahte hai
        System.out.println("Value of Float is : "+a);
    }

    public static void main(String[] args) {
  tellJoke();

//        //case:1 Changing The Integer
//        int x=45;
//        change(x);
//        System.out.println("value of x after running change is :"+x);//Yaha pe x ki value 98 isliye nhi aai kyonki method sirf value copy karta hai

//        //Case:2 Changing in array
//        int [] marks={35,89,58,47,58,69,47,25,98}; //marks refrence hai //values arry object banta hai
//        change2(marks);
//        System.out.println(marks[0]);//Objech pass ho rha isliye change ho jayega
//
//        }
        //METHOD OVERLOADING
        foo();//khud se string wala lw lega
        foo(35);    //(35) argument kahte hai       //isme ye khud se int wala ke lega kyonki isme humne int value di hai
      foo(35,68);         //(35,68) argument kahte hai Arguments are actual values
        foo(35.2575f);



    }
    }

