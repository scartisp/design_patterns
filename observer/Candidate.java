public class Candidate {
    public static int totalNumberOfVotes;
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes;
    private int numSecondPlaceVotes;
    private int numThirdPlaceVotes;

    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(String firstName, String lastName) {
        if (this.firstName.equalsIgnoreCase(firstName) && this.lastName.equalsIgnoreCase(lastName)) {
            return true;
        }
        return false;
    }

    public static void addVote() {
        ++totalNumberOfVotes;
    }

    public void addFirstPlaceVote() {
        ++numFirstPlaceVotes;
        addVote();
    }

    public void addSecondPlaceVote() {
        ++numSecondPlaceVotes;
    }

    public void addThirdPlaceVote() {
        ++numThirdPlaceVotes;
    }

    public double getWeightedVotes() {
        double percent = (((numFirstPlaceVotes * .6 + numSecondPlaceVotes * .3 + numThirdPlaceVotes * .1) 
        / totalNumberOfVotes)*100);
        return (Math.round(percent*100) /100.0);
        
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName + " : ";
    }

    public int getNumFirstPlaceVotes() {
        return this.numFirstPlaceVotes;
    }

    public int getNumSecondPlaceVotes() {
        return this.numSecondPlaceVotes;
    }

    public int getNumThirdlaceVotes() {
        return this.numThirdPlaceVotes;
    }
}
