import java.util.Iterator;
import java.util.ArrayList;

public class FlightIterator {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    public boolean hasNext() {
        if (flights.get(position).sameLoc(from, to)) {
            return true;
        }
        return false;
    }

    public Flight next() {
        Flight flight = flights.get(position);
        for (int i = 0; i < flights.size(); ++i) {
            if (flights.get(i).sameLoc(from, to)) {
                position = position+i;
                break;
            }
        }
        return flight;
    }
    //
}
