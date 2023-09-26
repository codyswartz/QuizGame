import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is 2 + 2?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the largest mammal on Earth?"
        };

        String[] answers = {
            "Paris",
            "Mars",
            "4",
            "William Shakespeare",
            "Blue Whale"
        };

        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
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