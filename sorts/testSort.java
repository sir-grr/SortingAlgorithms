package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class testSort extends sort {
    //this exists to test out changes to sorts
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        System.out.println("in test sort");
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
            printNumList(numList);
            //System.out.println("end of for");
        }
        return numList;
    }
}