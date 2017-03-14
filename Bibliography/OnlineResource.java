import java.util.*;

/**
 *Created by vishal on 14/3/17
 *Provides URL of online resources
 */
public class OnlineResource extends Resource
{
  private String url;
  /**Sets the url given to a local variable
     @param ur as url
  */
  public void seturl(String ur)
  {url=ur;}

  /**Provides Title & URL of the Resource
     @return formatted string with the above attributes
  */
  public String print()
  {
    return String.format("Resource Details: \n Title: %s\n URL: %s\n", getTitle(), url);
  }
}
