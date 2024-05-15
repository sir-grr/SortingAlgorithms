package sorts;

import java.util.ArrayList;
import java.util.List;

public class mergeSort extends sort{
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        if(numList.size()>1){
            doMergeSort(numList);
        }
        return numList;
    }

    private void doMergeSort(List<Integer> numList){
        //get list size
        int listSize = numList.size();
        if(listSize<=1){
            return;
        }
        //get middle of list so we can break it in half
        int midpoint = listSize/2;
        List<Integer> lList = numList.subList(0, midpoint);//create left partition
        List<Integer> rList = numList.subList(midpoint, listSize);//create right partition
        //further divide each
        doMergeSort(lList);
        doMergeSort(rList);
        doMerge(numList, lList, rList);
    }

    private void doMerge(List<Integer> parentList,List<Integer> lList,List<Integer> rList){
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

    }
}
