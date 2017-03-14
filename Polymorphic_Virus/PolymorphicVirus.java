/**
 * Created by vishal on 14/3/17.
 * This class prints the input values provided by the user
 */
public class PolymorphicVirus {
    private int x,y;

    /**
     * Constructor for PolymorphicVirus
     * @param x1 - an integer input
     * @param x2 - another integer input
     */
    public PolymorphicVirus(int x1, int x2)
    {
        x=x1;
        y=x2;

    }
    public PolymorphicVirus()
    {}

    /**
     * Provides the given input
     * @return str as string containing the given inputs
     */
    public String execute()
    {
        String str= "Numbers are:  " + x + " & " + y;
        return str;
    }
}
