/**
 * Created by vishal on 14/3/17.
 * This class assigns the name to any employee and provides an unique ID to the employee
 * starting from 1001.
 */
public class Employee {
    private String name;
    private int id;
    private static int i=1001;
    private double sal=30000;

    /**
     * Constructor for the Employee class
     * @param str as name
     */
    public Employee(String str)
    {
        name = str;
        id=i;
        i++;
    }

    /**
     * Provides the salary of an employee
     * @return sal as salary
     */
    public double getSalary()
    {
        return sal;
    }

    /**
     * Provides ID of an employee
     * @return id as Employee ID
     */
    public int getId()
    {
        return id;
    }

    /**
     * Provides Name of the employee
     * @return name as Employee name
     */
    public String getName()
    {
        return name;
    }
}
