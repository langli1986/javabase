package net.wanho;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {//入口
//        System.out.println(1234);
//
//        Date d;
//
//        int a = 9;
//        Integer it = 10;
//        it = it + a;
//        System.out.println(it);
//
//        int[] is = new int[]{1, 2, 4, 6, 3, 7};
//        System.out.println(Arrays.toString(is));
//        for (int i = 0; i < is.length; i++) {
//            System.out.println(is[i]);
//        }
//        for (int i : is) {
//            System.out.println(i);
//        }
//
//        int j = 0;
//
//        while (true) {
//            j++;
//            if (j == is.length) {
//                break;
//            }
//        }
//
//        j = 0;
//        do {
//            System.out.println(is[j]);
//            j++;
//            if (j == is.length) {
//                break;
//            }
//        } while (true);

//        test();
        Test t = new Test();
        t.test1();

    }

    public void test1()//没有static修饰的叫实例方法，必须用实例来调用，或者大家都是实例方法【同一个类当中】
    {
        test2();
    }

    public void test2() {
        test1();
    }

    public static void test() {//有static修饰的方法叫静态方法，可以直接使用名字调用
        System.out.println(123);
        new Test().test1();
    }
}
