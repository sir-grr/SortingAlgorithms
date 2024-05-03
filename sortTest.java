// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import sorts.*;

public class sortTest {
    private static ArrayList<ArrayList<Integer>> testInputs = new ArrayList<>();

    public static void main(String[] args) {
        addData();
        //for each sort run tests
        sort[] sorts = {new modifiedSelectionSort(),new selectionSort(),new bubbleSort(),new improvedBubbleSort()};
        //printNumList(list);
        for(sort sort : sorts){
            test(sort);
        }

    }

    public static void test(sort sort){
        System.out.println("Testing " + sort.getClass().getName().substring(6));
            for(int i = 0; i < testInputs.size();i++){
                //we make a copy to ensure we aren't altering the actual data we need to use
                ArrayList<Integer> inputCopy = new ArrayList<>(testInputs.get(i));
                //we sort the copy
                inputCopy = sort.sortArray(inputCopy);
                //if it is sorted we publish a success
                if(isSorted(inputCopy)){
                    System.out.println("Test " + (i+1) + " passed, data sorted");
                } else { // otherwise a failure
                    System.out.println("Test " + (i+1) + " failed");
                    System.out.println("Actually recieved :");
                    printNumList(inputCopy);
                    System.out.println("Expected: ");
                    Collections.sort(inputCopy);//sort it to show expected value
                    printNumList(inputCopy);
                }
            }
    }

    public static boolean isSorted(ArrayList<Integer> unCheckedList){
        ArrayList<Integer> sortedList = new ArrayList<>(unCheckedList);
        Collections.sort(sortedList);
        if (unCheckedList.equals(sortedList)){
            return true;
        }else{
            return false;
        }
    }

    public static void addData(){
        //this just adds all the test dat i want, i suspect it could be more efficient though
        int[] test1Input = {123, 426, 390, 621, 402,231,426,123};//normal unordered data
        addDataNest(test1Input);

        int[] test2Input = {1,3,3,2,5};//almost ordered data
        addDataNest(test2Input);

        int[] test3Input = {0,0,1,3,4};//ordered data
        addDataNest(test3Input);

        int[] test4Input = {1,1,1,1,1,1,1,1,1};//matching data
        addDataNest(test4Input);

        int[] test5Input = {57};//1 piece of data
        addDataNest(test5Input);

        int[] test6Input = {};//no data
        addDataNest(test6Input);
        //test with random data
        Random rng = new Random();
        int randomCount = rng.nextInt(10,400);
        int[] test7Input = new int[randomCount];
        for (int i = 0; i < randomCount;i++){
            test7Input[i] = rng.nextInt(0,1000);
        }
        addDataNest(test7Input);
    }

    public static void addDataNest(int[] testInput){
        ArrayList<Integer> newInputList = new ArrayList<Integer>();
        
        for (int num : testInput){
            newInputList.add(num);
        }
        testInputs.add(newInputList);
    }

    public static void printNumList(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}