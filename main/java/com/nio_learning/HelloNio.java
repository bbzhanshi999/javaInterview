package com.nio_learning;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/8/21.
 */
public class HelloNio {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = HelloNio.class.getClassLoader();
        URL uri = classLoader.getResource("1.txt");
        RandomAccessFile accessFile = new RandomAccessFile("main/resources/1.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(255);

        int byteRead = channel.read(buffer);
        while (byteRead!=-1){
            System.out.println("---------------------------");
            System.out.println("Read："+byteRead);
            buffer.flip();

            while(buffer.hasRemaining()){
                System.out.print((char)buffer.get());
            }

            buffer.compact();
            System.out.print((char)buffer.get());
            byteRead = channel.read(buffer);
        }
        accessFile.close();
    }

    @Test
    public void transferFromTest() throws IOException {
        RandomAccessFile fromFile = new RandomAccessFile("main/resources/1.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("main/resources/out.txt", "rw");
        FileChannel toChannel = toFile.getChannel();
        int position = 0;
        long size = fromChannel.size();
        toChannel.transferFrom(fromChannel,0,size);
    }

    @Test
    public void transferToTest() throws IOException {
        RandomAccessFile fromFile = new RandomAccessFile("main/resources/1.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("d:/out.txt", "rw");
        FileChannel toChannel = toFile.getChannel();
        int position = 0;
        long size = fromChannel.size();
        fromChannel.transferTo(position,size,toChannel);
    }

    @Test
    public void selectorTest() throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost", 8080));
        Selector selector = Selector.open();
        socketChannel.configureBlocking(false);

        ByteBuffer buffer = ByteBuffer.allocate(255);
        SelectionKey selectionKey = socketChannel.register(selector, SelectionKey.OP_READ, buffer);
        while(true){
            int channelCount = selector.select();
            if(channelCount==0)continue;
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while(iterator.hasNext()){
                SelectionKey key = iterator.next();
                if(key.isAcceptable()){
                    SelectableChannel channel = key.channel();
                    System.out.println("accept");
                }else if(key.isConnectable()){
                    System.out.println("connect");
                }else if(key.isReadable()){
                    System.out.println("read");
                }else if(key.isWritable()){
                    System.out.println("write");
                }
            }
        }
    }

    @Test
    public void fileChannlReadTest() throws IOException {
        FileInputStream ops = new FileInputStream(new File("main/resources/1.txt"));
        FileChannel channel = ops.getChannel();
        /*RandomAccessFile accessFile = new RandomAccessFile("main/resources/1.txt", "rw");
        FileChannel channel = accessFile.getChannel();*/
        readChannel(channel);
//        accessFile.close();
    }


    @Test
    public void fileChannelWriteTest() throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("main/resources/1.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        String content = "我草你妈";
        ByteBuffer buffer  = ByteBuffer.allocate(128);
        CharBuffer buff = CharBuffer.allocate(128);
        buff.put(content);
        buffer.put(content.getBytes());
        buff.flip();
        buffer.flip();
        while(buffer.hasRemaining()){
            //在文件后添加内容

            channel.write(buffer,channel.size());
        }
        channel.close();
    }

    @Test
    public void socketChannelTest() throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        boolean connected = socketChannel.connect(new InetSocketAddress("localhost", 8080));
        readChannel(socketChannel);
    }

    @Test
    public void serverSocketChannelTest() throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(9999));
        while(true){
            SocketChannel accept = serverSocketChannel.accept();
            readChannel(accept);
        }
    }

    @Test
    public void serverSocketChannelTestRequest() throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 9999));
        ByteBuffer buffer = ByteBuffer.allocate(255);
        buffer.put("xxxxxxxxxxxxxxxxx".getBytes());
        buffer.flip();
        socketChannel.write(buffer);
        socketChannel.close();
    }


    public void readChannel(ReadableByteChannel channel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(255);

        int byteRead = channel.read(buffer);
        while (byteRead!=-1){
            System.out.println("---------------------------");
            System.out.println("Read："+byteRead);
            buffer.flip();

            while(buffer.hasRemaining()){
                System.out.print((char)buffer.get());
            }

            buffer.clear();
            byteRead = channel.read(buffer);
        }
    }


}
