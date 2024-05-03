package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class improvedBubbleSort extends sort {
    //this should be slightly faster than a reguar bubble sort
    //it checks al the way up to where a swap is needed and then starts at the beginning of the list instead of continuing through the list
    //this can be slower when less swaps are needed but as more are needed it gets considerably faster
    //this sorts in both directions at once by returning to the start meaning it's not only pushing big numbers to the back it's intentionally dragging small numbers to the front unlike a typical bubblesort
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        boolean swapDone = false;
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
            //System.out.println("end of while");
        safeNums+=1;//ignore an extra number at the end of the loop
        //if there was a swap loop through list again
        } while(swapDone);
        return numList;
    }
}