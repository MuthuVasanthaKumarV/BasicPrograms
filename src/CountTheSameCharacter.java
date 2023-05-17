import java.util.HashMap;

public class CountTheSameCharacter
{
    public static void main(String[] args)
    {
        String s1 = "abbcccdddd";
        HashMap<Character, Integer> h1 = new HashMap<>();
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (h1.containsKey(ch[i])) {
                h1.put(ch[i], h1.get(ch[i]) + 1);
            } else {
                h1.put(ch[i], 1);
            }
        }
        System.out.println(h1);
}
}
