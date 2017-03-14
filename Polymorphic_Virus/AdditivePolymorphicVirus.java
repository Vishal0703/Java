import java.lang.*;
/**
 * Created by vishal on 14/3/17.
 * Provides a random combination of the sum generated as a sum of two numbers
 */

public class AdditivePolymorphicVirus extends PolymorphicVirus{

    private int x,y,sum;

    /**
     * Calculates the sum to be generated
     * @param x1 - an integer input
     * @param x2 - another integer input
     */
    public AdditivePolymorphicVirus(int x1, int x2){
        sum=x1+x2;
    }

    /**
     * Calculates the random combination
     * @return str containing the 2 numbers
     */
    public String execute()
    {
        x=(int)(sum*Math.random());
        y=sum-x;
        String str= "Given sum is equal to:  " + x + " + " + y;
        return str;
    }
}
