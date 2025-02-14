import java.util.Random;

public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

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

    public String getQuestion() {
        return this.num1 + " " + this.num2 + " " + operand.label + " = ";
    }

    public void setUserAnwer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean isCorrect() {
        if (answer == userAnswer)
            return true;
        return false;
    }
    
    public String toString() {
        if(isCorrect()){
        return ANSI_GREEN + this.num1 + " " + this.num2 + " " + this.operand.label + " = " + 
               this.answer + " you answered "+ userAnswer + ANSI_BLACK;
        }
    return ANSI_RED + this.num1 + " " + this.num2 + " " + this.operand.label + " = " + 
    this.answer + " you answered "+ userAnswer + ANSI_BLACK;
    }
}
