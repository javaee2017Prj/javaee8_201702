//: annotations/Testable.java
package annotations_;

import net.mindview.atunit.Test;

public class Testable
{
    public void execute()
    {
        System.out.println("Executing..");
    }

    @Test
    void testExecute()
    {
        execute();
    }
} ///:~
