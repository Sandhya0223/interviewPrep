package VMWare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(6);
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    subsetA(list);

  }

  public static List<Integer> subsetA(List<Integer> arr) {

    Collections.sort(arr);
    Collections.reverse(arr);
    int smallerSum = 0;
    int biggerSum = 0;
    List<Integer> smallerSumList= new ArrayList<Integer>();
    List<Integer> biggerSumList = new ArrayList<Integer>();
    
    for (int i = 0; i < arr.size(); i++) {
       biggerSumList.add(arr.get(i));
       biggerSum +=arr.get(i);
       
    }
      
      
    return biggerSumList;

  }
}
