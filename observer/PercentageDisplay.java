import java.util.ArrayList;

public class PercentageDisplay implements Observer{
    private Subject poll;
    private ArrayList<Candidate> candidates;

    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(ArrayList<Candidate> candidates){
        this.candidates = candidates;
        display();
    }
    private void display(){
        System.out.println("Current Percent of Votes:");
        for(Candidate candidate:candidates){
            System.out.println(candidate.getFullName() + candidate.getWeightedVotes()); 
        }
        System.out.println();
    }

}
