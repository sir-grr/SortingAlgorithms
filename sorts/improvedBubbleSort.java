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
            int lastNum = numList.get(0);
            //loop through list
            for(int i = 1; i< numList.size()-safeNums; i++){
                //swap the previous number with this number if it is bigger
                if (lastNum > numList.get(i)){
                    numList.remove(i-1);
                    numList.add(i, lastNum);
                    swapDone = true;
                }
                //System.out.println("end of for");
                lastNum = numList.get(i);
            }
            //System.out.println("end of while");
        safeNums+=1;//ignore an extra number at the end of the loop
        //if there was a swap loop through list again
        } while(swapDone);
        return numList;
    }
}