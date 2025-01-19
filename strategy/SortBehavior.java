import java.util.ArrayList;

//Copyright 2025 Simion Cartis

/**
 * interface that ensures sorting classes that implement it 
 * have a method named "sort" 
 * @auther Simion Cartis
 */
public interface SortBehavior{

    /**
 * sorts the ListArray by the given method used in the class
 * that implements this interface
 * @param appartment an ArrayList of type Appartment
 * @return returns an Arraylist of type Appartment
 * which is sorted by the desired class (QuickSort or BubbleSort)
 */
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartment);
}