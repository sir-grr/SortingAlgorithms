// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Random;
import sorts.*;

public class mainClass {
    private static long stopwatch;
    public static void main(String[] args) {
        Random rng = new Random();
        int[] numArray = {250, 332, 388, 475, 503, 543, 609, 591, 963, 961};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(1,100030);//10;
        
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        /*
        for (int num : numArray){
            list.add(num);
        }
        */
        sort[] sorts = {new modifiedSelectionSort(), new selectionSort()/* new bubbleSort(), new improvedBubbleSort(), new testSort()*/};
        //printNumList(list);
        for(sort sort : sorts){
            //printNumList(list);
            startStopwatch();
            ArrayList<Integer> sortingList = new ArrayList<>(list);
            sort.sortArray(sortingList);
            System.out.println(sort.getClass().getName().substring(6) + " Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " nanoseconds ");
            //printNumList(sortingList);
            System.out.println();
        }

    }

    public static void startStopwatch(){
        stopwatch = System.nanoTime();
    }

    public static long stopStopwatch(){
        stopwatch = System.nanoTime() - stopwatch;
        return stopwatch;
    }

    public static void printNumList(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}