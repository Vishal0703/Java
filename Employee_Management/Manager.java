import java.lang.*;
/**
 * Created by vishal on 14/3/17.
 * This class stores and provides details about manager including the salary.
 */

public class Manager extends Employee{
    private double basic, tot;

    /**
     * Assigns name, id and calculates the salary of manager
     * @param str as name
     * @param n as number of sub-ordinates
     */
    public Manager(String str, int n)
    {
        super(str);
        basic=super.getSalary();
        tot=(Math.log(1+n))*basic;
    }

    /**
     * Provides salary of manager
     * @return tot as salary
     */
    public double getSalary()
    {
        return tot;
    }
}
