/**
 * the interface for all classes that implement Subject and ensures they all
 * have the required methods
 * 
 * @author Simion Cartis
 */
public interface Subject {

    /**
     * ensures the StudentGovPoll class has a method that can add an observer to the
     * obeserver arrayList
     * 
     * @param obsever the observer that is being added to the arraylist
     */
    public void registerObserver(Observer obsever);

    /**
     * ensures the StudentGovPoll class has a method that can remove an observer to
     * the observer arrayList
     * 
     * @param observer the observer that is being removed
     */
    public void removeObserver(Observer observer);

    /**
     * ensures that the StudentGovPoll class has a method that can call on the
     * method to update the observers
     */
    public void notifyObservers();
}
