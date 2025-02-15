/**
 * creates an EnglishState object that extends State
 * and has a MuiscBox object and two strings, one for
 * each of the English versions of the song's paths
 * 
 * @author Simion Cartis
 */
public class EnglishState extends State {
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-english.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-english.txt";

    /**
     * constructore that implemets the parent's constructor and initializes the
     * MusixBox object
     * as well as the two song's file names
     * 
     * @param box takes in a MusicBox item to be initialized
     */
    public EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * prints out a message to the console that says the State is already
     * in english state
     */
    public void pressEnglishButton() {
        System.out.println("you are already in English.");
    }

    /**
     * switches the State to FrenchState
     */
    public void pressFrenchButton() {
        super.pressFrenchButton();
    }

    /**
     * switches the State to SpanishState
     */
    public void pressSpanishButton() {
        super.pressSpanishButton();
    }
}
