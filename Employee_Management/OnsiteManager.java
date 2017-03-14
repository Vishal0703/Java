/**
 * Created by vishal on 14/3/17.
 * This class stores and provides details about Onsite manager including the salary.
 */
public class OnsiteManager extends Employee{
    private double basic, tot;

    /**
     * Assigns name, id and calculates salary of Onsite Manager
     * @param str as name
     * @param n as no. of subordinates
     * @param m as no. of months
     */
    public OnsiteManager(String str, int n, int m)
    {
        super(str);
        basic=super.getSalary();
        tot=((Math.log(1+n))*basic)*(Math.log(1+m));

    }

    /**
     * Provides salary of Onsite Manager
     * @return tot as salary
     */

    public double getSalary()
    {
        return tot;
    }
}
