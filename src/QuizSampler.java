public class QuizSampler {
    public static void main(String[] args)  {
        Questions quiz = new Questions();
        for (Question question: quiz.getQuestions()) {
            System.out.println(question);
        }
    }
}
