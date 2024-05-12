package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class bubbleSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        for(int n = 0; n< numList.size(); n++){
            //loop through list
            for(int i = 1; i< numList.size(); i++){
                //swap the previous number with this number if it is bigger
                if (numList.get(i-1) > numList.get(i)){
                    swap(numList, i-1, i);
                }
            }
        }
        return numList;
    }
}