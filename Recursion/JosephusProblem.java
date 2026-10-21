// There are n people standing in a circle. Starting from position 0, every k-th person is eliminated. The counting continues circularly until only one person remains.
// We want to find the survivor's position, using 0-based indexing.
// For example:
// n = 7
// k = 3
// The elimination order is:
// 2 → 5 → 1 → 6 → 4 → 0
// So the survivor is 3.

public class JosephusProblem {
    
    public int jos(int n, int k){
        if(n==1) return 0;
        return (jos(n-1,k)+k)%n;
    }

    public int myjos(int n, int k){
        return jos(n,k) + 1;
    }

    public static void main(String[] args){
        JosephusProblem jos = new JosephusProblem();
        System.out.println("POSITION STARTS FROM 0: "+jos.jos(7,3)); 
        System.out.println("POSITION STARTS FROM 1: "+jos.myjos(7,3));
    }
}
