public class L_15_practic_Test {
    public static void main(String[] args) {
        // PROBLEM:1--->
        String name="Sushant KUSHWAHA";
        name =name.toLowerCase();
        System.out.println(name);
        // PROBLEM:2--->
        String text = "To The Host";
        text =text.replace(" ","_");
        System.out.println(text);
        // PROBLEM:3-->
        String letter="Dear <|name|>,Thanks a Lot";
        letter =letter.replace("<|name|>","Sushant");
        System.out.println(letter);
        //PROBLEM:--->
            String ltt="Dear Sushant Kushwaha,\n\t This is your java class,\n\t Thanks";
        System.out.println(ltt);
    }
}
