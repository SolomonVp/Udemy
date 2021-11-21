package com.company.NIO.Channel_Buffer;

// Buffer - это блок памяти, в который мы можем записывать информацию, а так же читать её.
// В отличие от стримов Channel может как читать файл, так и записывать в него.

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

// Чтение файла: Channel читает информацию из файла и записывает её в Buffer.
// Запись файла: Channel читает информацию из Buffer и записывает её в файл.
public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
            FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(23);
            StringBuilder stix = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Reade: " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char)buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);

            }
            System.out.println(stix);

            System.out.println("****************************************************************************************");

            String text = "\n Обо мне много говорят,каждый день, каждую секунду. \n Я разный,такой каким чувствуете меня Вы!";
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);



//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
