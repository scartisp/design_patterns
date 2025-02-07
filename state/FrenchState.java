/**
 * creates a FrenchState object that extends State 
 * and has a MusicBox object and two Strings,
 * one for each of the French versions of the song's paths
 * 
 * @author Simion Cartis 
 */
public class FrenchState extends State{
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-french.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-french.txt";

    /**
     * constructor that implements the parent class' constructor
     * and initializes the MusicBox object as well as the
     * two song's file names
     * 
     * @param box takes in a MusicBox item to be initialized
     */
    FrenchState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * switches the State to EnglishState
     */
    public void pressEnglishButton() {
        super.pressEnglishButton();
    }

    /**
     * prints a message to the console that says the State is 
     * already in French state
     */
    public void pressFrenchButton() {
       System.out.println("You are already in French");
    }

    /**
     * switches the State to SpanishState
     */
    public void pressSpanishButton() {
        super.pressSpanishButton();
    }
}
