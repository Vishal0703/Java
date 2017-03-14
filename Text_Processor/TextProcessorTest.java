/**
 * Created by vishal on 14/3/17
 * Program to output the requirement via TextProcessor
*/

public class TextProcessorTest{
  /**
   * Main method for the program
   * @param args
   */
  public static void main(String[] args)
  {
    TextProcessor obj=new TextProcessor();
    int l= obj.getWordCount(args[0]);
    String[] words;
    int len[];
    len=obj.getWordLengths(args[0]);
    words=obj.getWords(args[0]);

    System.out.print("The total wordcount is: ");
    System.out.println(l);
    System.out.println("The words are: ");

    for(int i=0; i<l; i++)
      {
        System.out.println(words[i]);
      }

    System.out.println("The word counts are: ");

    for(int i=0; i<l; i++)
      {
        System.out.println(len[i]);
      }
  }
}
