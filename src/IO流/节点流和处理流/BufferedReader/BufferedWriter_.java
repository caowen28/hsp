package IO流.节点流和处理流.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.StringWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath="c:\\hello.txt";
        BufferedWriter bufferedWriter=null;
        try {
             bufferedWriter=new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("JDBC");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter!=null){
                bufferedWriter.close();
            }

        }

    }

}
