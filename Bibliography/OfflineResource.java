import java.util.*;
/**
 *Created by vishal on 14/3/17
 *Class for offline resources
 */

abstract class OfflineResource extends Resource
{
  private String publisher;
  private int year;

  /**
   *Provides publisher name
   @return name of publisher
  */
  public String getPublisher()
    {return publisher;}

  /**
   *Provides year of publish
   @return year of publishing
  */

  public int getYear()
    {return year;}

  /**
   *Sets publisher name to a local variable
   @param str1 as string input
  */

  public void setPublisher(String str1)
  {
    publisher=str1;
  }
  /**
   *Sets published year to a local variable
   @param k as integer input
  */
  public void setYear(int k)
  {
    year=k;
  }

}
