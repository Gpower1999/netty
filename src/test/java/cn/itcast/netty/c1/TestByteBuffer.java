package cn.itcast.netty.c1;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
  * TODO
  *
  * @author Gpower
  * @date   2022/5/11 14:41
  */
@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) {
        //FileChannel
        //1.输入输出流
        try (FileChannel channel = new FileInputStream("data.txt").getChannel()) {
            //准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (true){
                //从channel读取数据，想buffer写入
                int len = channel.read(buffer);
                log.debug("读取到的字节数{}",len);
                if (len == -1){
                    break;
                }
                //打印buffer的内容
                buffer.flip();//切换成读模式
                while (buffer.hasRemaining()){//是否还有剩余未读数据
                    byte b = buffer.get();
                    log.debug("读取到的实际字节{}",(char) b);
                }
                buffer.clear();//切换成写模式
            }
        } catch (IOException e) {

        }
    }
}
