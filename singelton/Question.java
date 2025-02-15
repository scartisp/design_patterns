import java.util.Random;

/**
 * creates a class called "Question" that has two numbers, an operation applied
 * to those two number,
 * a user answer, and the correct answer
 * 
 * @author Simion Cartis
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * initializes an instance of the Question class and selects random values for
     * the two numbers (0 to 99 inclusive), picks a random operation from the
     * Operand enum,
     * and calculates the correct answer based on the above
     */
    public Question() {
        Random random = new Random();
        this.num1 = random.nextInt(1, 100);
        this.num2 = random.nextInt(1, 100);
        this.operand = Operand.values()[random.nextInt(3)];
        switch (operand.label) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            default:
                answer = num1 * num2;
        }
    }

    /**
     * returns the question that will be asked to the user and that they will answer
     * 
     * @return returns the first number, the operation being done, the second
     *         number, and the equal sign
     */
    public String getQuestion() {
        return this.num1 + " " + operand.label + " " + this.num2 + " = ";
    }

    /**
     * takes in the user's answer and sets the userAnswer value to it
     * 
     * @param userAnswer takes in an int the user inputs
     */
    public void setUserAnwer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    /**
     * checks to see if the user answer and the correct answer are the same
     * 
     * @return returns true if both values are the same, false if not
     */
    public boolean isCorrect() {
        if (answer == userAnswer)
            return true;
        return false;
    }

    /**
     * returns the result of whatever the user inputed for a question.
     * if the user was correct, it will print the equation witht the answer, and it
     * will all be in green.
     * If the user was wrong, it will print the same but with the addition of the
     * users answer and in red.
     * 
     * @returns returns the first number, the operation being used, the second
     *          number, an equal sign, and the correct answer.
     *          If the answer was correct, the text will be in green, if it was
     *          wrong, it will be in red and it will additionally return "you
     *          answered " and then the users answer.
     */
    public String toString() {
        if (isCorrect()) {
            return ANSI_GREEN + this.getQuestion() +
                    this.answer + ANSI_BLACK;
        }
        return ANSI_RED + this.getQuestion() +
                this.answer + " you answered " + userAnswer + ANSI_BLACK;
    }
}
