import java.util.Scanner;
public class GuesserGameNumberProblem
{
    static int low=1;
    static int high=100;
    static int numberOfTurnsLeft=5;
    public static void main(String[] args)
    {
        gameBegins();
    }
    public static void gameBegins()
    {
        int secretNumber=0;
        double i=Math.random();
        if (i!=0)
            secretNumber=(int)(i*101);
        else
        {
            gameBegins();
            System.out.println("Please enter a valid number : ");
        }
        System.out.println("-------------------------");
        System.out.println("NEW GAME ");
        System.out.println("-------------------------");
        System.out.println("pick a number between 1-100! you will get 5 turns");
        while (true)
        {
            int inputNumber=playerInput();
            predictionResult(inputNumber,secretNumber);
        }
    }
    private static int playerInput()
    {
        Scanner sc=new Scanner(System.in);
        int playerInput=sc.nextInt();
        System.out.println("Player guesses "+playerInput);
        return playerInput;
    }
    public static void predictionResult(int inputNumber,int secretNumber)
    {
        if (inputNumber<secretNumber) {
            low=inputNumber;
            System.out.println("Sorry! that is too low ");
            low=low+1;
            numberOfTurnsLeft=numberOfTurnsLeft-1;
            if (numberOfTurnsLeft==0)
            {
                System.out.println("You Lose! your secret number was : "+ secretNumber);
                playAgain();
            }
            System.out.println("pick a number between "+low +"-"+high + " and turns left "+numberOfTurnsLeft);
        }
        else if (inputNumber>secretNumber)
        {
            high=inputNumber;
            System.out.println("Sorry! that number is too high ");
            high=high-1;
            numberOfTurnsLeft=numberOfTurnsLeft-1;
            if (numberOfTurnsLeft==0)
            {
                System.out.println("You Lose! The secret number was "+secretNumber);
                playerInput();
            }
            System.out.println("pick a number between "+low +"-"+high +" and turns left "+ numberOfTurnsLeft);
        }
        else
        {
            System.out.println("CONGRATULATIONS!!!! Yoy won the game...the secret number was "+secretNumber);
            playerInput();
        }
    }
    public static void playAgain()
    {
        low=1;
        high=100;
        numberOfTurnsLeft=5;
        gameBegins();
    }
}