public class TrueFalseQuestion extends Question {
    private final int points;
    private final boolean correctChoice;
    private final String question;
    public TrueFalseQuestion(String question, int points, boolean correctChoice) {
        this.question = question;
        this.points = points;
        this.correctChoice = correctChoice;
    }

    @Override
    public void displayQuestion() {
        System.out.println("=== TRUE OR FALSE ===");
        System.out.println(question);
        System.out.println("1) True");
        System.out.println("0) False");
    }

    @Override
    public int givePointsForAnswer(int answer) {
        return (answer == 1) == correctChoice ? points : 0;
    }
    public int getSize() {
        return 1;
    }
    public int getPoints() {
        return points;
    }
}
