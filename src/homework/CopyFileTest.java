package homework;

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //Դ�ļ��ĵ�ַ
        String path = "D:\\��ұ\\day01\\javabase\\src\\homework\\CopyFileTest.java";
        //����ԭ�ļ�ΪFIle
        File sourceFile = new File(path);
        //�ļ��ַ�������ȡ���ǻ������Ļ���
        Reader reader = new FileReader(sourceFile);
        //�ļ������������϶���Ϊ��һ��һ�ж��ļ�
        BufferedReader bufferedReader = new BufferedReader(reader);


        //Ŀ���ļ��ĵ�ַ
        File destFile = new File("D:\\��ұ\\day01\\javabase\\src\\homework\\CopyFileTest.txt");
        //�ļ��ַ�����д��
        Writer writer = new FileWriter(destFile);
        //�ļ���������һ��һ��д
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        //�����������м�¼�������������
        String line = "";
        //��¼�к�
        int lineNum = 1;
        while(true)
        {
            //��ȡһ��
            line = bufferedReader.readLine();
            //���lineΪnull,���Ѿ����ļ�ĩβ
            if(line==null)
            {
                break;
            }

            //���кź���һ��д�����ļ�
            bufferedWriter.write(lineNum+" "+line);
            //�����ļ������¿���
            bufferedWriter.newLine();
            //�к�+1
            lineNum++;
        }

        //�ر���Դ
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();

        bufferedReader.close();
        reader.close();

    }
}
