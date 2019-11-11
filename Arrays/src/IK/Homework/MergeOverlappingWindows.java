package IK.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Given a set of time intervals in any order, merge all overlapping intervals into one and output the result which
 * should have only mutually exclusive intervals. Let the intervals be represented as pairs of integers for simplicity.
 * For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap
 * with each other, so they should be merged and become {1, 4}. Similarly {5, 7} and {6, 8} should be merged and become
 * {5, 8}
 * 
 * keypoints
 * 1. create a class
 * 2. Sort the intervals based on start
 */
public class MergeOverlappingWindows {

  static class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
      super();
      this.start = start;
      this.end = end;
    }

    @Override
    public String toString() {
      return "Interval [start=" + start + ", end=" + end + "]";
    }

  }

  public static void main(String[] args) {


//    Scanner scanner = new Scanner(System.in);
//    int numberofTCs = scanner.nextInt();
//    for (int i = 1; i <= numberofTCs; i++) {
//      int numberOfIntervals = scanner.nextInt();
//      List<Interval> inputIntervals = new ArrayList<Interval>();
//      for (int j = 0; j < numberOfIntervals; j++) {
//        inputIntervals.add(new Interval(scanner.nextInt(), scanner.nextInt()));        
//      }
//      OverlappingIntervals(inputIntervals);
//    }

     List<Interval> inputIntervals = new ArrayList<Interval>();
     inputIntervals.add(new Interval(10, 15));
     inputIntervals.add(new Interval(1, 3));
     inputIntervals.add(new Interval(6, 8));
     inputIntervals.add(new Interval(5, 7));
     inputIntervals.add(new Interval(2, 4));
     inputIntervals.add(new Interval(20, 40));
    
     OverlappingIntervals(inputIntervals);
  }

  private static void OverlappingIntervals(List<Interval> inputIntervals) {
    List<Interval> result = new ArrayList<Interval>();

    Collections.sort(inputIntervals, new Comparator<Interval>() {

      @Override
      public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
      }

    });
    Interval prev = inputIntervals.get(0);
    for (int i = 1; i < inputIntervals.size(); i++) {
      Interval cur = inputIntervals.get(i);
      if (cur.start > prev.end) {
        result.add(prev);
        prev = cur;
      } else {
        if (prev.end < cur.end)
          prev.end = cur.end;
      }

    }
    result.add(prev);
    StringBuilder sb = new StringBuilder();
    for(Interval inter : result) {
     
      sb.append(inter.start);
      sb.append(" ");
      sb.append(inter.end);
      sb.append(" ");
    }
    System.out.println(sb.toString() +" ");
  }



}
