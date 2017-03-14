import java.util.*;

/**
 * Created by vishal on 14/3/17
 *Class to keep record of books and print certain information about the books
 */

public class Journal extends OfflineResource
{
  private String name;
  private int pagestart, pagend, volume, issue;

  /**
   *Sets Journal name to a local variable
   @param str1 as journal name
  */
  public void setName(String str1)
  {
    name=str1;
  }
  /**
   *Sets Starting Page Number to a local variable
   @param k as start_page
  */
  public void setpagest(int k)
  {
    pagestart=k;
  }
  /**
   *Sets ending page number to a local variable
   @param l as end_page
  */
  public void setpagend(int l)
  {
    pagend=l;
  }
  /**
   *Sets volume to a local variable
   @param v as volume
  */
  public void setvolume(int v)
  {
    volume=v;
  }
  /**
   *Sets issue number to a local variable
   @param iss as issue
   @return NULL
  */
  public void setissue(int iss)
  {
    issue=iss;
  }
  /**Provides certain attributes about the journal like the Title, Publisher, Year, name, volume, issue no., start page, end page in the journal
   @return formatted string with the above specified attributes
  */
  public String print() {
    return String.format("Journal Details: \n Title: %s\n Publisher: %s\n Year: %d\n Name:%s\n Volume: %d\n Start Page: %d\n End Page: %d\n Issue No.: %d\n", getTitle(), getPublisher(), getYear(), name, volume, pagestart, pagend, issue);
  }
}
