/**
 * This class checks out and assigns the values of various attributes of a resource
 */
public class BibliographyManager{

    /**
     * Main method for the program
     * @param args as command line argument
     */
    public static void main(String[] args)
    {
        OnlineResource onln= new OnlineResource();
        Book bk= new Book();
        Journal jrn= new Journal();

        onln.setTitle("Java Platform");
        onln.seturl("https://docs.oracle.com/javase/8/docs/api/");

        bk.setTitle("The Java Prog Lang");
        bk.setAuthor("Ken Arnold, James Gosling");
        bk.setPublisher("Addison Weasley");
        bk.setYear(2005);
        bk.setpages(928);
        bk.setisbn("978-0321349804");

        jrn.setTitle("Named Content Searching");
        jrn.setPublisher("IEEE Communication");
        jrn.setYear(2016);
        jrn.setName("Mobile Networks");
        jrn.setpagest(2067);
        jrn.setpagend(2070);
        jrn.setvolume(20);
        jrn.setissue(10);


        System.out.println(onln.print());
        System.out.println(bk.print());
        System.out.println(jrn.print());



    }
}