import java.util.Iterator;
import java.util.ArrayList;

/**
 * creates an iterator for the arrayList of flights. Ensures that the arrayList
 * has more flights with the same to and from aiports
 * 
 * @author Simion Cartis
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * constructor that creates the flight iterator with an Arraylist of flights,
     * and a to and from Aiport
     * 
     * @param flights takes in an arrayList of type flights
     * @param from    takes in a from aiport of type Airport (enum)
     * @param to      takes in a to aiport of type Airport (enum)
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    /**
     * checks to see if the arraylist has another flight with the same to and from
     * aiports as a specified one
     * 
     * @return returns true if there is another flight with the same airports, false
     *         if not
     */
    public boolean hasNext() {
        for (int i = position; i < flights.size(); ++i) {
            if (flights.get(i).sameLoc(from, to)) {
                position = i;
                return true;
            }
        }
        return false;
    }

    /**
     * returns the flight at the current position index of the Arraylist and
     * incrimiates the position by one
     * 
     * @return returns the flight at the current position index of the Arraylist
     */
    public Flight next() {
        Flight flight = flights.get(position);
        ++position;
        return flight;
    }
}
