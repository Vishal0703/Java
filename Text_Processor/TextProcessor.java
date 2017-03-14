import java.util.*;

/**
 * Created by vishal on 14/3/17
 *Program to find the number of words, words length & individual words from a given string.
 */

public class TextProcessor{


  /**
   *Takes a string as input and outputs the total number of words in it.
   @param string as input
   @return an integer with total word count
  */
   public int getWordCount(String string)
   {
     int c=0;
     String[] Wordc=getWords(string);
     for(String str:Wordc)
       {
         c++;
       }
     return c;

   }



  String[] words;
  /**
   *Takes a string as input and outputs the individual words present in the string.
   @param string as input
   @return words an array of string with each individual word
  */

   public String[] getWords(String string)
   {

     List<String>  wordlist=new ArrayList<String>();

     String word="";
     int leng=string.length();
     int count=0;
     char[] chararr = string.toCharArray();

        for(char c:chararr)
           {
             if(c==' ')
               {
                 wordlist.add(word);
                 word="";
                 count++;
               }

             else{
                 word=word+c;
                 count++;
                 if(count==leng)
                   wordlist.add(word);
               }

           }
        words=new String[wordlist.size()];
        wordlist.toArray(words);
        return words;


   }

  /**Takes a string as input and outputs the length of each word present in it.
     @param string as input
     @return len as array of integer giving length of each word present in the string.
  */
   public int[] getWordLengths(String string)
   {
     int c=0;
     int[] len;
     int con= getWordCount(string);
     len= new int[con];
     for(String str: words)
       {
         len[c]=str.length();
         c=c+1;
       }
     return len;
   }
}
