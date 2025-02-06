public class SpanishState extends State{
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-spanish.txt";
    
    public SpanishState (MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    public void pressEnglishButton() {
        super.pressEnglishButton();
    }

    public void pressFrenchButton() {
       super.pressFrenchButton();
    }

    public void pressSpanishButton() {
        System.out.println("You are already in Spanish");
    }
}
