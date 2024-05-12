package sorts;

import java.util.ArrayList;

public class heapSort extends sort{
    //heapsort 
    /*Takes an array and converts it into a max heap, 
        * this is a binary tree where all the number in a node above is bigger than the number in a node below
        * and this is true in all cases
        * 
        * the heapsort essentially works by iterating through,
        * 1,create max heap
        * 2, remove largest item (top node)
        * 3, place item at the end as sorted
        * 
        * 
        * 
    */
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        //check the list has more than 1 value in it otherwise don't bother sorting
        if (numList.size()<2) {
            return numList;
        }
        doHeapSort(numList);
        return numList;
    }
    //used a global var cause we decrement adjust and use it in two methods, could have passed it back and fourth but as it's primitive easier to do this.
    private int n;//=number of unsorted values
    //the parent of a node = (indexofnode-1)/2
    private void doHeapSort(ArrayList<Integer> numList){
        //set number of unsorted values
        n = numList.size()-1;
        //while we have unsorted values
        while(n>0){
            //build a max heap and thrw the max to the end
            maxHeapify(numList);
        }
    }

    private void maxHeapify(ArrayList<Integer> numList){
        //start from the end of the unsorted values and work to the front
        for(int childIndex = n; childIndex>0;childIndex--){
            //the position of a parent node is always this
            int parentIndex = (childIndex-1)/2;
            //if the child is bigger than the parent swap them to build a max heap
            if(numList.get(childIndex) > numList.get(parentIndex)){
                swap(numList, childIndex, parentIndex);
            }
        }
        //put the biggest number (top of max heap) at the end of the unsorted list
        swap(numList, 0, n);
        //reduce the amount of unsorted values
        n--;
    }
}
