
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    final public static int DEFAULT_POWER = 10;

    // instance variables
    int power;

    // constructors
    String name;

    public PowerPill(String name)
    {
        this.name = name;
        power = DEFAULT_POWER;
    }

    public PowerPill(String name, int power)
    {
        this.name = name;
        this.power = power;
    }


    // accessor methods

    public int getPower()
    {
        return power;
    }

    public String getName()
    {
        return name;
    }

    // mutator methods

    public void setPower(int power)
    {
        this.power = power;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // toString method

    @Override
    public String toString()
    {
        return "PowerPill " + name + " = " + power; // string has to look like this <name> = <power>

    }
}