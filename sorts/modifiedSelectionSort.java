package sorts;

import java.util.ArrayList;

public class modifiedSelectionSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        doSelectionSort(numList);
        return numList;
    }

    private void doSelectionSort(ArrayList<Integer> numList){
        //loop through list
        for(int i = 0; i<= numList.size()-1-i; i++){
            int endI = numList.size()-1-i;//end of the list
            int compareSmallNumIndex = i;//set the current smallest number to the first num
            int compareSmallNum = numList.get(compareSmallNumIndex);
            int compareBigNumIndex = endI;//set the biggest to the end one
            int compareBigNum = numList.get(compareBigNumIndex);
            //loop through all the numbers after this one and find the smallest and biggest
            for(int j = i; j <= endI; j++){
                //if it's the smallest not the value and index
                if (compareSmallNum > numList.get(j)){
                    compareSmallNum = numList.get(j);
                    compareSmallNumIndex = j;//smallest
                } else if(compareBigNum < numList.get(j)){//do the same if it's the largest
                    compareBigNum = numList.get(j);
                    compareBigNumIndex = j;//biggest
                }
            }
            //swap the smallest number with the number at the start
            swap(numList, i, compareSmallNumIndex);

            //if big number has moved aka was the starting smallest number
            if(compareBigNumIndex==i){
                //swap the end number with the new location of big number
                swap(numList, endI, compareSmallNumIndex);
            }else{
                //swap the end number with the biggest number
                swap(numList,endI, compareBigNumIndex);
            }

        }
    }
}