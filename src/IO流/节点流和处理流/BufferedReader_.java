package IO流.节点流和处理流;

import java.io.BufferedReader;

//自定义处理流
public class BufferedReader_  extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
}
