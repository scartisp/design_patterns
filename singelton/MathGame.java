import java.util.ArrayList;
import java.util.Iterator;

public class MathGame {
    public static int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    private MathGame() {
        // probably need some way to add questions to the array list in here somehow????
        addQuestions(); // ?????????????? NO FUCKING CLUE, SEEMS TOO SIMPLE.
    }

    private void addQuestions() {
        for (int i = 0; i < NUM_QUESTIONS; ++i) {
            Question question = new Question();
            questions.add(question);
        }
    }

    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }
    public Iterator<Question> getIterator() {
        Iterator<Question> iterator = questions.iterator(); 
        return iterator;
    }
}
