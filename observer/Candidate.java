/**
 * Creates an object named Candidate which has a total number of votes integer,
 * a first and last name, and first, second, and third place votes
 * 
 * @author Simion Cartis
 */
public class Candidate {
    public static int totalNumberOfVotes;
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes;
    private int numSecondPlaceVotes;
    private int numThirdPlaceVotes;

    /**
     * constructs a new Candidate with a first and last name
     * 
     * @param firstName the first name for the new instance variable
     * @param lastName  the last name for the new instance variable
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * checks if a Candidate object has the same first and last name as an inputed
     * first and last name
     * 
     * @param firstName the inputed first name that is being checked against the
     *                  instance variable's first name
     * @param lastName  the inputed last name that is being checked against the
     *                  instance variable's last name
     * @return return true if both the first and last names are the same, false if
     *         they are not
     */
    public boolean equals(String firstName, String lastName) {
        if (this.firstName.equalsIgnoreCase(firstName) && this.lastName.equalsIgnoreCase(lastName)) {
            return true;
        }
        return false;
    }

    /**
     * adds to the total number of votes
     */
    public static void addVote() {
        ++totalNumberOfVotes;
    }

    /**
     * adds to the total number of first place votes
     */
    public void addFirstPlaceVote() {
        ++numFirstPlaceVotes;
    }

    /**
     * adds to the total number of second place votes
     */
    public void addSecondPlaceVote() {
        ++numSecondPlaceVotes;
    }

    /**
     * adds to the total number of third place votes
     */
    public void addThirdPlaceVote() {
        ++numThirdPlaceVotes;
    }

    /**
     * finds the weighted percent of votes each candidate has (to the nearest hundredth)
     * first place votes are 60%, second place is 30%, third place is 10% of total percentage
     * @return returns the calculated weighed percentage (to the nearest hundredth)
     */
    public double getWeightedVotes() {
        double percent = (((numFirstPlaceVotes * .6 + numSecondPlaceVotes * .3 + numThirdPlaceVotes * .1)
                / totalNumberOfVotes) * 100);
        return (Math.round(percent * 100) / 100.0);

    }

    /**
     * returns the full name of a Candidate as a string
     * @return the first and last name of the candidate
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName + " : ";
    }

    /**
     * returns the number of first place votes for a candidate
     * @return integer value of the number of first place votes
     */
    public int getNumFirstPlaceVotes() {
        return this.numFirstPlaceVotes;
    }

    /**
    * returns the number of second place votes for a candidate
    * @return integer value of the number of second place votes
    */
    public int getNumSecondPlaceVotes() {
        return this.numSecondPlaceVotes;
    }

    /**
     * returns the number of third place votes for a candidate
     * @return integer value of the number of third place votes
     */
    public int getNumThirdlaceVotes() {
        return this.numThirdPlaceVotes;
    }
}
