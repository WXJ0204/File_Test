/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_study02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Administrator
 */
public class IOTest05 {
    public static void main(String[] args) {
        File src =  new File("bank.csv");
        
        try{
        Reader reader = new FileReader(src);
        char[] flush = new char[1024];
        int len = -1;
        while((len=reader.read(flush))!=-1){
    
            String str = new String(flush,0,len);
            System.out.println(str);
        }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
