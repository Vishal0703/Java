import java.util.*;
/**
 * Created by vishal on 14/3/17
 * Resource allocation class
 */

public abstract class Resource
{
  private String str;
  /**
   *abstract class for different usage
  */
  public abstract String print();

  /**
   *sets title of the Resource
   @param string containing the title
  */
  public void setTitle(String string)
  {
    str=string;
  }
  /**
   *provides Title
   @return Title as a string
  */
  public String getTitle()
  {
    return str;
  }
}
