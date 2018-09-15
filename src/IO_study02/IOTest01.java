/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *理解操作步骤
 * 1、创建源
 * 2、选择流
 * 
 * @author Administrator
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
        //1、创建源
        File src = new File("bank.csv");
        InputStream is =null;
        try {
            //2、选择流
            is = new FileInputStream(src);
            //3、读取
            int temp;
            while((temp=is.read())!=-1)
            System.out.println((char)temp);
            //4、释放资源
            is.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOTest01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IOTest01.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(null!=is)
            is.close();
        }
        
    }
}
