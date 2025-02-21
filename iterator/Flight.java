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
        if (this.from == this.to) {
            return true;
        }
        return false;
    }

    public String toString() {
        int totalHour = this.endTime.getHour() - this.startTime.getHour();
        int totalMin = this.endTime.getMinute() - this.startTime.getMinute();
        String TransOutput = (numTransitions == 1) ? this.numTransitions + " Stopovers"
                : (numTransitions == 0) ? "Direct Flight" : this.numTransitions + " Transfers";

        return this.from + " " + this.to + " " + this.startTime + " - " + this.endTime + " ("
                + totalHour + "h " + totalMin + "m) " + TransOutput;
    }
}
