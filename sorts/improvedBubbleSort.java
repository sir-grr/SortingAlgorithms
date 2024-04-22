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
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        int lastNum = 0;
        //loop through list
        for(int i = 1; i< numList.size(); i++){
            lastNum = numList.get(i-1);
            //swap the previous number with this number if it is bigger
            if (lastNum > numList.get(i)){
                numList.remove(i-1);
                numList.add(i, lastNum);
                //if there is a swap go back to the start of the list
                i = 0;
            }
            //System.out.println("end of for");
        }
        return numList;
    }
}