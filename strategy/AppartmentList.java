//Copyright 2025 Simion Cartis
import java.util.ArrayList;

public class AppartmentList {//dont need to implement SortBehavior?
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    public AppartmentList() {
        appartments = new ArrayList<Appartment>();
    }

    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        Appartment newAppartment = new Appartment(address, numBedrooms, numBathrooms, price);
        appartments.add(newAppartment);
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
        // ?????????
    }

    public ArrayList<Appartment> getSortedList() {
       if(sortBehavior == null){
        sortBehavior = new BubbleSort();
       }
       sortBehavior.sort(appartments);
       return appartments; //???????
        
    }

    public ArrayList<Appartment> getUnsortedList() {
        return appartments;

    }
}
