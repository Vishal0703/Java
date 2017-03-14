import java.lang.*;
import java.util.*;

/**
 * Created by vishal on 14/3/17.
 * Provides a random combination of the sum generated as a product of two numbers
 */

public class MultiplicativePolymorphicVirus extends PolymorphicVirus {

    private int x,y,sum;
    List<Integer> factors=new ArrayList<Integer>();

    /**
     * Generates the all possible factors less than square root of the number
     * and stores it into a list
     * @param x1
     * @param x2
     */
    public MultiplicativePolymorphicVirus(int x1, int x2)
    {
        sum=x1+x2;
        for(int i=1; i<=Math.sqrt(sum); i++)
        {
            int t=sum/i;
            if(t*i ==sum)
                factors.add(t);

        }

    }

    /**
     * Calculates a random index for the above generated list
     * and also calculates the 2nd factor greater than square root of the number
     * @return str containing both the numbers
     */
    public String execute()
    {
        int j=(int)((factors.size())*Math.random());
        x=factors.get(j);
        y=sum/x;

        String str= "Given sum is equal to :  " + x + " X " + y;
        return str;
    }
}
