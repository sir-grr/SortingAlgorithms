package sorts;

import java.util.List;

public class medianPivotQuickSort extends middlePivotQuickSort{
    @Override
    public int setPivot(List<Integer> numList){
        //get indexes of the middle start and final value
        int middleIndex = numList.size()/2;
        int endIndex = numList.size()-1;
        int startIndex = 0;
        //order them in the list
        if(numList.get(startIndex)>numList.get(middleIndex)){
            swap(numList, startIndex, middleIndex);
        }
        if(numList.get(middleIndex)>numList.get(endIndex)){
            swap(numList, endIndex, middleIndex);
            if (numList.get(middleIndex)<numList.get(startIndex)) {
                swap(numList, middleIndex, startIndex);
            }
        }
        //still use the middle 
        return middleIndex;
    }

}
