//Copyright 2025 Simion Cartis
import java.util.ArrayList;

public class BubbleSort implements SortBehavior{

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