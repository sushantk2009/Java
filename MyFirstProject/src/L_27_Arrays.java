import java.sql.SQLOutput;
//KISI BHI DATA TYPE KA ARRAY BAN SHAKTA HAI:--------------------------
import java.util.Scanner;
public class L_27_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INT DATA TYPE KA ARRAY:--
//        int [] marks={12,54,58,24,64,56};
//        System.out.println(marks.length);  //Arary ki length mil jati hai jaise iski 6 hai

        //FLOAT DATA TYPE KA ARRAY :--
//        float [] marks= {55.2F,54.56F,45.45F,21.65F,89.9F,57.6F};
//        System.out.println(marks[5]);

        //STRING DATA TYPE KA ARRAY :--
//        String [] Student={"Sushant","Yash","Vidhi","Siddharth","Shrikant","Shivam"};
//        System.out.println(Student.length);//Array ki kitni length hai
//        System.out.println(Student[3]);


        //How to display All Array using for loop in Ascending order
//        int [] marks={12,54,58,24,64,56};
//        System.out.println("Printing using for loop in Ascending order :");
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        //How to display All Array using for loop in Reverse order
//        int[] marks = {12, 54, 58, 24, 64, 56};
//        System.out.println("Printing using for loop in Reverse order:");
//        for (int i = marks.length - 1; i >=0; i--) {
//            System.out.println(marks[i]);
//        }

        //FOR EACH LOOP IN JAVA
        //DISPLAY ALL ARRAY USING (FOR-EACH LOOP)
        String []Employee={"Sushant","Siddharth","Yash","Vidhi","Love","Shrikant","Shivam"};
        for(String element:Employee){
            System.out.println(element);
        }

        }
    }
