import java.util.ArrayList;

public abstract class State {
    protected MusicBox box;
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;

    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);

    }

    public void pressStarButton() {
     box.playSong(starLyrics.getFirst(), starLyrics);
    }

    public void pressHappyButton() {
        box.playSong(happyLyrics.getFirst(), happyLyrics);
    }

    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("switching to French");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
