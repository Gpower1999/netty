package cn.itcast.netty.c1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static cn.itcast.netty.c1.ByteBufferUtil.debugAll;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/11 17:01
 */
public class TestByteBufferString {
    public static void main(String[] args) {
        //1. 字符串转为ByteBuffer
        ByteBuffer buffer1 = ByteBuffer.allocate(16);
        buffer1.put("hello".getBytes());
        debugAll(buffer1);

        //2. charset
        ByteBuffer buffer2 = StandardCharsets.UTF_8.encode("hello");
        debugAll(buffer2);

        //3. wrap 与 第二种方法效果一样
        ByteBuffer buffer3 = ByteBuffer.wrap("hello".getBytes());
        debugAll(buffer3);

        // ByteBuffer转换为字符串
        buffer1.flip();
        String str1 = StandardCharsets.UTF_8.decode(buffer1).toString();
        System.out.println(str1);

        String str2 = StandardCharsets.UTF_8.decode(buffer2).toString();
        System.out.println(str2);
    }
}
