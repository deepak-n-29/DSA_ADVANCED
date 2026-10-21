// Given an array and a target sum, count how many subsets have exactly that sum.
// Example:
    // arr = {10, 5, 2, 3, 6}
    // target = 8
    // Valid subsets:
        // {5, 3} = 8
        // {2, 6} = 8
        // So answer = 2.

public class subsetSum {
    
    public int countSubsets(int[] arr, int n,int target) {
        if(n == 0) 
            return (target==0) ? 1 : 0;
        return countSubsets(arr,n-1,target) + countSubsets(arr,n-1,target-arr[n-1]);
    }
    public static void main(String[] args) {
        
        int[] arr = {10, 5, 2, 3, 6};
        int n = arr.length;
        int target = 8;
        subsetSum ss = new subsetSum();
        System.out.println(ss.countSubsets(arr,n,target));
    }
}
