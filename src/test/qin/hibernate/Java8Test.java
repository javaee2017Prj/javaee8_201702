package qin.hibernate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Java8Test
{
    @org.junit.Test public void mapTest() {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        map.put(2, 2);

        Set<Integer> key = map.keySet();

        for (Iterator<Integer> it = key.iterator(); it.hasNext(); ) {
            System.out.println(map.get(it.next()));
        }

        Integer value = map.get(key);

        //System.out.println(value);
    }
}