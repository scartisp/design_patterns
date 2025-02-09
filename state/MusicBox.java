import java.util.ArrayList;

/**
 * creates an object named MuiscBox that has three different states
 * (english, spanish, and french) with the default state being zero
 * 
 * @author Simion Cartis
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;

    private State state;

    /**
     * constructor for the music box, defines the differnet states
     * for the MusicBox object and sets it's defual to zero
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    /**
     * calls on the abstract State class' pressStartButton
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * calls on the abstract State class' pressHappyButton
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * calls on the abstract State class' pressEnglishButton
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * calls on the abstract class' pressFrenchButton
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * calls on the abstract class' pressSpanishButton
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * allows the MuiscBox to change the state it is in
     * by taking in a new state value
     * 
     * @param state the name of the new state the user wishes to change to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * returns the englishState State object (used for setting the state)
     * 
     * @return returns the englishState State
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * returns the frenchState State object (used for setting the state)
     * 
     * @return returns the frenchState State
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * reutns the spanishState object (used for setting the state)
     * 
     * @return returns the spanishState State
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * outputs the lyrics that to a song in the specified langauge
     * 
     * @param songName takes in the song's title of type String
     * @param lyrics   takes in the lyrics of a song as an ArrayList of type String
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        LanguageSongs.clear();
        System.out.println("Playing " + songName);
        for (int i = 1; i < lyrics.size(); ++i) {
            LanguageSongs.sleep();
            System.out.println(lyrics.get(i));
        }
        System.out.println();
        LanguageSongs.sleep();
    }
}
