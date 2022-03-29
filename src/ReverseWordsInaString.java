public class ReverseWordsInaString {

    //Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
   /* For example, Given s = "the sky is blue", return "blue is sky the".*/


    // Solution-1
    public void reverseWord(String s){
       String[] str = s.split(" ");
       StringBuilder sbr = new StringBuilder();
       for (int i = str.length -1 ;  i >=0 ; i--){
           sbr.append(str[i]);
           sbr.append(" ");
        }

       System.out.println(sbr);

    }

    

    public static void main(String[] args){
        ReverseWordsInaString rw = new ReverseWordsInaString();
        rw.reverseWord("the sky is blue");
    }

}
