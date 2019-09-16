package homework;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //源文件的地址
        String path = "D:\\中冶\\day01\\javabase\\src\\homework\\CopyFileTest.java";
        //申明原文件为FIle
        File sourceFile = new File(path);
        //文件字符流，读取，是缓冲流的基础
        Reader reader = new FileReader(sourceFile);
        //文件缓冲流，以上都是为了一行一行读文件
        BufferedReader bufferedReader = new BufferedReader(reader);


        //目的文件的地址
        File destFile = new File("D:\\中冶\\day01\\javabase\\src\\homework\\CopyFileTest.txt");
        //文件字符流，写入
        Writer writer = new FileWriter(destFile);
        //文件缓冲流，一行一行写
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        //读出来的这行记录放在这个变量中
        String line = "";
        //记录行号
        int lineNum = 1;
        while(true)
        {
            //读取一行
            line = bufferedReader.readLine();
            //如果line为null,则已经到文件末尾
            if(line==null)
            {
                break;
            }

            //把行号和这一行写入新文件
            bufferedWriter.write(lineNum+" "+line);
            //在新文件创建新空行
            bufferedWriter.newLine();
            //行号+1
            lineNum++;
        }

        //关闭资源
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();

        bufferedReader.close();
        reader.close();

    }
}
