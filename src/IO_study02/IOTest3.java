/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_study02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *文件字节输出流、
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放
 * @author Administrator
 */
public class IOTest3 {
    public static void main(String[] args) {
        //1
        File dest = new File("bank.txt");
        //2
        OutputStream os = null;
        try{
            os = new FileOutputStream(dest,true);
            
            String msg = "IOIOIO";
            byte[] datas = msg.getBytes();//编码
            os.write(datas,0,datas.length);
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                if(null!=os){
                    os.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
