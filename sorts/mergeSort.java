package sorts;

import java.util.ArrayList;

public class mergeSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        doMergeSort(numList);
        return numList;
    }

    private void doMergeSort(ArrayList<Integer> numList){
        System.out.println("in doMergeSort");
    }
}
