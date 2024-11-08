//Video Title:----- HashMap in Java | Hashing | Java Placement Course | Data Structures & Algorithms
//Video By Aapna college
import java.util.*;
public class Hasmap {
    public static void main(String[] args) {
        //Jaha hume pair store karne hote hai waha hasmap use hota hai -----Jaise
        //ek key hogi uski value bhi hogi
        //country(key),population(Value)
        HashMap<String,Integer> map= new HashMap<>(); //Key aur value dene ka syntex hai

        //Insertion
        //add karne ke liye -----map.put("key,Value")----ka use karte hai
        map.put("India",140);
        map.put("China",120);
        map.put("USA",30);
        System.out.println(map);


        //Search        -----Key hai ya nhi
        if (map.containsKey("China")){      //agar exist karta hoga china to true return karega wahna false
            System.out.println("Present in The map");
        }
        else {
            System.out.println("Not Present in the map");
        }
        // Key ke Sath kon si value Exist karti hai
        System.out.println(map.get("India")); // India ki value 140 print hogi
        System.out.println(map.get("Pakistan"));//Pakistan name ki key nhi hai to null print hoha
        //Print arrys elemtnt in using for loop:---------
        //Two ways to print arrys elemrnt
        // 1 st
        int arr[]={15,45,47,57,56};
        for (int elemrnt:arr){
            System.out.print(elemrnt+" "+"\n");
        }
        // 2 nd
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" \n");
        }

        //syntex in Hasmap for loop
        //for(map.Entry<Integer,Integer>e:Map.entrySet())
        //            ↓        ↓    ↓         ↓
        //        Key   value type  element  sere payers store honge
      //  for (int elemrnt:arr) isse compair karenge to
        //int elemrent = Map.Entry<String,Integer> e
        //:arr = :map.entrySet()
      for(Map.Entry<String,Integer> e:map.entrySet()){ //pure pair ka set bana liya ---- entrySet() ----se
          System.out.print(e.getKey()+" ");
          System.out.println(e.getValue());
      }

     //Remove pair From Set
        map.remove("China");
        System.out.println(map);  //China Remove ho gaya


    }
}
