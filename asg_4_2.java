public class asg_4_2 
{
    static void function() throws IllegalAccessException
    {
        System.out.println("Inside function(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try
        {
            function();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }

        System.out.println("\nCreated By Krunal Jodhani 21CE045");

    }

}
