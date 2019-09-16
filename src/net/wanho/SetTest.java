package net.wanho;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("123");
        set.add("123");
        set.add("456");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("123"));


        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        Set<String> set1 = new HashSet<>();
        set1.add("zcd");
        set1.add("abc");
        set1.add("123");
        set1.add("33");
        set1.add("abb");
        set1.add("21");

        //acs码是america code stardard   每一个常用字符对应到整数  1 49   A  65   a 97
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
