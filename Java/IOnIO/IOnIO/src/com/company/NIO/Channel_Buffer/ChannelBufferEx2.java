package com.company.NIO.Channel_Buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
            FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();                                  // метод .rewind поместит позицию на ячейку ноль
            System.out.println((char)buffer.get());
            System.out.println("****************************************************************************************");

            buffer.compact();                                 // не перезаписывая читает байт на котором остановились
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char)buffer.get());
            }
            System.out.println("****************************************************************************************");

            buffer.clear();                                  // переводим позицию на 0
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();                                   // отметка чтобы потом вернуться на эту позицию
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();                                  // возвращает на позицию, которую пометили методом .mark
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
