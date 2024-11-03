public class L_29_practic_Test_Array {
    public static void main(String[] args) {
        // PROBLEM:--1
//        float [] prise={25.25564f,258.23241f,892.51254f,544.265f,654.654452f};
//        float sum=0;
//        for(float element:prise){
//            sum =sum+element;
//            System.out.println(element);
//        }
//        System.out.println("The Value Of Sum is :--"+sum);

        //PROBLEM :---2
//        float [] prise={25.25564f,258.23241f,892.51254f,544.265f,654.654452f};
//        float num=25.25564f;
//        boolean isInArray=false;
//        for(float element:prise){
//            if (num==element) {
//            isInArray=true;
//            break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The Value is present in The Array");
//        }
//        else {
//            System.out.println("The Value is not present in Array");
//        }

        //PORNLEM :---3
//        int [] marks={65,75,98,47,56,85,74,58,69,25,89};
//        int sum=0;
//        System.out.println(marks.length);
//        for (int element:marks){
//            sum=sum+element;
//        }
//        System.out.println("The value of avrage marks is :--"+sum/marks.length);// marks.length avrage nikalne ke liye use kiya hu


        //PORNLEM :---4 nahi samajh aaya


        //PORNLEM :---5
//        int [] arr={2,5,7,8,9,3,5,7,5,8,5,65};
//        int n= Math.floorDiv(arr.length,2); // इसका अर्थ है कि arr.length को 2 से भाग दिया जाएगा।
//        int temp; //tempory boc create kiye hai
//        for (int i=0;i<n;i++){
//                    //Swap a[i] and a[arr.length-i-1]
//                    //Swap karne ka tarika given below
//            temp=arr[i];          //array arr[i] ki value temp me store kar diye fir
//            arr[i]=arr[arr.length-i-1];//arr[i] ki value arr[arr.length-i-1] me store kara diye fir
//            arr[arr.length-i-1]=temp;//iska matlab arr[arr.length-i-1] ki value temp me store hai
//        }
//        for (int element: arr){
//            System.out.println("Reverse array is:--");
//            System.out.print(element+" ");
//
//        }

        //PORNLEM :---6
        //Maximum Arry In The List
//        int [] arr={25,15,25,95,8,4,556,45,69};
//        int max=0;
//        int num;
//        for (int element:arr) {
//            if (element > max) {
//                max =element ;
//            }
//        }
//        System.out.println("The max Element is :"+max);

        //PORNLEM :---7
        //Minum Arry In The List
//        int[] marks={47,62,12,14,25,74,58,96,59,88,69,45};
//        int min=Integer.MAX_VALUE;//   -------Java ki sabse max Value
//        //Integer.MAX_VALUE;       ------Java ki min value
//        for (int element :marks){
//            if (element<min){
//                min =element;
//            }
//        }
//        System.out.println("The Min Element is :"+min);


        //PORNLEM :---8
        //Sorted Array Hai Ki Nhi
        boolean isSorted=true;
        int [] arr ={3,5,6,7,8,9,12,35,65,97};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("The element is sorted");
        }
        else {
            System.out.println("The Element is not Sorted ");
        }

    }
}
