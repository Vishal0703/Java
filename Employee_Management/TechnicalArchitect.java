/**
 * Created by vishal on 14/3/17.
 * This class stores and provides details about manager including the salary.
 */
public class TechnicalArchitect extends Employee {
    private double basic, tot;

    /**
     * Assigns name, id of Technical Architect and calculates salary.
     * @param str as name
     * @param n as no. of subordinates
     */
    public TechnicalArchitect(String str, int n)
    {
        super(str);
        basic=super.getSalary();
        tot=(Math.log(1+n))*basic*1.5;
    }

    /**
     * Provides the salary of Technical Architect
     * @return tot as salary.
     */
    public double getSalary()
    {
        return tot;
    }
}
