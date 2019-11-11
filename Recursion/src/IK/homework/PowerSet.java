package IK.homework;

/*
 * int[] arr = {1,2,3,4,5} 
 * Subarray of size 3 : {1,2,3}, {2,3,4}, {3,4,5} - subarray means contiguous subarray
 * subsequence : {1,2,3}, {1,3,4}, {1,3,5}, {1,4,5} 
 * subset : {1},{2},{3},{4},{1, 2}, {1, 3},{1, 4},{2, 3}..etc
 * 
 * Power Set Power set P(S) of a set S is the set of all subsets of S if S has n elements in it then P(s) will have 2^n
 * elements
 */


public class PowerSet {

  public static void main(String[] args) {
    int[] arr = {1, 2,3};
    findPowerSet(arr);

  }

  private static void findPowerSet(int[] arr) {
    int[] subset = new int[arr.length];
    powersetHelper(arr,0,subset,0);
    
  }

  private static void powersetHelper(int[] arr, int index, int[] subset, int writeIndex) {
   if(index == arr.length) {
     System.out.print("{");
     for(int i=0;i<writeIndex;i++) {
       System.out.print(" "+subset[i]+" ");
     }
     System.out.print("}");
     System.out.println();
     return;
     
   }
     powersetHelper(arr,index+1,subset,writeIndex);
     subset[writeIndex] =arr[index];
     powersetHelper(arr,index+1,subset,writeIndex+1);
        
  }

}
