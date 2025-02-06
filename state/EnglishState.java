public class EnglishState extends State {
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-english.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-english.txt";

    EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    public void pressEnglishButton() {
        System.out.println("you are already in English.");
    }

    public void pressFrenchButton() {
        super.pressFrenchButton();
    }

    public void pressSpanishButton() {
        super.pressSpanishButton();
    }
}
