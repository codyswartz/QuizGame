import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is my last name?",
            "What is my favorite color?",
            "What is 2 + 2?",
            "What is my favorite video game?",
            "What is mt favorite animal?"
        };

        String[] answers = {
            "Swartz",
            "Red",
            "4",
            "Valorant",
            "Cat"
        };

        int score = 0;

        System.out.println("Welcome to my Quiz Game!");
        System.out.println("Answer the following questions.");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nQuiz Complete!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
