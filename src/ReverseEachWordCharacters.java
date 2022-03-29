import java.util.Arrays;

//Given a string str, we need to print reverse of individual words.
//Examples: Input : Hello World
//Output : olleH dlroW

public class ReverseEachWordCharacters {


// Solution -1 , same solution can be used to reverse an integre
    public void reverseeachwordcharacters(String s){
        char[] input = s.toCharArray();

        for (int i = 0; i < input.length / 2; i++) {
            char temp = input[i]; // swap numbers
            if(Character.isWhitespace(temp)){
                continue;
            }
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println("reversed array : " + Arrays.toString(input));

    }


    //Solution- 2

    void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(inputString);

        System.out.println(reverseString);

        System.out.println("-------------------------");
    }
    public static void main(String[] args){
        ReverseEachWordCharacters rw = new ReverseEachWordCharacters();
        rw.reverseeachwordcharacters("Geeks for Geeks");
        rw.reverseEachWordOfString("I am string not reversed");
    }
}
