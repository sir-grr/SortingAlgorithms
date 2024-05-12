package sorts;

import java.util.ArrayList;

public class testSort extends sort {
    //this exists to test out changes to sorts
    @Override
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        System.out.println("in test sort");
        return numList;
    }
}