//: enumerated/EnumMaps.java
// Basics of EnumMaps.
package enumerated_;

import java.util.EnumMap;
import java.util.Map;

import static enumerated_.AlarmPoints.BATHROOM;
import static enumerated_.AlarmPoints.KITCHEN;
import static enumerated_.AlarmPoints.UTILITY;
import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

interface Command
{
    void action();
}

public class EnumMaps
{
    public static void main(String[] args)
    {
        EnumMap<AlarmPoints, Command> em =
                  new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, new Command()
        {
            public void action()
            {
                print("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command()
        {
            public void action()
            {
                print("Bathroom alert!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet())
        {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }
        try
        { // If there's no value for a particular key:
            em.get(UTILITY).action();
        }
        catch (Exception e)
        {
            print(e);
        }
    }
} /* Output:
BATHROOM: Bathroom alert!
KITCHEN: Kitchen fire!
java.lang.NullPointerException
*///:~
