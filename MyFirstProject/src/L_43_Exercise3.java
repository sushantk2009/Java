/*Create a class Game, Which allows a user to play "Guess The number " game once
        Game Should have the following method:
        1.Constructor to generate the random number
        2.TakeuserInput to take a user input of number
        3.isCorrectNumber() to detect whether the number entered by the user is true
        4.Getter or Setters for noOFGusses
        use property such an noOfGusses(int), etc to get this task done!
         */
import java.util.*;

class game{
    private int userInput;
    private int isCorrectNumber;
    private int attempt;
    private Random rand;

    public game(){
     rand=new Random();
     isCorrectNumber =rand.nextInt(100)+1;
        attempt =0;
    }

    public void  userInput(int input){
        userInput=input;
        attempt++;

    }
//Method to check the game
    public boolean isCorrectGuess(){
        if (userInput==isCorrectNumber){
            System.out.println("Congratulations! You guessed the correct number in "+attempt+" attempt");
            return true;
        } else if (userInput<isCorrectNumber){
            System.out.println("Too low... Please Increase The Number ");
        }
        else {
            System.out.println("Too high please low the number ");
        }
        return false;
    }

    public int getAttempt() {
        return attempt;
    }
}
public class L_43_Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game gm=new game();

        System.out.println("Enter The number Between 1 to 100 : ");

        for (boolean hasWon=false;!hasWon; ){
            System.out.println("Enter Your Guess : ");
            int guess= sc.nextInt();
            gm.userInput(guess);
            hasWon=gm.isCorrectGuess();
        }

    }
}
