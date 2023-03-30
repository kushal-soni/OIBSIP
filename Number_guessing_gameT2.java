import javax.swing.*;

public class Number_guessing_gameT2 
{

    public static void main(String[] args)
     {
        int computerNum = (int) (Math.random() * 100 + 1);
        int user = 0;
        System.out.println("The correct guess would be " + computerNum);

        int count = 1;
        while (user != computerNum)
        {  
            String response = JOptionPane.showInputDialog(null,"Guess the number between 1 to 100", "Number Guessing Game", 3);
            user = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null, "" + determineGuess(user, computerNum, count));
            count++;

        }
    }

    public static String determineGuess(int userAnswer, int computerNum, int count)
    {
        if (userAnswer <= 0 || userAnswer > 100)
        {
            return "Invalid Guess";
        }
        else if (userAnswer == computerNum)
        {
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNum)
        {
            return "Guessed number is too high, Try again.\n Number of tries: " + count;
        }
        else if (userAnswer < computerNum)
        {
            return "Guessed number is too low, Try again.\n Number of tries: " + count;
        }
        else 
        {
            return "Incorrect Guess \n Number of tries: " + count;
        }

    }

}