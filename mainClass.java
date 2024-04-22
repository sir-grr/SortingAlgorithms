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
        int randomCount = 10;//rng.nextInt(10);
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
    sort[] sorts = {new bubbleSort(), new improvedBubbleSort(), new selectionSort()/*, new testSort()*/};
        //printNumList(list);
        for(sort sort : sorts){
            printNumList(list);
            startStopwatch();
            ArrayList<Integer> sortingList = new ArrayList<>(list);
            sort.sortArray(sortingList);
            System.out.println(sort.getClass().getName().substring(6) + " Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " nanoseconds ");
            printNumList(sortingList);
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