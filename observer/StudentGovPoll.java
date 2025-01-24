import java.util.ArrayList;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    public StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<Observer>();
        candidates = new ArrayList<Candidate>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    public void addCandidate(String firstName, String lastName) {
        Candidate newCandidate = new Candidate(firstName, lastName);
        candidates.add(newCandidate);
    }

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
       if (Candidate.totalNumberOfVotes % 4 == 0){
            notifyObservers();
       }
    }

    public String getSchool() {
        return school;
    }
}
