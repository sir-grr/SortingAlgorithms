// bubblesort.java
//this is an example of bubblesort in Java 

import java.util.ArrayList;
import java.util.Random;

public class bubbleSort {
    private static long stopwatch;
    public static void main(String[] args) {
        Random rng = new Random();
        //int[] numArray = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int randomCount = rng.nextInt(1,54);
        for (int i = 0; i < randomCount;i++){
            list.add(rng.nextInt(1000));
        }
        //printNumList(list);
        startStopwatch();
        list = sortArray(list);
        System.out.println("Sorted " + randomCount + " numbers\nin " + stopStopwatch() + " milliseconds ");
        //printNumList(list);
        
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        boolean swapDone = false;
        do {
            swapDone = false;
            int lastNum = numList.get(0);
            for(int i = 1; i< numList.size(); i++){
                if (lastNum > numList.get(i)){
                    System.out.println("doing swap");
                    numList.remove(i-1);
                    numList.add(i, lastNum);
                    swapDone = true;
                }
                printNumList(numList);
                System.out.println("end of for");
                lastNum = numList.get(i);
            }
            System.out.println("end of while");
        } while(swapDone);
        return numList;
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