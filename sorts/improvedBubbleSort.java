package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class improvedBubbleSort extends sort {
    //this should be slightly faster than a reguar bubble sort as it ignores the end of the list as the biggest should always move to the end
    //I may try and write a two directional bubble sort, this may be what shaker sort is
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        boolean swapDone;
        int safeNums = 0;
        do {
            swapDone = false;
            //loop through list
            for(int i = 0; i< numList.size()-safeNums-1; i++){
                //swap the next number with this number if it is smaller
                if (numList.get(i+1) < numList.get(i)){
                    swap(numList, i+1, i);
                    swapDone = true;
                }
            }
        safeNums++;//ignore an extra number at the end of the loop
        //if there was a swap loop through list again
        } while(swapDone);
        return numList;
    }
}