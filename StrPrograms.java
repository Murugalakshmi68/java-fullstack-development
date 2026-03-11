import java.util.Arrays;
public class StrPrograms {
    enum Day { MONDAY, TUESDAY, WEDNESDAY , THURSDAY , FRIDAY , SATURDAY , SUNDAY}
    public static void main(String[] args) {
      System.out.println("Print Even-Length Words");
         String sentence = "Java is very powerful language";
        String[] words = sentence.split(" ");
        for(String word : words) {
            if(word.length() % 2 == 0) 
                System.out.println(word);
        }

        System.out.println("Insert a String into Another String");
        String original = "Hello World";
        String insert = "Java ";
        int position = 6;
        String result = original.substring(0, position) + insert + original.substring(position);
        System.out.println(result);

        //Check Whether a String is Palindrome
        String str = "madam";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        if(str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        //Check Anagram
        String s1 = "listen";
        String s2 = "silent";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        //Reverse a String
        String str1 = "Java";
        String reversed = "";
        for(int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        //Print a New Line in String
        String text = "Java\nFullStack\nDeveloper";
        System.out.println(text);

        //Add Characters to a String
        String str2 = "Java";
        str = str2 + " Developer";
        System.out.println(str2);

        //Iterate Over Characters in String
        String str3 = "Java";
        for(int i = 0; i < str3.length(); i++) 
            System.out.println(str3.charAt(i));

        //Get a Character From the Given String
        String str4 = "Java";
        char ch = str4.charAt(2);
        System.out.println("Character: " + ch);

        //Convert String to String Array
        String str5 = "Java";
        String[] arr = str5.split("");
        for(String s : arr) 
            System.out.println(s);

        //Swapping Pair of Characters
        String str6 = "abcdef";
        char[] ch1 = str6.toCharArray();
        for(int i = 0; i < ch1.length - 1; i += 2) {
            char temp = ch1[i];
            ch1[i] = ch1[i+1];
            ch1[i+1] = temp;
        }
        System.out.println(new String(ch1));

        //Split into Several Sub-Strings
        String str7 = "Java,Python,C++";
        String[] parts = str7.split(",");
        for(String s : parts) {
            System.out.println(s);
        }

        //Convert Enum to String
        Day d = Day.MONDAY;
        String str8 = d.toString();
        System.out.println(str8);

    }
}
