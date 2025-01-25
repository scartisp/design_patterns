import java.util.ArrayList;

/**
 * creates the object that contains the candidates arrayList as well as the observer arrayList
 * 
 * @author Simion Cartis
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * constructs a StudentGovPoll object and initalizes the observers and candidates arrayList
     * 
     * @param school the name of the school that is having the election
     */
    public StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<Observer>();
        candidates = new ArrayList<Candidate>();
    }

    /**
     * adds observers to the observer arrayList
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * removes a give observer from the observer arrayList
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * calls on the update methods in the observer classes
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    /**
     * initializes and adds a candidate to the candidate arrayList
     * 
     * @param firstName the first name of the candidate
     * @param lastName the last name of the candidate
     */
    public void addCandidate(String firstName, String lastName) {
        Candidate newCandidate = new Candidate(firstName, lastName);
        candidates.add(newCandidate);
    }

    /**
     * enters a voter's first, second, and third place votes for their chosen candidates
     * 
     * @param firstPlace the voters first place candidate vote
     * @param secondPlace the voters second place candidate vote
     * @param thirdPlace the voters third place candidate vote
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        
        for (int i = 0; i < candidates.size(); i++) {
            if (firstPlace == i + 1) {
                candidates.get(i).addFirstPlaceVote();
            } else if (secondPlace == i + 1) {
                candidates.get(i).addSecondPlaceVote();
            } else {
                candidates.get(i).addThirdPlaceVote();
            }
        }
        Candidate.addVote();
       if (Candidate.totalNumberOfVotes % 4 == 0){
            notifyObservers();
       }
    }

    /**
     * returns the school name as a string
     * @return the school name as a string
     */
    public String getSchool() {
        return school;
    }
}
