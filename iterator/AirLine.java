import java.util.ArrayList;

/**
 * creates an airline object with a title and an arraylist of flights
 * 
 * @author Simion Cartis
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights = FlightLoader.getFlights(); // ??????

    /**
     * constructor for the Airline class that defines the title of an airline
     * 
     * @param title takes in a title of type String
     */
    public Airline(String title) {
        this.title = title;
    }

    /**
     * returns the title of an airline
     * 
     * @return retuens the title of an airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * creates an iterator that parses through the arraylist of flights
     * 
     * @param fromCode takes in a from airport of a flight (as a String)
     * @param toCode   takes in a to aiport of a flight (as a String)
     * @return returns a FlightIterator (which parses through the arraylist of
     *         flights)
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        if (isValidAirport(fromCode, toCode)) {
            return new FlightIterator(this.flights, Airport.valueOf(fromCode.toUpperCase()),
                    Airport.valueOf(toCode.toUpperCase()));
        }
        System.out.println("must enter a valid Airport");
        return null;
    }

    /**
     * ensures that the to and from airports that are valid aiports
     * 
     * @param fromCode takes in a from aiport (as a String)
     * @param toCode   takes in a to aiport (as a String)
     * @return returns true if both airports are valid airports, false if either of
     *         them are not
     */
    private boolean isValidAirport(String fromCode, String toCode) {
        try {
            Airport airportFrom = Airport.valueOf(fromCode.toUpperCase());
        } catch (IllegalArgumentException e) {
            return false;
        }
        try {
            Airport airportTo = Airport.valueOf(toCode.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }

    }
}