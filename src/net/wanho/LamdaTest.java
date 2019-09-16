package net.wanho;

import java.util.Arrays;
import java.util.Comparator;

public class LamdaTest {
    public static void main(String[] args) {
        Integer[] is = new Integer[]{2,4,56,76,34,76,43,765};

        Arrays.sort(is,new MyCompator());
        Arrays.sort(is, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
//        Arrays.sort(is,(a,b)->b-a);

        System.out.println(Arrays.toString(is));
    }
}

class MyCompator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
