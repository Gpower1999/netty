package cn.itcast.netty.c1;

import java.nio.ByteBuffer;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/11 15:49
 */
public class TestByteBufferAllocate {
    public static void main(String[] args) {
        System.out.println(ByteBuffer.allocate(16).getClass());//容量不能动态调整
        System.out.println(ByteBuffer.allocateDirect(16).getClass());
        /*
        class java.nio.HeapByteBuffer -java堆内存，读写效率较低，受到垃圾回收的影响
        class java.nio.DirectByteBuffer -直接内存，读写效率高（少一次数据的拷贝），不会受到垃圾回收的影响，分配的效率低，使用不当内存泄露
         */
    }
}
