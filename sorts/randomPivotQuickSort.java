package sorts;

import java.util.List;
import java.util.Random;

public class randomPivotQuickSort extends middlePivotQuickSort{
    @Override
    public int setPivot(List<Integer> numList){
        Random rng = new Random();
        //choose a random index in the list to use as a pivot 
        return rng.nextInt(numList.size());
    }

}
