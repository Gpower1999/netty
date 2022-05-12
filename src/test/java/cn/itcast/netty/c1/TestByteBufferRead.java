package cn.itcast.netty.c1;

import java.nio.ByteBuffer;

import static cn.itcast.netty.c1.ByteBufferUtil.debugAll;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/11 16:50
 */
public class TestByteBufferRead {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a','b','c','d'});
        buffer.flip();

        //从头开始读 读4个byte
        /*
        buffer.get(new byte[4]);
        debugAll(buffer);

        //rewind 从头开始读
        buffer.rewind();
        buffer.get();
        debugAll(buffer);
         */


        //mark & reset
        //mark 做一个标记，记录position位置，reset重置到mark的位置
        //对rewind方法的一个增强
        /*
        System.out.println((char) buffer.get());
        System.out.println((char) buffer.get());
        buffer.mark(); //加标记，索引为2的位置
        System.out.println((char) buffer.get());
        System.out.println((char) buffer.get());
        buffer.reset();
        System.out.println((char) buffer.get());
        System.out.println((char) buffer.get());

         */

        //get(i) 不会改变读指针，按照索引查找
        System.out.println((char) buffer.get(3));
        debugAll(buffer);
    }
}
