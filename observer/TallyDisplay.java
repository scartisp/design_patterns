import java.util.ArrayList;

/**
 * updates and displays the tallied votes for each candidate
 * 
 * @author Simion Cartis
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * constructs TallyDisplay object and adds it to the Observer arrayList
     * 
     * @param poll the observer that is being initallized and added to the Observer
     *             arrayList
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * updates the current candidates ArrayList and calls on the display method
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * displays the candidate's names and their tallied votes
     */
    public void display() {
        System.out.println("\nCurrent Tallies:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getFullName() + "First(" + candidate.getNumFirstPlaceVotes() +
                    "), Second(" + candidate.getNumSecondPlaceVotes() +
                    "), Third(" + candidate.getNumThirdlaceVotes() + ")");
        }
        System.out.println();
    }
}