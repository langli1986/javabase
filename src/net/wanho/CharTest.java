package net.wanho;

import java.io.*;

public class CharTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/1.txt");
//        Reader reader = new FileReader(file);
//        char[] chars = new char[2];
//        int length=0;
//        while(true)
//        {
//            length = reader.read(chars,0,chars.length);
//            if(length==-1)
//            {
//                break;
//            }
//            System.out.print(new String(chars,0,length));
//        }
//        reader.close();

        Writer writer = new FileWriter(file,true);
        writer.write("I am zhangli hhh");
        writer.flush();
        writer.close();
    }
}
