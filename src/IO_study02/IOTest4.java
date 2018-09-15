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
import java.io.OutputStream;
import java.util.Map;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author Administrator
 */
public class IOTest4 {
    
      
    
    public static void main(String[] args) throws FileNotFoundException {
        File src = new File("bank.csv");
        InputStream is =null;
        String[] srcc = new String[45212];
        int i = 0;
        try{
            is = new FileInputStream(src);
            byte[] msg = new byte[1024];
            int len = -1;
            
            while((len=is.read(msg))!=-1){
                srcc[i++] = new String(msg,0,len);
                System.out.println(srcc[i-1]);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                if(null!=is){
                    is.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            }

    }
}
