import java.util.Scanner;
import java.util.Random;
public class L_20_Rock_paper_seasore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random =new Random();
        System.out.println("This is Rock Paper Scissore Game");
        System.out.println("Press 0 for Rock ,1 For Paper ,2 For scissore");
        System.out.println("Your Choice :");
        int userchoice =sc.nextInt();

        int computerchoice = random.nextInt(3);
        String[] choices ={"Rock","Paper","Scissore"};
        System.out.println("Your choice:"+ choices[userchoice]);
        System.out.println("computer choice:"+choices[computerchoice]);
        if (userchoice == computerchoice){
            System.out.println("Match Draw ");
        }
        else if ((userchoice == 0 && computerchoice  == 2)||
                 (userchoice == 1 && computerchoice == 0)||
                ( userchoice == 2 && computerchoice == 1)){
            System.out.println("Your Win :");
        }
        else {
            System.out.println("computer win");
        }
    }
}
