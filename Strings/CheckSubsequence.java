package DSA_Advanced.Strings;
/* A subsequence of a string is a sequence that can be derived from the given string
by deleting zero or more elements without changing the order of the remaining elements

S = "ABC"
subsequences = "","A","B","C","AB","AC","BC","ABC" - 2^n where n - s.length

No of subsequence of an array is 2^n

*/

//O(2^n * m) n-length large string, m - length of small string

//Problem Statement - is String2 subsequence of string1
public class CheckSubsequence {

    boolean isSubSeq(String s1, String s2, int n, int m){  //tc: O(n+m) AS: O(1)
        if(n<m) return false;
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(s1.charAt(i)==s2.charAt(j)){
               j++;
            }
        }
        return (j==m);
    }

    boolean isSubSeqRec(String s1, String s2, int n, int m){//tc: O(n+m) AS: O(n+m)
        if(m==0) return true;
        if(n==0) return false; // order matters for if condition for n&m

        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return isSubSeqRec(s1, s2, n-1, m-1);
        }
        else{
            return isSubSeqRec(s1, s2, n-1, m);
        }
    }
    /*
    isSSR("ABC","AC", 3, 2) -^TRUE
    \->    isSSR("ABC","AC", 2, 1)  -^TRUE
       \->     isSSR("ABC","AC", 1, 1)  -^TRUE
          \->      isSSR("ABC","AC", 0, 0) -^TRUE
     */


    public static void main(String[] args){
        CheckSubsequence cs = new CheckSubsequence();
        String s1 = "GEEKSFORGEEKS";
        String s2 = "GRGES";
        int n = s1.length();
        int m = s2.length();
        if(cs.isSubSeq(s1,s2,n,m)){
            System.out.println("Is a Subsequence");
        }
        else{
            System.out.println("Not a Subsequence");
        }

        String s3 = "ABC";
        String s4 = "AC";
        int n1 = s3.length();
        int m1 = s4.length();
        if(cs.isSubSeqRec(s3,s4,n1,m1)){
            System.out.println("Is a Subsequence");
        }
        else{
            System.out.println("Not a Subsequence");
        }



    }
}
