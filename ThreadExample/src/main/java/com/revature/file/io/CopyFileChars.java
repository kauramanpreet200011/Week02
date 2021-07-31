package com.revature.file.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileChars {
    public static void main(String args[]) throws IOException {
          FileReader in = null;
          FileWriter out = null;

 

          try {
             in = new FileReader("abc.txt");
             out = new FileWriter("abc_copyfilechars.txt");
             
             int c;
             while ((c = in.read()) != -1) {
                out.write(c);
             }
          }finally {
             if (in != null) {
                in.close();
             }
             if (out != null) {
                out.close();
             }
          }
       }
}