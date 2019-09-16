package net.wanho;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExceptionTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(a);
        try {
            String s = null;
            System.out.println(s.length());
            System.out.println(1/0);
            int[] is = new int[]{1,2,3};
            System.out.println(is[3]);
            Set set = new HashSet();
            set.add("1234");
            set.add(123);
            Iterator it = set.iterator();
            while(it.hasNext()){
                Object o = it.next();
                String s1 = (String) o;
                System.out.println(s1);
            }
            int i = Integer.parseInt("2we");
            System.out.println(i+1);

        }
        catch(Exception e)
        {
            System.out.println("hello ");
        }
        finally {
            System.out.println("無論如何都会执行，用来释放资源等");
        }




    }
}
