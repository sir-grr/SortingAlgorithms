package sorts;

import java.util.ArrayList;
import java.util.List;

public class insertionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        doInsertionSort(numList);
        return numList;
    }

    private void doInsertionSort(ArrayList<Integer> numList){
        //loop through list
        for(int i = 1; i< numList.size(); i++){
            //add the number to the start part of this list
            addToSortedList(numList.remove(i),numList.subList(0, i));
        }
    }

    private void addToSortedList(int newNumber, List<Integer> sortedList) {
        int middleIndex = (sortedList.size()/2);//this will truncate not round up
        //because the start of the list is sorted we can go through it like a binary tree
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