import java.util.Scanner;

public class SecretNumber
{
    public static void main(String[] args)
    {
        int secretNum = 45;
        System.out.println("Guess the secret number! It's between 1 - 100");
        Scanner user = new Scanner(System.in);
        String guess = user.nextLine();

        int guess1 = Integer.parseInt(guess);

        if (guess1 > secretNum)
        {
            System.out.println("Nope. Too high!");
        }
        else if (guess1 < secretNum)
        {
            System.out.println("Nope. Too low!");
        }
        else
        {
            System.out.println("Correct. Well done!");
        }

    }
}
