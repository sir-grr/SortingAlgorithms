package sorts;
// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
//import java.util.Random;
import java.util.List;

public class insertionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        //printNumList(numList);
        //System.out.println("pre sort ^");
        List<Integer> sortedList = new ArrayList<Integer>();
        //loop through list
        for(int i = 0; i< numList.size(); i++){
            if(i==0){
                sortedList.add(numList.get(i));
            }
            else{
               addToSortedList(numList.get(i),sortedList);
            }

            //printNumList(new ArrayList<Integer>(sortedList));
        }
        numList = new ArrayList<Integer>(sortedList);
        return numList;
    }

    private void addToSortedList(int newNumber, List<Integer> sortedList) {
        int middleIndex = (sortedList.size()/2);//this will truncate not round up
        if(newNumber > sortedList.get(middleIndex)){
            if(middleIndex != sortedList.size()-1){
                addToSortedList(newNumber, (sortedList.subList(middleIndex+1, sortedList.size())));
            } else{
                sortedList.add(newNumber);
            }
        } else if(newNumber < sortedList.get(middleIndex)){
            if(middleIndex != 0 ){
                addToSortedList(newNumber, (sortedList.subList(0,middleIndex)));
            } else{
                sortedList.add(0,newNumber);
            }
        } else{
            sortedList.add(middleIndex,newNumber);
        }
    }
}