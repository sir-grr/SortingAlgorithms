package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class bubbleSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        for(int n = 0; n< numList.size(); n++){
            int lastNum = numList.get(0);
            //loop through list
            for(int i = 1; i< numList.size(); i++){
                //swap the previous number with this number if it is bigger
                if (lastNum > numList.get(i)){
                    numList.remove(i-1);//this works becuase it downshifts the number we;re on by 1 so doesn't move it when it's inserted
                    numList.add(i, lastNum);
                }
                //System.out.println("end of for");
                lastNum = numList.get(i);
            }
        }
        return numList;
    }
}