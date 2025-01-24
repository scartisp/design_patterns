import java.util.ArrayList;

public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    public void display() {
        System.out.println("Current Tallies:");
        for(Candidate candidate:candidates){
            System.out.println(candidate.getFullName() + "First("+candidate.getNumFirstPlaceVotes()+
            "), Second("+candidate.getNumSecondPlaceVotes()+
            "), Third("+candidate.getNumThirdlaceVotes() +")");
        }
        System.out.println();
    }
}