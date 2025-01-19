
import java.util.ArrayList;

//Copyright 2025 Simion Cartis

/**
 * creates add, sort, and get functionalities
 * to an ArrayList of type Appartment
 * @author Simion Cartis 
 */
public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    /**
     * initializes the AppartmentList
     */
    public AppartmentList() {
        appartments = new ArrayList<Appartment>();
    }

    /**
     * creates the functionality of adding to the ArrayList
     * @param address the name of the apparmtent
     * @param numBedrooms number of bedrooms it has
     * @param numBathrooms number of bathrooms it has
     * @param price the price of it
     */
    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        Appartment newAppartment = new Appartment(address, numBedrooms, numBathrooms, price);
        appartments.add(newAppartment);
    }

    /**
     * creates functionality of chosing from 
     * the sorting method classes
     * @param sortBehavior an instance of the interface SortBehavior
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    /**
     * choses the defualt sorted method and sorts the ArrayList
     * @return returns a sorted ArrayList of type Appartment
     */
    public ArrayList<Appartment> getSortedList() {
        if (sortBehavior == null) {
            sortBehavior = new BubbleSort();
        }
        sortBehavior.sort(appartments);
        return appartments;
    }

    /**
     * gets the unsorted arrayList
     * @return returns the ArrayList of type Appartment
     * without altering it
     */
    public ArrayList<Appartment> getUnsortedList() {
        return appartments;
    }
}
