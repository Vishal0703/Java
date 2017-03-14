import java.util.*;

/**
 *Created by vishal on 14/3/17
 *Class to keep record of books and print certain information about the books
 */

public class Book extends OfflineResource
{
  private String author, isbn;
  private int pages;

  /**
   *Sets author name to a local variable
   @param str1 as author name
  */
  public void setAuthor(String str1)
  {
    author=str1;
  }
  /**
   *Sets ISBN to a local variable
   @param k as isbn
  */
  public void setisbn(String k)
  {
    isbn=k;
  }
  /**
   *Sets number of pages to a local variable
   @param page as number of pages
  */
  public void setpages(int page)
  {
    pages=page;
  }
  /**Provides certain attributes about the book like the Title, Publisher, Year, author, the ISBN and the number of pages in the book
   @return formatted string containing the above specified values
  */
  public String print()
  {
    return String.format("Book Details: \n Title: %s\n Publisher: %s\n Year: %d\n Author: %s\n ISBN: %s\n No. of pages: %d\n", getTitle(), getPublisher(), getYear(), author, isbn,pages);
  }

}
