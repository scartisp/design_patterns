
import java.util.ArrayList;

//Copyright 2025 Simion Cartis

/**
 * class that implements SortBehavior
 * uses quickSort to sort from least to greatest
 * @auther Simion Cartis
 */
public class QuickSort implements SortBehavior {

    /**
     * calls the recursive sort method
     * @param appartments an ArrayList of type Appartment
     * @return a lest to greatest sorted ArrayList 
     * of type Appartment
     */
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartment) {
        sort(appartment, 0, appartment.size() - 1);
        return appartment;
    }

    /**
     * the recurssive method for quickSort
     * @param appartments an ArrayList of type Appartment
     * @param start the beginning index of the section for the 
     * ArrayList you are sorting
     * @param end the last index of the section for the ArrayList
     * you are sorting
     */
    private static void sort(ArrayList<Appartment> appartment, int start, int end) {
        if (start >= end)
            return;
        int pivotIndex = partition(appartment, start, end);
        sort(appartment, start, pivotIndex - 1);
        sort(appartment, pivotIndex + 1, end);

    }

    /**
     * method that choses the pivot for quick sort
     * and ensures its position is correct within the list
     * @param appartments an ArrayList of type Appartment
     * @param start the beginning index of the section for the 
     * ArrayList you are sorting
     * @param end the last index of the section for the ArrayList
     * you are sorting
     * @return an integer that correlates with the location of the
     * pivot index which has been correctly sorted in the ArrayList
     */
    private static int partition(ArrayList<Appartment> appartment, int start, int end) {
        Appartment pivot = appartment.get(end);
        int i = start;
        for (int j = start; j <= end; ++j) {
            if (appartment.get(j).compareTo(pivot) == 1) {
                Appartment temp = appartment.get(i);
                appartment.set(i, appartment.get(j));
                appartment.set(j, temp);
                ++i;
            }
        }
        Appartment temp = appartment.get(i);
        appartment.set(i, pivot);
        appartment.set(end, temp);
        return i;

    }
}
