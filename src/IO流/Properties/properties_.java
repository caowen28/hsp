package IO流.Properties;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

/*
后缀properties是一种属性文本
这种文件以key-value格式存储
java可以通过properties类读取这个文件
String value=p.getProperties(key);
就能得到对应数据
存放一组配置.(类似win下ini, 还要简单些, 因为没有section)
由于难以表达层次, 复杂点可以用xml做配置.
通俗点讲就相当于定义一个变量，在这个文件里面定义这些变量的值
，在程序里面可以调用这些变量，好处就是，如果程序中的参数值需要变动，直接来改这个.property文件就可以了，不用在去修改源代码。

properties文件的特点
1、键值对格式。
2、“ = ”等号后面，值前面，的空格，会自动忽略掉。
3、值后面的空格，不会忽略。
4、“ = ”等号后面的双引号，不会忽略。
5、“ # ”号后面内容，为注释，忽略。1、键值对格式。





* Properties常用方法
*   load:加载配置文件的键值对到properties对象
*   list:将数据显示到指定设备
*   getProperties(key):根据键获取值
*   setProperties(key,value):设置键值对到Properties对象  底层调用hashmap的put方法
*   store:将Properties中的键值对存储到配置文件，在idea中保存信息到配置文件如果含有中文，会存储为unicode
*
*   https：//tool，chinaz.com/tools/unicode.aspk  Unicode吗查询工具
*
* */
public class properties_ {

    public static void main(String[] args)throws Exception {
        //使用Properties类读取配置文件
        //创建properties对象
        Properties properties=new Properties();
        //加载配置文件
        properties.load(new FileReader("src\\MySql.Properties"));
        //把kv显示到控制台
        properties.list(System.out);
        //根据key获取值
        String user=properties.getProperty("users");
        String pwd=properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);
    }


    //传统方式
    public void traditional_()throws Exception{
        //读取Mysql.Properties文件
        BufferedReader br = new BufferedReader(new FileReader("src:\\MySql.Properties"));
        //读取
        String line="";
        while ((line=br.readLine())!=null){
            String[] split=line.split("=");
            System.out.println(split[0]+"值是:"+split[1]);
        }
        br.close();
    }


}
