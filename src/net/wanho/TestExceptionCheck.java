package net.wanho;

import java.io.*;

public class TestExceptionCheck {
    public static void main(String[] args) throws Exception {
//        File file = new File("Z:/123.txt");
//        System.out.println(file.exists());
//        InputStream is = new FileInputStream(file);
        f();
    }

    public static void f() throws Exception {
        throw new Exception();
    }
}
