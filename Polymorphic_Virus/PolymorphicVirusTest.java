/**
 * Created by vishal on 14/3/17.
 * This is a test class generated to check the correctness of the program
 */
public class PolymorphicVirusTest {
    /**
     * Main function for program implementation
     * @param args as command line input for the two input numbers
     */

    public static void main(String[] args)
    {
        int x1,x2;
        x1=Integer.parseInt(args[0]);
        x2=Integer.parseInt(args[1]);

        PolymorphicVirus[] viruses = new PolymorphicVirus[4];

        viruses[0]=new PolymorphicVirus(x1,x2);
        viruses[1]=new AdditivePolymorphicVirus(x1,x2);
        viruses[2]=new SubtractivePolymorphicVirus(x1, x2);
        viruses[3]=new MultiplicativePolymorphicVirus(x1, x2);

        for(PolymorphicVirus virus: viruses)
        {
            for(int i=1; i<=5; i++)
                System.out.println(virus.execute());
            System.out.println();
        }
    }
}
