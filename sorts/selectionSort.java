package sorts;

import java.util.ArrayList;

public class selectionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        doSelectionSort(numList);
        return numList;
    }

    private void doSelectionSort(ArrayList<Integer> numList){
        //loop through list
        for(int i = 0; i< numList.size()-1; i++){
            int compareNum = numList.get(i);
            int compareNumIndex = i;
            //loop through all the numbers after this one and find the smallest to swap with
            for(int j = i+1; j< numList.size(); j++){
                if (compareNum > numList.get(j)){
                    compareNum = numList.get(j);
                    compareNumIndex = j;
                }
            }
            if (compareNumIndex != i) {
                swap(numList, i, compareNumIndex);
            }
        }
    }
}