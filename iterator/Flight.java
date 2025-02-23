import java.time.LocalTime;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransitions;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransitions) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransitions = numTransitions;
    }

    public Airport getFrom() {
        return this.from;
    }

    public Airport getTo() {
        return this.to;
    }

    public boolean sameLoc(Airport from, Airport to) {
        if (this.from == from && this.to == to) {
            return true;
        }
        return false;
    }

    public String toString() {
        int totalHour = getTotalHour();
        int totalMin = getTotalMin();
        String TransOutput = (numTransitions == 1) ? this.numTransitions + " Stopover"
                : (numTransitions == 0) ? "Direct Flight" : this.numTransitions + " Transfers";

        return this.from + " to " + this.to + " " + this.startTime + " - " + this.endTime + " ("
                + totalHour + "h " + totalMin + "m) " + TransOutput;
    }

    private int getTotalHour() {
        if (compareMin()) {
            return this.endTime.getHour() - (this.startTime.getHour() + 1);
        }
        return this.endTime.getHour() - this.startTime.getHour();
    }

    private int getTotalMin() {
        if (compareMin()) {
            return (this.endTime.getMinute() - this.startTime.getMinute()) + 60;
        }
        return this.endTime.getMinute() - this.startTime.getMinute();
    }

    private boolean compareMin() {
        if (this.endTime.getMinute() < this.startTime.getMinute()) {
            return true;
        }
        return false;
    }
}
