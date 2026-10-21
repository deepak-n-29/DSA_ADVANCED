package DSA_Advanced.Strings;
// print frequencies of characters (in sorted order) in String of lower Case Alphabets
public class FrequencyOfCharsSortedOrder {
    public static void main(String[] args){
        String s = "geeksforgeeks";
        int count[] = new int[26]; //       1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26
                                    //      0  0  0  0  0  0  0  0  0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0
        for(int i=0;i<s.length();i++){ //   a  b  c  d  e  f  g  h  i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
            count[s.charAt(i)-'a']++;  //               4  1  2             2               1           1   2
        }

        for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+"->"+count[i]);
            }

        }
    }
}
