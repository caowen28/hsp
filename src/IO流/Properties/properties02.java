package IO流.Properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class properties02 {

    public static void main(String[] args)throws Exception {
        //使用Properties类创建配置文件，修改配置文件
        Properties properties = new Properties();
        //创建
        //如果该文件没有旧的key，就是创建
        //如果该文件有旧的key，就是修改
        /*
        * properties父类是hashtable
        * */
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");//保存时是中文的unicode码值
        properties.setProperty("pwd","123");
        properties.setProperty("pwd","8888888");

        properties.store(new FileOutputStream("src\\mysql02.properties"),null);//comments是注释
        //为什么要new FileOutputDtream 因为Properties在内存中，如果要保存就要通过输出流保存到磁盘中
        System.out.println("保存成功");


    }
}
