package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class stalinSort extends sort{
    //this sort is fast but far to brutal with data loss for actul use
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        //printNumList(numList);
        //loop through list
        int compareNum = numList.get(0);
        //loop through every number after the first
        for(int i = 1; i< numList.size(); i++){
            //if the number is smaller than the numbers behind it remove it 
            if (numList.get(i) < compareNum) {
                numList.remove(i);
                i--;
            }else{ // if not make it the new number we're comparing to
                compareNum = numList.get(i);
            }

            
        }
        //printNumList(numList);
        return numList;
    }
}