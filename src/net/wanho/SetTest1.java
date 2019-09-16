package net.wanho;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SetTest1 {
    public static void main(String[] args) {
        int[] is = new int[10];

        System.out.println(123);
        System.out.println(456);
        List<Integer> list = new ArrayList();

        list.add(1);
//        list.add("1234");
//        list.add(new Date());
        for(int i=0;i<100;i++)
        {
            list.add(i);
        }

        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            Integer obj = list.get(i);
        }

        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
