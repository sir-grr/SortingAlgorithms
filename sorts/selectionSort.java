package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class selectionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        //printNumList(numList);
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

            //printNumList(numList);
        }
        return numList;
    }
}