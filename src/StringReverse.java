import java.util.Arrays;
public  class StringReverse{
    public static void main(String[] args)
    {

      String s="hello world";
      String [] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String reverse = reverseElement(s1[i]);
            s1[i]=reverse;
        }
        System.out.println(Arrays.toString(s1));
    }
    public static String reverseElement(String s){
        String reversedWord = "";
        int i=s.length()-1;
        while (i>=0) {
            char ch = s.charAt(i);
            reversedWord = reversedWord + ch;
            i--;
        }
        return reversedWord;
    }
}


