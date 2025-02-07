/**
 * creates a SpanishState object that extends State
 * and has a MusicBox and two Strings, one for 
 * each of the Spanish versions of the song's paths
 * 
 * @author Simion Cartis
 */
public class SpanishState extends State{
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-spanish.txt";
    
    /**
     * constructor that implements the parent class' constructor 
     * and initializes the MusicBox item as well as the two song's 
     * file names
     * 
     * @param box takes in MusicBox item to be initialzied
     */
    public SpanishState (MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * switches the State to EnglishState
     */
    public void pressEnglishButton() {
        super.pressEnglishButton();
    }

    /**
     * switches the State to FrenchState
     */
    public void pressFrenchButton() {
       super.pressFrenchButton();
    }

    /**
     * prints out a message to the console that says
     * the State is alread in French state
     */
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish");
    }
}
