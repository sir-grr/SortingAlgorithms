// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Random;
import sorts.*;
import sorts.bubbleSort;

public class mainClass {
    private static long stopwatch;
    public static void main(String[] args) {
        Random rng = new Random();
        //int[] numArray = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(1,300);
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        printNumList(list);
        startStopwatch();
        ArrayList<Integer> bubbleSortedlist = bubbleSort.sortArray(list);
        System.out.println("Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " milliseconds ");
        printNumList(bubbleSortedlist);
        
    }

    public static void startStopwatch(){
        stopwatch = System.currentTimeMillis();
    }

    public static long stopStopwatch(){
        stopwatch = System.currentTimeMillis() - stopwatch;
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