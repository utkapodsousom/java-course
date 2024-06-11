package chapter5;

import java.util.Scanner;

public class Exercise5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerWins = 0;
        int userWins = 0;

        while (Math.abs(computerWins - userWins) != 3) {
            int computerChoice = (int) (Math.random() * 3);

            System.out.print("scissor (0), rock (1), paper (2): ");
            int userChoice = input.nextInt();

            if (userChoice > 2 || userChoice < 0) {
                System.out.println("Invalid input");
                System.exit(0);
            }

            String computerFigure = "";
            String userFigure = "";

            switch (computerChoice) {
                case 0:
                    computerFigure = "scissor";
                    break;
                case 1:
                    computerFigure = "rock";
                    break;
                case 2:
                    computerFigure = "paper";
                    break;
            }

            switch (userChoice) {
                case 0:
                    userFigure = "scissor";
                    break;
                case 1:
                    userFigure = "rock";
                    break;
                case 2:
                    userFigure = "paper";
                    break;
            }

            String feedback = "The computer is " + computerFigure + ". You are " + userFigure;

            if (userChoice == computerChoice)
                System.out.println(feedback + " too. It is a draw");
            else if ((userChoice == 0 && computerChoice == 2) ||
                     (userChoice == 1 && computerChoice == 0) ||
                     (userChoice == 2 && computerChoice == 1)) {
                System.out.println(feedback + ". You won");
                userWins++;
            } else {
                System.out.println(feedback + ". You lose");
                computerWins++;
            }
        }
    }
}