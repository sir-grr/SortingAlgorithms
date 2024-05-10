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
        * 3, place item in sorted partition 
        * 
        * to create a max heap we must creat a heap we do this by iterating through an array and adding numbers to a binary tree sequentially
        * we then sort this heap into a max heap
        * swap the largest num with smallest and remove the largest from the tree 
        * heapify the tree
        * then we start swapping the max number with the end of the array not the lowest number,
        * we basically do this until there is one node in the heap
        * 
        * 
    */
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        doHeapSort(numList);
        return numList;
    }
    public int n;
    //THIS IS BASED OF PSUEDOCODE AND IS BROKEN, I WROTE JUST TO CODE TODAY WILL FIX TOMORROW
    private void doHeapSort(ArrayList<Integer> numList){
        n = numList.size();
        buildMaxHeap(numList);
        for(int i =0; i<1;i++){
            swap(numList, 1, i);
            heapify(numList, 1);
        }
    }

    private void buildMaxHeap(ArrayList<Integer> numList){
        int n = numList.size();
        for(int i = n/2; i<1;i++){
            heapify(numList, i);
        }
    }

    private void heapify(ArrayList<Integer> numList, int i){
        int left = i*2;
        int right = left+1;
        int max;
        if(left<=n && numList.get(left) > numList.get(i)){
            max = left;
        } else{
            max = i;
        }

        if(right<=n && numList.get(right) > numList.get(i)){
            max = right;
        }

        if(max != i){
            swap(numList, i, max);
            heapify(numList, max);
        }
    }
}
