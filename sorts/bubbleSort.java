package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        //this code is outdated and the sort is now run from mainClass
        /* 
        Random rng = new Random();
        //int[] numArray = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(1,54);
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        list = sortArray(list);
        */
    }
    

    public static ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        boolean swapDone = false;
        do {
            swapDone = false;
            int lastNum = numList.get(0);
            //loop through list
            for(int i = 1; i< numList.size(); i++){
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
        //if there was a swap loop through list again
        } while(swapDone);
        return numList;
    }
}