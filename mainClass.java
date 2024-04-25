// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Random;
import sorts.*;

public class mainClass {
    private static long stopwatch;
    public static void main(String[] args) {
        Random rng = new Random();
        int[] numArray = {123, 426, 390, 621, 402,231,426,123};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(50000,100000);//10;
        
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        /*
        for (int num : numArray){
            list.add(num);
        }
        */
        sort[] sorts = {new stalinSort()/*,new newSort(),new modifiedSelectionSort(), new selectionSort(), new bubbleSort(), new improvedBubbleSort(), new testSort()*/};
        //printNumList(list);
        for(sort sort : sorts){
            //printNumList(list);
            //this is a prerun to ensure all classes are loaded etc
            ArrayList<Integer> sortingList = new ArrayList<>(list);
            sortingList = sort.sortArray(sortingList);
            //we run ten times and take an avg to get a more accurate result
            int runs = 1;
            startStopwatch();
            for(int i = 0; i <runs;i++){
                sortingList = new ArrayList<>(list);
                sortingList = sort.sortArray(sortingList);
            }
            System.out.println(sort.getClass().getName().substring(6) + " Sorted " + randomCount + " numbers\nin " + (stopStopwatch()/runs) + " nanoseconds ");
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