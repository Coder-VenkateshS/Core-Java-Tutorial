package files;

import java.io.FileInputStream;

public class FileInputStreamExample2 {

    public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("C:\\Users\\vinot\\Documents\\FACE\\JAVA\\javatutorial\\javatutorial\\testout.txt");    
         
          int i=0;    
          while((i=fin.read())!=-1){    
           System.out.print((char)i);    
          }    
          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
      }  