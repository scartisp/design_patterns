import java.util.ArrayList;

/**
 * creates an abstract State object which contains a MusixBox
 * and an arrayList of the two different song's lyrics (both of type String)
 * 
 * @Author Simion Cartis
 */
public abstract class State {
    protected MusicBox box;
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    /**
     * construtor for the State object initallizes the MusicBox
     * and assigns what file the FileReader will read from
     * 
     * @param box takes in an object of type MusicBox to be initialized
     * @param twinkleFileName takes in a String that will correlate to the path of the desired song's file
     * @param happyFileName takes in a String that will correlate to the path of the desired song's file
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);

    }

    /**
     * calls the MusicBox's .playSong method and inputs the first line of the desried
     * Twinkle Twinkle Little Star ArrayList's contents as the song's title and inputs the
     * arrayList as the lyrics
     */
    public void pressStarButton() {
     box.playSong(starLyrics.getFirst(), starLyrics);
    }

    /**
     * calls the MusicBox's .playSong method and inputs the first line of the desried
     * Happy ArrayList's contents as the song's title and inputs the arrayList as the lyrics 
     */
    public void pressHappyButton() {
        box.playSong(happyLyrics.getFirst(), happyLyrics);
    }

    /**
     * switches the MusicBox object's state to the EnglishState
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    /**
     * switches the MusicBox object's state to the FrenchState
     */
    public void pressFrenchButton() {
        System.out.println("switching to French");
        box.setState(box.getFrenchState());
    }

    /**
     * switches the MusicBox object's state to the SpanishState
     */
    public void pressSpanishButton() {
        System.out.println("switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
