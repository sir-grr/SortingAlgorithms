package sorts;

import java.util.ArrayList;

public class sort {
    public ArrayList<Integer> sortArray(ArrayList<Integer> numList){
        System.err.println("sort class ran where it shouldn't here");
        return numList;
    }

    public static void printNumList(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}
