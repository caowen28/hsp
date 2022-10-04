package Collection;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("红楼梦",100.0,"曹雪芹"));
        list.add(new Book("西游记",10.0,"吴承恩"));
        list.add(new Book("水浒传",19.0,"施耐庵"));
        list.add(new Book("三国",80.0,"罗贯中"));
        sort(list);

        for (Object b :list) {
            System.out.println(b);
        }

    }

    public static void sort(List list){

        for(int i=0;i< list.size()-1;i++){
            for(int j=0;j< list.size()-1-i;j++){
            Book book1=(Book)list.get(j);
            Book book2=(Book)list.get(j+1);
            if(book1.getPrice()>book2.getPrice()){
            list.set(j,book2);
            list.set(j+1,book1);
            }
            }


        }
    }
}
class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}