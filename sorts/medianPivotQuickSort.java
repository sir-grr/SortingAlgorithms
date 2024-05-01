package sorts;

import java.util.ArrayList;

public class medianPivotQuickSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        /* Pivot is key to quicksort
         * every item to the left of a pivot should be smaller and every item to the right should be bigger
         * so find the first pivot, move it to the end
         * and then go through the list from the left of the pivot to find 
         * a value bigger than the pivot and do the inverse from the rigth
         * then swap the values and keep doing this until the index of the left value 
         * is bigger than the index of the right value
         * at this point swap the item from left with the pivot
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
         * random choice:
         * This is easier and less complex in the code but ultimately will give a pretty random result
         * 
         * We will do an example with both
         */
        return numList;
    }
}
