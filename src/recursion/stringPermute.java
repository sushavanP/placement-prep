package recursion;

public class stringPermute {
    public static void permute(String s, int index){
        if(index == s.length()-1){
            System.out.println(s);
            //return;
        }
        else {
            for (int j = index; j < s.length(); j++) {
                s = swap(s, index, j);
                permute(s, index + 1);
                s = swap(s, index, j);
            }
        }
    }
    public static String swap(String s, int index, int j) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[index];
        charArray[index] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }
    public static void main(String[] args){
        String str = "ABC";
        permute(str, 0);
    }
}
