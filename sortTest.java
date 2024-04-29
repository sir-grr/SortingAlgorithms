// mainClass.java
//this is an where we can run all our sorts from 

import java.util.ArrayList;
import java.util.Random;

import sorts.*;

public class sortTest {
    private static ArrayList<ArrayList<Integer>> testInputs = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> testExpectedOutputs = new ArrayList<>();

    public static void main(String[] args) {
        addData();
        //for each sort run tests
    sort[] sorts = {new randomisedInsertionSort()/*,new stalinSort(),new insertionSort(),new modifiedSelectionSort()*/, new selectionSort(),/*new bubbleSort(), new improvedBubbleSort()/* , new testSort()*/};
        //printNumList(list);
        for(sort sort : sorts){
            System.out.println("Testing " + sort.getClass().getName().substring(6));
            for(int i = 0; i < testInputs.size();i++){
                //we make a copy to ensure we aren't altering the actual data we need to use
                ArrayList<Integer> inputCopy = new ArrayList<>(testInputs.get(i));
                inputCopy = sort.sortArray(inputCopy);
                //if it equals test data, is success
                if(inputCopy.equals(testExpectedOutputs.get(i))){
                    System.out.println("Test " + (i+1) + " passed, data sorted");
                } else {
                    System.out.println("Test " + (i+1) + " failed, Expected:");
                    printNumList(testExpectedOutputs.get(i));
                    System.out.println("Actually recieved :");
                    printNumList(inputCopy);
                }
            }
        }

    }

    public static void addData(){
        int[] test1Input = {123, 426, 390, 621, 402,231,426,123};
        int[] test1Output = {123, 123, 231, 390, 402, 426, 426, 621};
        addDataNest(test1Input, test1Output);

        int[] test2Input = {1,3,3,2,5};
        int[] test2Output = {1,2,3,3,5};
        addDataNest(test2Input, test2Output);

        int[] test3Input = {1,0,0,3,4};
        int[] test3Output = {0,0,1,3,4};
        addDataNest(test3Input, test3Output);

        int[] test4Input = {1,1,1,1,1,1,1,1,1};
        int[] test4Output = {1,1,1,1,1,1,1,1,1};
        addDataNest(test4Input, test4Output);
    }

    public static void addDataNest(int[] testInput,int[] testOutput){
        ArrayList<Integer> newInputList = new ArrayList<Integer>();
        ArrayList<Integer> newOutputList = new ArrayList<Integer>();
        
        for (int num : testInput){
            newInputList.add(num);
        }
        for (int num : testOutput){
            newOutputList.add(num);
        }
        testInputs.add(newInputList);
        testExpectedOutputs.add(newOutputList);
    }



    public static void printNumList(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}