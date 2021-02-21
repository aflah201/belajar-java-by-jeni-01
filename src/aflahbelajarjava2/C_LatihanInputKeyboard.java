package aflahbelajarjava2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class C_LatihanInputKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader
        (System.in));
        
        String name1 = "";
        System.out.print("Silahkan Masukkan Nama Anda : ");
        
        try{
            name1 = dataIn.readLine();
        }catch(IOException e){
            System.out.print("Error");
        }
        BufferedReader dataIn1 = new BufferedReader(new InputStreamReader
        (System.in));
        
        String name2 = "";
        System.out.print("Silahkan Masukkan Nama Anda : ");
        
        try{
            name2 = dataIn1.readLine();
        }catch(IOException e){
            System.out.print("Error");
        }
        BufferedReader dataIn2 = new BufferedReader(new InputStreamReader
        (System.in));
        
        String name3 = "";
        System.out.print("Silahkan Masukkan Nama Anda : ");
        
        try{
            name3 = dataIn1.readLine();
        }catch(IOException e){
            System.out.print("Error");
        }
        System.out.print(name1);
        System.out.print(" ");
        System.out.print(name2);
        System.out.print(" ");
        System.out.print(name3);
        System.out.println();
    }
    
}
