import java.util.List;

public class ChoiceQuestion extends Question {
    private final int points;
    private final int correctChoice;
    private final String question;
    private final List<String> answers;
    public ChoiceQuestion(String question, List<String> answers, int points, int correctChoice) {
        this.question = question;
        this.points = points;
        this.correctChoice = correctChoice;
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
        return answer == correctChoice ? points : 0;
    }
}
