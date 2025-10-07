import java.util.List;

public class ChoiceQuestion extends Question {
    private final int points;
    private final List<Integer> correctChoices;
    private final String question;
    private final List<String> answers;
    public ChoiceQuestion(String question, List<String> answers, int points, List<Integer> correctChoices) {
        this.question = question;
        this.points = points;
        this.correctChoices = correctChoices;
        this.answers = answers;
    }

    @Override
    public void displayQuestion() {
        System.out.println("=== MULTIPLE CHOICE ===");
        System.out.println(question);
        int i = 0;
        for(String answer : answers) {
            System.out.println(++i + ") " + answer);
        }
    }

    public int getSize() {
        return answers.size();
    }

    @Override
    public int givePointsForAnswer(int answer) {
        for(int correctChoice : correctChoices) {
            if(answer == correctChoice) return points;
        }
        return 0;
    }
    public int getPoints() {
        return points;
    }
}
