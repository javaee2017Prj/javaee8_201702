package qin.thinkingjava4.generic;

//这个类重用性并不好
public class Holder1
{
    private Automobile a;

    public Holder1(Automobile a)
    {
        this.a = a;
    }

    public Automobile getA()
    {
        return a;
    }
}