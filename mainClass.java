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
        sort[] sorts = {new bubbleSort(), new improvedBubbleSort()};
        //printNumList(list);
        for(sort sort : sorts){
            startStopwatch();
            ArrayList<Integer> sortedlist = sort.sortArray(list);
            System.out.println(sort.getClass().getName().substring(6) + " Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " nanoseconds ");
            //printNumList(sortedlist);
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