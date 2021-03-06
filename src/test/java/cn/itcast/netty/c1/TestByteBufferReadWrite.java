package cn.itcast.netty.c1;

import java.nio.ByteBuffer;

import static cn.itcast.netty.c1.ByteBufferUtil.debugAll;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/11 15:32
 */
public class TestByteBufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x61);
        debugAll(buffer);
        buffer.put(new byte[]{0x62,0x63,0x64});
        debugAll(buffer);
        buffer.flip();
        System.out.println(buffer.get());
        buffer.compact();
        buffer.put(new byte[]{0x65,0x66});
        debugAll(buffer);
    }
}
