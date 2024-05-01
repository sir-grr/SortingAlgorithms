package sorts;

import java.util.ArrayList;
import java.util.List;

public class sort {
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        System.err.println("sort class ran where it shouldn't here");
        return numList;
    }

    public static void printNumList(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }

    
    public void swap(List<Integer> list ,int firstIndex, int secondIndex){//quick method to swap values based on their indexes
        //store first value
        int firstValue = list.get(firstIndex);
        //set first value in the list to second value
        list.set(firstIndex, list.get(secondIndex));
        //set second value in the list to first value we have stored
        list.set(secondIndex, firstValue);
    }
}
