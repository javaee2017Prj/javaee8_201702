package qin.thinkingjava4.generic;

public class Holder3<K, V>
{
    private K key;

    private V value;

    public Holder3()
    {

    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Holder3{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }

    public Holder3(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public void setKey(K key)
    {
        this.key = key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue(V value)
    {
        this.value = value;
    }
}