/**
 * Created by vishal on 14/3/17.
 * Provides a random combination of the sum generated as a difference of two numbers

 */
public class SubtractivePolymorphicVirus extends PolymorphicVirus {

    private int x,y,sum;

    /**
     * Calculates the sum to be generated
     * @param x1 - an integer input
     * @param x2 - another integer input
     */
    public SubtractivePolymorphicVirus(int x1, int x2)
    {
        sum=x1+x2;
    }

    /**
     * Calculates the random combination
     * @return str containing the two numbers
     */
    public String execute()
    {
        x=(int)(sum+ (sum)*Math.random());
        y=x-sum;
        String str= "Given sum is equal to :  " + x + " - " + y;
        return str;
    }

}
