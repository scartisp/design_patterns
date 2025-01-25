import java.util.ArrayList;

/**
 * interface that sets up the required update method for the display classes
 * 
 * @author Simion Cartis
 */
public interface Observer {
    /**
     * displays the output for every fourth voter
     * 
     * @param candidates displays the total number of votes (tallied and weighed
     *                   percentage) for all three candidates in the ArrayList
     *                   candidates
     */
    public void update(ArrayList<Candidate> candidates);
}
