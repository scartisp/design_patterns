import java.util.ArrayList;

/**
 * updates and displays the weighed percentage of votes for each Candidate
 * 
 * @author Simion Cartiss
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * constructs a percentageDisplay object and adds it to the Observer arrayList
     * 
     * @param poll the observer that is being initallized and added to the Observer
     *             arrayList
     */
    public PercentageDisplay(Subject poll) {
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
     * displays the candidate's names and their weighed percentages of votes
     */
    private void display() {
        System.out.println("Current Percent of Votes:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getFullName() + candidate.getWeightedVotes()+"%");
        }
    }

}
