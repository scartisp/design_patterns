import java.util.ArrayList;

//Copyright 2025 Simion Cartis

/**
 * class that implements SortBehavior
 * uses bubbleSort to sort from greatest to least
 * @author Simion Cartis
 */
public class BubbleSort implements SortBehavior{

    /**
     * sorts the list via the bubbleSort method
     * @param appartments an ArrayList of type Appartment
     * @return  returns a greatest to least sorted ArrayList 
     * of type Appartment
     */
     public ArrayList<Appartment> sort(ArrayList<Appartment> appartments){
        boolean hasSwapped = true;
        while(hasSwapped){
            hasSwapped = false;
            for(int i = 0; i< appartments.size()-1; ++i){
                if(appartments.get(i).compareTo(appartments.get(i+1)) == 1){
                    Appartment temp = appartments.get(i);
                    appartments.set(i, appartments.get(i+1));
                    appartments.set(i+1, temp);
                    hasSwapped = true;
                }
            }
        }
        return appartments;
    }
}