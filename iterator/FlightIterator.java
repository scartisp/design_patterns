import java.util.Iterator;
import java.util.ArrayList;

public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    public boolean hasNext() {
        for (int i = position; i < flights.size(); ++i) {
            if (flights.get(i).sameLoc(from, to)) {
                position = i;
                return true;
            }
        }
        return false;

        // if (flights.get(position).sameLoc(from, to) && position < flights.size()
        // || flights.get(position) != null) {
        // return true;
        // }
        // return false;
    }

    public Flight next() {
        Flight flight = flights.get(position);
        ++position; 
        return flight;
    }
    // NO FUCKING CLUE BRO, for any of these methods

    // private void loop() {
    //     while (!hasNext()) {
    //         ++position;
    //     }
    // }
}
