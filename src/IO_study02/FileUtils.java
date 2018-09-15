/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_study02;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *1、封装拷贝
 * @author Administrator
 */
public class FileUtils {
    public static void main(String[] args) {
        //文件到文件
        try{
        InputStream is = new FileInputStream("bank.csv");
        OutputStream os = new FileOutputStream("hhh2.csv");
            copy(is, os);
        }catch(IOException e){
            e.printStackTrace();
        }
        byte[] datas =null;
        
        //文件到字节数组
        try{
        InputStream is = new FileInputStream("bank.csv");
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        copy(is, os);
        datas = os.toByteArray();
            System.out.println(datas.length);
        }catch(IOException e){
            e.printStackTrace();
        }
        //字节数组到文件
        try{
        InputStream is = new ByteArrayInputStream(datas);
        OutputStream os = new FileOutputStream("test~copy");
        copy(is, os);


        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    /**
     * //对接输入输出流
     * @param is
     * @param os 
     */
    public static void copy(InputStream is,OutputStream os)
    {
        try{
            byte[] flush = new  byte[1024];
            int len = -1;
            while ((len=is.read(flush))!=-1) {                
                os.write(flush, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            close(is,os);
        }
             
    }
    
    
    /**
     * 释放资源
     * @param ios
     */
    public  static void close(Closeable...ios){
        for(Closeable io:ios){
            try{
                if(null!=io){
                    io.close();
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
