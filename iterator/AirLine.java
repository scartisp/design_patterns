import java.util.ArrayList;

public class Airline {
    private String title;
    private ArrayList<Flight> flights = FlightLoader.getFlights(); // ??????

    public Airline(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public FlightIterator createIterator(String fromCode, String toCode) {
        if (isValidAirport(fromCode, toCode)) {
            return new FlightIterator(this.flights, Airport.valueOf(fromCode.toUpperCase()),
                    Airport.valueOf(toCode.toUpperCase()));
        }
        System.out.println("must enter a valid Airport");
        return null;
    }

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