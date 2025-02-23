import java.time.LocalTime;

/**
 * class that makes a flight object which has a flight number, a to and from
 * airport, a start and end time, and a number of transitions
 * 
 * @author Simion Cartis
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransitions;

    /**
     * constructor that creates a flight object
     * 
     * @param flightNum      takes in a flight number of type string
     * @param from           takes in a from airport of the Airport (enum)
     * @param to             takes in a to airport of type Airport (enum)
     * @param startTime      takes in a start time of type LocalTime
     * @param endTime        takes in a end time of type LocalTime
     * @param numTransitions takes in the amount of transitions of type int
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransitions) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransitions = numTransitions;
    }

    /**
     * returns the from airport
     * 
     * @return returns the from airport of a flight
     */
    public Airport getFrom() {
        return this.from;
    }

    /**
     * returns the to aiport
     * 
     * @return returns the to aiport of a flight
     */
    public Airport getTo() {
        return this.to;
    }

    /**
     * checks if a flight has the same to and from airports as another flight
     * 
     * @param from takes in another flight's from airport
     * @param to   takes in another flight's to airport
     * @return returns true if the two flights have the same aiports, false if they
     *         don't
     */
    public boolean sameLoc(Airport from, Airport to) {
        if (this.from == from && this.to == to) {
            return true;
        }
        return false;
    }

    /**
     * @return returns the information that is within a Flight class in a string
     *         format
     */
    public String toString() {
        int totalHour = getTotalHour();
        int totalMin = getTotalMin();
        String TransOutput = (numTransitions == 1) ? this.numTransitions + " Stopover"
                : (numTransitions == 0) ? "Direct Flight" : this.numTransitions + " Transfers";

        return this.from + " to " + this.to + " " + this.startTime + " - " + this.endTime + " ("
                + totalHour + "h " + totalMin + "m) " + TransOutput;
    }

    /**
     * finds the difference between the start and end time's hour values,
     * 
     * @return returns the differnence between the start and end time's hour values
     */
    private int getTotalHour() {
        if (compareMin()) {
            return this.endTime.getHour() - (this.startTime.getHour() + 1);
        }
        return this.endTime.getHour() - this.startTime.getHour();
    }

    /**
     * finds the difffernce between the start and end time's minute values
     * 
     * @return return the difference between the start and end time's minute values
     */
    private int getTotalMin() {
        if (compareMin()) {
            return (this.endTime.getMinute() - this.startTime.getMinute()) + 60;
        }
        return this.endTime.getMinute() - this.startTime.getMinute();
    }

    /**
     * checks if the end time's minute value is less than the start time's minute
     * value
     * 
     * @return returns true if the end time's minute value is less than the start
     *         time's minute value (false if not)
     */
    private boolean compareMin() {
        if (this.endTime.getMinute() < this.startTime.getMinute()) {
            return true;
        }
        return false;
    }
}
