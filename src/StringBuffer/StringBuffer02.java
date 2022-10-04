package StringBuffer;

public class StringBuffer02 {
/*StringBuffer常用方法
1.增加 append
2.删除 delete（start，end）
3.修改 replace（String，end，String）  将start~end之间的数据替换不包含end
4.查 indexOf 查找子串第一次出现在字符串的位置索引，找不到返回-1
5.插入 insert
6.获取长度 length
*
* */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        //append
        sb.append(',');
        sb.append("张三丰");
        sb.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(sb);
        //delete
        //索引为>=start&&<end处的字符
        //解读删除11到14的字符，包含11但不包含14
        sb.delete(11,14);
        //replace
        //解读，使用周芷若替换索引9-11的字符[9,11)
        sb.replace(9,11,"周芷若");
        System.out.println(sb);
        //查找指定子串在字符串中第一次出现的位置，找不到返回-1
        int index=sb.indexOf("周芷若");
        System.out.println(index);
        //插入
        //解读，在索引处插入数据,原索引后移
        sb.insert(9,"张无忌");
        System.out.println(sb);
        System.out.println(sb.length());



    }
}
