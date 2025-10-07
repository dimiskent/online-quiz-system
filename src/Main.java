import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        List<Question> questions = new ArrayList<>();
        int points = 0;
        questions.add(new ChoiceQuestion("What is 1 + 1?", List.of("1", "2", "3", "4"), 10, List.of(2)));
        questions.add(new ChoiceQuestion("What is 3 * 3?", List.of("3", "6", "9", "12"), 10, List.of(3)));
        questions.add(new ChoiceQuestion("3 can be divided by", List.of("3", "6", "1", "12"), 10, List.of(1, 3)));
        questions.add(new TrueFalseQuestion("Is Obama's last name Obama?", 5, true));

        for(Question question : questions) {
            question.displayQuestion();
            int min = (question instanceof TrueFalseQuestion) ? 0 : 1;
            int reward = question.givePointsForAnswer(input.getChoice(min, question.getSize()));
            System.out.println("Your answer was " + (reward == 0 ? "WRONG" : "CORRECT"));
            points += reward;
        }

        System.out.println("Results: " + points);
    }
}
