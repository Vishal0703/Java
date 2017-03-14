/**
 * Created by vishal on 14/3/17.
 * This class is generated to test the output of the whole program
 * and to calculate the total expense of the company X
 */
public class Main {
    /**
     * Main function for calculation of total expense
     * @param args as command line argument
     */

    public static void main(String[] args)
    {
        double tot=0,t;
        Employee[] emp=new Employee[8];
        emp[0]=new Employee("Emp1");
        emp[1]=new Employee("Emp2");
        emp[2]=new Manager("Man1", 10);
        emp[3]=new Manager("Man2", 20);
        emp[4]=new OnsiteManager("Ons1", 10, 5);
        emp[5]=new OnsiteManager("Ons2", 20, 7);
        emp[6]=new TechnicalArchitect("Tech1", 10);
        emp[7]=new TechnicalArchitect("Tech2", 20);

        System.out.printf("%-15s%-20s%-15s\n", "Employee_Id", "Name", "Salary");
        for(Employee e:emp)
        {
            System.out.printf("%-15d%-20s%-15.2f\n", e.getId(), e.getName(), t=e.getSalary());
            tot+=t;
        }
        System.out.printf("The total salary is: %.2f\n", tot);
    }
}
