package net.wanho;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
//        String path = "D:\\ÖÐÒ±\\day01\\javabase\\src\\net\\wanho\\BufferTest.java";
//        File file = new File(path);
//        Reader reader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String line = "";
//        while(true)
//        {
//            line = bufferedReader.readLine();
//            if(line==null)
//            {
//                break;
//            }
//            System.out.println(line);
//        }
//        bufferedReader.close();
//        reader.close();

        String path = "D://1.txt";
        File file = new File(path);
        Writer writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("I am zhangli");
        bufferedWriter.newLine();
        bufferedWriter.write("who are you");
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();

    }
}
