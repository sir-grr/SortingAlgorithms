package sorts;

import java.util.ArrayList;
import java.util.List;

public class mergeSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        if(numList.size()>1){
            //we do a lot of passsing back up so we have to at the very end, we convert back to arraylist cause we use the raw list type a lot for sublist here
            numList = new ArrayList<Integer>(doMergeSort(numList));
        }
        return numList;
    }

    private List<Integer> doMergeSort(List<Integer> numList){
        //get list size
        //if their is 1 or less value in the list just return it
        int listSize = numList.size();
        if(listSize<=1){
            return numList;
        }
        //get middle of list so we can break it in half
        int midpoint = listSize/2;
        //treat each half as new lists which don't alter the parent
        List<Integer> lList = new ArrayList<>(numList.subList(0, midpoint));//create left partition
        List<Integer> rList = new ArrayList<>(numList.subList(midpoint, listSize));//create right partition
        //further divide each and merge sort them
        lList = doMergeSort(lList);
        rList = doMergeSort(rList);
        //merge back into the parent
        return doMerge(new ArrayList<>(numList), lList, rList);
    }

    private List<Integer> doMerge(List<Integer> parentList,List<Integer> lList,List<Integer> rList){
        int p=0,l=0,r=0;//these are the indices we are using to track through our lists
        //while there are still elements left in each list
        while (l < lList.size() && r < rList.size()) {
            //pick the smallest at the front and put it in the parent list
            if(lList.get(l) < rList.get(r)){
                parentList.set(p,lList.get(l));
                l++;
            }else{
                parentList.set(p,rList.get(r));
                r++;
            }
            p++;
        }
        //only one of these two will run because one list is run empty
        //add any remaining in the left list
        for (;l<lList.size();l++,p++){
            parentList.set(p, lList.get(l));
        }
        //add any remaining in the right list
        for (;r<rList.size();r++,p++){
            parentList.set(p, rList.get(r));
        }
        //return the sorted parent
        return parentList;

    }
}
