package sorts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class middlePivotQuickSort extends sort{
    /* Pivot is key to quicksort
         * every item to the left of a pivot should be smaller and every item to the right should be bigger
         * so find the pivot, move it to the end
         * have a left and right pointer
         * increment the left if it's on a value smaller than the pivot
         * increment the right if it's on a value bigger than the pivot (this will be negative)
         * swap them if both are their relative need (right smaller, left bigger)
         * increment until left pointer is higher than right pointer
         * at this point swap the item from left pointer with the pivot
         * this places the pivot in the correct spot for the final list, all items to the left are smaller and all to the right are bigger
         * then both sides of the pivot becoome partitions and we give each of those a pivot and do this again
         * 
         * how do we choose which number is the pivot for maximal performance
         * here are some options
         * median of three:
         * grab the first, middle, and last item in the list and then order them
         * aka the mid is in the middle and the largest and smallest are in there respective spots then 
         * make the middle the pivot, this is basically guessing that the middle of these three is close to the median of the list
         * 
         * middle choice:
         * this is sort of the standard way to do it 
         * 
         * random choice:
         * this has issues but has a chance of being faster
         * 
         * We will do an example with each
         */
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        quickSort(numList);
        return numList;
    }
    public void quickSort(List<Integer> numList){
        if(numList.size() >1){
            //find pivot
            int pivotIndex = partition(numList);

            //not there is no reason to include the pivot in these sorts as it's in the right place
            //sort the left partition
            quickSort(numList.subList(0, pivotIndex));
            //sort the right partition
            quickSort(numList.subList(pivotIndex+1, numList.size()));
        }
    }
    

    public int partition(List<Integer> numList){
        //set the pivot
        int pivotIndex = numList.size()/2;
        //set the left and right pointers to as far as they need to be
        int fromLeftIndex = 0;
        int fromRightIndex = numList.size()-2;//-2 to avoid the pivot
        //get the value of the pivot for comparisons
        int pivotValue = numList.get(pivotIndex);
        numList.add(numList.remove(pivotIndex));//move pivot to the end of the list

        //until the left pointer has passed the right pointer
        while (fromLeftIndex <= fromRightIndex){
            //increment left if it's lower than pivot
            if(numList.get(fromLeftIndex) <= pivotValue){
                fromLeftIndex++; 
            //increment right if it's higher than pivot
            } else if (numList.get(fromRightIndex) >= pivotValue){
                fromRightIndex--;
            //if left is higher than pivot and right lower
            }else{
                //swap left and right
                swap(numList, fromRightIndex, fromLeftIndex);
                //and keep em moving
                fromLeftIndex++;
                fromRightIndex--;
            }
        }
        //swap leftIndex with the pivot
        swap(numList, numList.size()-1, fromLeftIndex);
        //return left index as that's now where the pivot is
        return fromLeftIndex;
    }




}
