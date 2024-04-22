// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Random;
import sorts.*;

public class mainClass {
    private static long stopwatch;
    public static void main(String[] args) {
        Random rng = new Random();
        //int[] numArray = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(1000,10000);
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        //printNumList(list);
        startStopwatch();
        ArrayList<Integer> bubbleSortedlist = bubbleSort.sortArray(list);
        System.out.println("bubbleSort Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " nanoseconds ");
        //printNumList(bubbleSortedlist);

        startStopwatch();
        ArrayList<Integer> imporvedBubbleSortedlist = improvedBubbleSort.sortArray(list);
        System.out.println("improvedBubbleSort Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " nanoseconds ");
        //printNumList(imporvedBubbleSortedlist);
        
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