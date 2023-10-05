public class LogicalOperators
{
    public static void main(String[] args)
    {
        boolean labHandedIn = false;
        boolean studentPresent = true;

        if(labHandedIn && studentPresent)
        {
            System.out.println("Happy trainers");
        }
        else
        {
            System.out.println("Sad trainers");
        }

        boolean hasTraining = true;
        boolean hasExperience = false;

        if (hasTraining || hasExperience)
        {
            System.out.println("Hired");
        }
        else
        {
            System.out.println("Sorry not this time");
        }
    }
}
