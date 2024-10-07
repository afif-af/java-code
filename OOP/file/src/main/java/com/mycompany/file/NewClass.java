package com.mycompany.file;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        
        try
        {
            //folder Create
             File fi= new File("D:\\java code\\fileExample");
             fi.mkdir();
             System.out.println(fi.getAbsoluteFile());
             //fi.delete();
             
             //File Create
             File file=new File("D:\\java code\\fileExample\\fileName.txt");
                  file.createNewFile();
                  
                                  
             //file Write
             FileWriter fw=new FileWriter("D:\\java code\\fileExample\\fileName.txt");
             Scanner input=new Scanner(System.in);
             fw.write(input.nextLine());
             fw.close();
             
             //file Read
             File fr=new File ("D:\\java code\\fileExample\\fileName.txt");
             
             Scanner in=new Scanner(fr);
             System.out.println(in.nextLine());
             in.close();
             
             
             
       
        }catch(Exception e)
        {
            System.out.println(e);
        }
       
        
    }
   
}
