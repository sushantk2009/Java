public class L_29_practic_Test_Array {
    public static void main(String[] args) {
        // PROBLEM:--1
        float [] prise={25.25564f,258.23241f,892.51254f,544.265f,654.654452f};
        float sum=0;
        for(float element:prise){
            sum =sum+element;
            System.out.println(element);
        }
        System.out.println("The Value Of Sum is :--"+sum);
    }
}
