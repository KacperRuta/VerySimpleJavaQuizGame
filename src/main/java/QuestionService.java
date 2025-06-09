import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Rome", "Paris");
        questions[1] = new Question(2, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "Mars");
        questions[3] = new Question(4, "What color do you get by mixing red and blue?", "Green", "Purple", "Orange", "Pink", "Purple");
        questions[4] = new Question(5, "Which animal is known as the King of the Jungle?", "Tiger", "Elephant", "Lion", "Giraffe", "Lion");
    }

    public void playQuiz() {
        for (Question question : questions) {
            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            selection[question.getId() - 1] = scanner.nextLine();
        }

        for(String s: selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for(int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String answer = q.getAnswer();
            String userAnswer = selection[i];

            if(answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Score is: " + score + " out of " + questions.length);
    }

}