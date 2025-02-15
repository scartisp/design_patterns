import java.util.ArrayList;
import java.util.Iterator;

/**
 * this class creates the math game and ensures only one instance of it can
 * exist at a time
 * 
 * @author Simion Cartis
 */
public class MathGame {
    public static int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
     * constructor for the math game class.
     * is private to ensure that only this class can create an instance of it
     */
    private MathGame() {
        questions = new ArrayList<Question>();
        addQuestions();
    }

    /**
     * adds instances of the Questions class to the questions arrayList
     */
    private void addQuestions() {
        for (int i = 0; i < NUM_QUESTIONS; ++i) {
            Question question = new Question();
            questions.add(question);
        }
    }

    /**
     * is the method that access the constructor of the mathGame class.
     * ensures that an instance of the class is only created if no instance already
     * exists
     * 
     * @return returns an instance of the mathGame class
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * the method that creates an iterator to iterate through the 
     * questions array list
     * @return returns an iterator of type Question
     */
    public Iterator<Question> getIterator() {
        Iterator<Question> iterator = questions.iterator();
        return iterator;
    }
}
