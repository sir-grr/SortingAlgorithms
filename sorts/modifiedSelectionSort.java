package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;

public class modifiedSelectionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        //printNumList(numList);
        //System.out.println("pre sort ^");
        //loop through list
        for(int i = 0; i< numList.size()-1-i; i++){
            int endI = numList.size()-1-i;
            int compareSmallNumIndex = i;
            int compareSmallNum = numList.get(i);
            int compareBigNumIndex = compareSmallNumIndex;
            int compareBigNum = compareSmallNum;
            //loop through all the numbers after this one and find the smallest to swap with
            for(int j = i+1; j <= endI; j++){
                if (compareSmallNum > numList.get(j)){
                    compareSmallNum = numList.get(j);
                    compareSmallNumIndex = j;
                } else if(compareBigNum < numList.get(j)){
                    compareBigNum = numList.get(j);
                    compareBigNumIndex = j;
                }
            }
            //place the smallest number at the start
            if (compareSmallNumIndex != i) {
                numList.add(i,numList.remove(compareSmallNumIndex));
            }
            //replace the end number with the biggest number
            if (compareBigNumIndex != endI) {
                if(compareSmallNumIndex > compareBigNumIndex){
                    compareBigNumIndex +=1;
                }
                if(i==0){//if we're on our first add it to the end of the list
                    numList.add(numList.remove(compareBigNumIndex));
                }else{
                    numList.add(endI,numList.remove(compareBigNumIndex));
                }
            }
            //printNumList(numList);

        }
        return numList;
    }
}