/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello.world;
import java.io.*;
/**
 *ниже я описываю класс, который называется HelloWorld, который 
 * выведет мне на экран ХэллоВорлд
 *  
 */
public class HelloWorld { 

    /**
     * метод выводящий ХэллоуВролд
     */
    public static void main(String[] args) {
       // TODO code application logic here
        final String FilePath = "D:\\GitHubRepository\\start-java\\Hello World\\HelloWorld.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(FilePath)); 
            String text = in.readLine(); 
            in.close();
            System.out.println(text);
        }
        catch (IOException e){
            System.out.println("File is not find");
        }
         
        
    }
    
}