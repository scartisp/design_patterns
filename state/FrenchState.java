public class FrenchState extends State{
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle-french.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy-french.txt";

    FrenchState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    public void pressEnglishButton() {
        super.pressEnglishButton();
    }

    public void pressFrenchButton() {
       System.out.println("You are already in French");
    }

    public void pressSpanishButton() {
        super.pressSpanishButton();
    }
}
