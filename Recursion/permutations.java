public class permutations {

    public static String swap(String s, int i, int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void permute(String s, int fixedIndex){
        if(fixedIndex == s.length()-1){
            System.out.println(s);
        }
        for(int i=fixedIndex;i<s.length();i++){
            s = swap(s,fixedIndex,i);
            permute(s,fixedIndex+1);
            s = swap(s,fixedIndex,i);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        permute(s,0);
    }
    
}
