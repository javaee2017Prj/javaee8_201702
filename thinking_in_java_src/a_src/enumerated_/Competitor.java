//: enumerated/Competitor.java
// Switching one enum on another.
package enumerated_;

public interface Competitor<T extends Competitor<T>>
{
    Outcome compete(T competitor);
} ///:~
