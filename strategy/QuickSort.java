
//Copyright 2025 Simion Cartis
import java.util.ArrayList;

public class QuickSort implements SortBehavior {
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        sort(appartments, 0, appartments.size() - 1);
        return appartments;
    }

    private static void sort(ArrayList<Appartment> appartments, int start, int end) {
        if (start >= end)
            return;
        int pivotIndex = partition(appartments, start, end);
        sort(appartments, start, pivotIndex - 1);
        sort(appartments, pivotIndex + 1, end);

    }

    private static int partition(ArrayList<Appartment> appartments, int start, int end) {
        Appartment pivot = appartments.get(end);
        int i = start;
        for (int j = start; j <= end; ++j) {
            if (appartments.get(j).compareTo(pivot) == 1) {
                Appartment temp = appartments.get(i);
                appartments.set(i, appartments.get(j));
                appartments.set(j, temp);
                ++i;
            }
        }
        Appartment temp = appartments.get(i);
        appartments.set(i, pivot);
        appartments.set(end, temp);
        return i;

    }
}
