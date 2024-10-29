import java.util.Locale;

public class L_14_Strings_method {
    public static void main(String[] args) {
        String name="Sushant";
//        0 1 2 3 4 5 6
//        S u s h a n t


        System.out.println(name);
        int count= name.length();
        System.out.println(count);
        String lowerCase =name.toLowerCase();
        System.out.println(lowerCase);//sab captial se small me ho jayega
        String upperstring=name.toUpperCase(); //Sab Small se capital me ho jayega
        System.out.println(upperstring);
        String nonTrimmedString ="   Sushant   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());//.trim aange piche ke space ko hata deta hai
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('s','d')); //isme s ki jagah d aa jayega
        System.out.println(name.replace("Sushant","Aryan")); //isme Sushant ki jagah Aryan likh jayega
        System.out.println(name.startsWith("Sush")); //ye true ya false me answer dega
        System.out.println(name.endsWith("Sus"));
        System.out.println(name.charAt(3));//iska matlab 3rd me kon sa charactor hai
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("sh"));

    }
}
